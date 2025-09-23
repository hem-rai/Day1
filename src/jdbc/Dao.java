package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {

    private static final String url = "jdbc:mysql://localhost:3306/demo_db";
    private static final String username = "root";
    private static final String password = "Youchucokpa1";

    static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }

    void insertRecord(int id, String name, String email) {

        try {
            String sql = "INSERT INTO users(id,name,email) VALUES(?, ?, ?)";
            Connection conn = Dao.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, email);

            int noOfModifiedRows = ps.executeUpdate();

            if (noOfModifiedRows > 0) {
                System.out.println("Inserted successfully");
            } else {
                System.out.println("Some issue with insertion");
            }

            ps.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Some exception .. details are ..");
            System.out.println(e.getMessage());
        }
    }
}
