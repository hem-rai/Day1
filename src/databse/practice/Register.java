package databse.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Register {

    public static void createDatabase(String dbname) throws SQLException {
        try (Connection conn = DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/", "root", "Youchucokpa1");
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate("CREATE DATABASE " + dbname);
            System.out.println("Database '" + dbname + "' created successfully!");
        }
    }

    public static void createTable(String dbname, String tbname) throws SQLException {
        // Connect to the specific database
        try (Connection conn = DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/" + dbname, "root", "Youchucokpa1");
             Statement stmt = conn.createStatement()) {

            // Create a simple table with id and name
            String sql = "CREATE TABLE " + tbname +
                         " (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50))";

            stmt.executeUpdate(sql);
            System.out.println("Table '" + tbname + "' created successfully!");
        }
    }
}
