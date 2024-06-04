package depaul.edu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecution {
    private DatabaseConnection dbConnection;

    public QueryExecution(String dbname, String username, String password) {
        this.dbConnection = new DatabaseConnection(dbname, username, password);
    }

    public void executeUpdate(String sql) {
        try (Connection conn = dbConnection.conn();
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Executed update: " + sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String sql) {
        try {
            Connection conn = dbConnection.conn();
            Statement stmt = conn.createStatement();
            return stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Connection getConnection() {
        return dbConnection.conn();
    }

    public void closeConnection() {
        try {
            Connection conn = dbConnection.conn();
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
