package depaul.edu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dbname = "jdbc:mysql://localhost:3306/se_project";
        String username = "root";
        String password = "root";

        QueryExecution dbExecutor = new QueryExecution(dbname, username, password);
        Logging logger = new Logging();

        System.out.println("SignIn or SignUp");
        String startOption = scanner.nextLine();
        if (startOption.equalsIgnoreCase("signup")) {
            System.out.println("Please enter new username");
            String newUsername = scanner.nextLine();
            System.out.println("Please enter new password");
            String newPassword = scanner.nextLine();
            
            String query = "INSERT INTO credentials (username, password) VALUES ('" + newUsername + "', '" + newPassword + "');";
            dbExecutor.executeUpdate(query);
            System.out.println("Signed up successfully!");
            logger.log("Signed up with Username: "+newUsername);
            
            System.out.println("Please enter your username");
            String oldUsername = scanner.nextLine();
            System.out.println("Please enter your password");
            String oldPassword = scanner.nextLine();

            SigninClass signinClass = SigninClass.getInstance();
            signinClass.signIn(oldUsername, oldPassword, dbname, username, password);
        } else if (startOption.equalsIgnoreCase("signin")) {
            while (true) {
                System.out.println("Please enter your username");
                String oldUsername = scanner.nextLine();
                System.out.println("Please enter your password");
                String oldPassword = scanner.nextLine();

                SigninClass signinClass = SigninClass.getInstance();
                boolean isSignedIn = signinClass.signIn(oldUsername, oldPassword, dbname, username, password);
                if (isSignedIn) {
                    System.out.println("Logged in");
                    logger.log("Logged in with Username: "+oldUsername);
                    break;
                } else {
                    System.out.println("Invalid credentials");
                    logger.log("Log in attempt fail with Username: "+oldUsername);
                }
            }
        } else {
            System.out.println("Wrong input");
            logger.log("Wrong input attempt as "+startOption);
            dbExecutor.closeConnection();
            System.exit(0);
        }

        Connection connection = dbExecutor.getConnection();

        CartBuilder cartBuilder = new CartBuilder(connection);
        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. View Category ");
            System.out.println("2. Add to cart ");
            System.out.println("3. View Cart ");
            System.out.println("4. Checkout ");
            System.out.println("5. Exit ");
            int option = scanner.nextInt();
            logger.log("Option chosen: "+option);
            scanner.nextLine();
            

            if (option == 1) {
            	System.out.println("Enter the category name you want to explore: ");
            	String cat = scanner.nextLine();
            	if (!cat.equalsIgnoreCase("Clothing") && !cat.equalsIgnoreCase("Toys") && !cat.equalsIgnoreCase("PetProducts") && !cat.equalsIgnoreCase("Electronics")) {
            		System.out.println("Invalid choice of category, please choose from [Clothing, Toys, PetProducts, Electronics]");
            		continue;
            	} else {
            		String query = "SELECT * FROM products WHERE Category = '"+cat+"';";
            		ResultSet rs = dbExecutor.executeQuery(query);
            		try {
            			while (rs.next()) {
	                        Product product = new Product(
	                            rs.getInt("idProducts"),
	                            rs.getString("name"),
	                            rs.getDouble("price"),
	                            rs.getString("category")
	                        );
	                        System.out.println(product);
            			}       
	                } catch (SQLException e) {
	                   e.printStackTrace();
	                }
            	}
            	logger.log("User searched for category: "+cat);
            } else if (option == 2) {
            	System.out.println("Enter product ID to add to cart:");
                int productId = scanner.nextInt();
                cartBuilder.addProductById(productId);
                System.out.println("Product added to cart");
                logger.log("User added product with product id "+productId);
            } else if (option == 3) {
                Cart cart = cartBuilder.build();
                System.out.println(cart);
                System.out.println("Total: $" + String.format("%.2f", cart.getTotal()));
                logger.log("User viewed cart");
            } else if (option == 4) {
                Cart cart = cartBuilder.build();
                System.out.println("Checkout: ");
                System.out.println(cart);
                System.out.println("Total: $" + String.format("%.2f", cart.getTotal()));
                
                System.out.println("Enter card number: ");
                String cardNum = scanner.nextLine();
                System.out.println("Enter card holder name");
                String cardHolder = scanner.nextLine();
                logger.log("User attempted to checkout with total bill of "+cart.getTotal()+ " with card number: "+ cardNum + " and card holder name: "+cardHolder);
                Checkout checkout = new Checkout(cardNum, cardHolder);
                boolean payment_confirmation = checkout.getCardDetails();
                if (payment_confirmation == true) {
                	System.out.println("Order placed successfully");
                }
                else {
                	System.out.println("Order couldnot be placed");
                }
                cart.getItems().clear();
                
            } else if (option == 5) {
                break;
            } else {
                System.out.println("Invalid option");
                logger.log("Invalid option chosen by user");
            }
        }
        dbExecutor.closeConnection();
        scanner.close();
    }
}
