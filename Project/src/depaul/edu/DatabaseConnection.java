package depaul.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private String dbname;
	//private String url = "jdbc:mysql://localhost:3306/"+dbname;
	private String username;
	private String password;
	public DatabaseConnection(String dbname, String username, String password) {
		this.dbname = dbname;
		this.username = username;
		this.password = password;
	}
	
	public Connection conn() {
		try {
			Connection conn = DriverManager.getConnection(dbname, username, password);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
	}
}