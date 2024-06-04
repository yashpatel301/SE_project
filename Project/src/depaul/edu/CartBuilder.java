package depaul.edu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartBuilder {
    private Cart cart;
    private Connection connection;

    public CartBuilder(Connection connection) {
        this.connection = connection;
        this.cart = Cart.getInstance();
    }

    public CartBuilder addProductById(int productId) {
        String query = "SELECT * FROM products WHERE idProducts = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, productId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Product product = new Product(
                    rs.getInt("idProducts"),
                    rs.getString("name"),
                    rs.getDouble("price"),
                    rs.getString("category")
                );
                cart.addItem(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this;
    }

    public Cart build() {
        return cart;
    }
}
