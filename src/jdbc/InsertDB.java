package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDB {

    public static void main(String[] args) {

        // Database URL, username, and password
        String jdbcURL = "jdbc:mysql://localhost:3306/demo_db"; // Replace 'demo_db' with your database name
        String username = "root"; // Replace with your database username
        String password = "Youchucokpa1"; // Replace with your database password
        Connection connection = null;

        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to the database!");

            // Step 3: Create SQL INSERT statement
            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Step 4: Set parameter values
            preparedStatement.setString(1, "Hem.Rai");   // Example name
            preparedStatement.setString(2, "hem.rai@gmail.com"); // Example email

            // Step 5: Execute update
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }

            // Close the statement
            preparedStatement.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Step 6: Close the connection
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection closed.");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
