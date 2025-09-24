package sql.practic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Memo {

    private static final String url = "jdbc:mysql://localhost:3306/demo_db"; // fixed jdbc
    private static final String username = "root";
    private static final String password = "Youchucokpa1";

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    void insertRecord(int id, String name, String email) {
        String sql = "INSERT INTO users (id, name, email) VALUES (?, ?, ?)";

        try (Connection conn = Memo.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // for testing
    public static void main(String[] args) {
        Memo memo = new Memo();
   
        
        
        System.out.println("Hello Jhon Doe");
        
        
        System.out.println("Hello This is Hem Rai");
        System.out.println("Could you introduce by yourself?");
        
    }
}
