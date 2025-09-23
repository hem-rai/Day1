package jdbc;

public class MainUser {



		    public static void main(String[] args) {

		        // Create DAO object
		        Dao dao = new Dao();

		        // Insert a user
		        dao.insertRecord(3, "Hem", "hem@example.com");

		        // Insert another user
		        dao.insertRecord(4, "Reshma", "reshma@example.com");

		        System.out.println("User insertion completed.");
		    }
		}

		
		
		
		
		
		
	