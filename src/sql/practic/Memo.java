package sql.practic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Memo {

	private static final String url = "jbdc:mysql://localhost:3306/demo_db";
	private static final String username = "root";
	private static final String password= "Youchucokpa1";

	static Connection getConnection() throws SQLException {
		
		
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
		
	}
	
	void insertRecord (int id, String name, String email) {
		
		
		
	}
	
	
	
	
	
	
	

}
