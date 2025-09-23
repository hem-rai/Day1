package database.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Dao {
    private static final String url = "jdbc:mysql://localhost:3306/demo_db";
    private static final String username = "root";
    private static final String password = "Youchucokpa1";

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    void insertRecord(int id, String name, String email) throws SQLException {
        String sql = "INSERT INTO users(id, name, email) VALUES(?, ?, ?)";

        try (Connection conn = Dao.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);

            int noOfModifiedRows = ps.executeUpdate();
            System.out.println(noOfModifiedRows + " row(s) inserted.");
        }
    }

    void fetchRecord() throws SQLException {
        String sql = "SELECT * FROM users";

        try (Connection conn = Dao.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {   // ✅ use executeQuery()

            while (rs.next()) {  // ✅ move cursor row by row
                int id = rs.getInt("id");           // fetch column by name
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println(id + " | " + name + " | " + email);
            }
        }
    }
    
    void updateRecord(int id, String newEmail) throws SQLException {
        String sql = "UPDATE users SET email = ? WHERE id = ?";

        try (Connection conn = Dao.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, newEmail); // first placeholder = new email
            ps.setInt(2, id);          // second placeholder = id

            int noOfModifiedRows = ps.executeUpdate();  // use executeUpdate
            System.out.println(noOfModifiedRows + " row(s) updated.");
        }
    }
    
    void delRecord(int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection conn = Dao.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);   // bind the id for deletion

            int noOfModifiedRows = ps.executeUpdate();  // use executeUpdate
            System.out.println(noOfModifiedRows + " row(s) deleted.");
        }
    }


    
    
}
