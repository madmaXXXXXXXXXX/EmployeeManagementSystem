package net.javaguides.usermanagement.dao;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class DatabaseConnection {
	

	public static Connection initializeDatabase() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String dbDriver = "com.mysql.cj.jdbc.Driver"; 
	    String dbURL = "jdbc:mysql:// localhost:3306/"; 
	    // Database name to access 
	    String dbName = "user"; 
	    String dbUsername = "root"; 
	    String dbPassword = "root"; 

	    Class.forName(dbDriver); 
	    Connection con = null;
		try {
			con = DriverManager.getConnection(dbURL + dbName, 
			                                             dbUsername,  
			                                             dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    return con; 
} 

}
