package database.ex;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
	
	       Dao rec = new Dao();
	        
//	        try {
//	            rec.insertRecord(102, "shankhar", "shankhar@gmail.com");
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	        }
//	        
	        try {
	            rec.fetchRecord();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        try {
	            rec.updateRecord(101, "nyhemrai@gmail.com");
	        } catch (SQLException e) {

	        }
		
	        try {
	            rec.fetchRecord();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        try {
	            rec.delRecord(1);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        
	}

}
