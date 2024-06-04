package depaul.edu;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SigninClass {
    private static SigninClass instance;
    private Customer loggedInCustomer;
    private String db_host;
    private String db_user;
    private String db_pass;
    private boolean signedIn;

    private SigninClass() {}

    public static SigninClass getInstance() {
        if (instance == null) {
            instance = new SigninClass();
        }
        return instance;
    }

    public boolean signIn(String username, String password, String db_host, String db_user, String db_pass) {
        this.db_host = db_host;
        this.db_user = db_user;
        this.db_pass = db_pass;
        this.signedIn = authenticate(username, password);
        if (this.signedIn) {
            this.loggedInCustomer = new Customer(username);
        }
        return this.signedIn;
    }

    private boolean authenticate(String username, String password) {
        QueryExecution dbExecutor = new QueryExecution(db_host, db_user, db_pass);
        String query = "SELECT * FROM credentials WHERE username = '" + username + "' AND password = '" + password + "'";
        try {
            ResultSet resultSet = dbExecutor.executeQuery(query);
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Customer getLoggedInCustomer() {
        return loggedInCustomer;
    }
}
