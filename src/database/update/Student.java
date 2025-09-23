package database.update;

import java.sql.*;

public class Student {

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/demo_db", "root", "Youchucokpa1");
    }

    void getAllRecords() throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM users");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " | " + 
                rs.getString("name") + " | " + 
                rs.getString("email")
            );
        }

        rs.close();
        ps.close();
    }

    public static void main(String[] args) throws SQLException {
        new Student().getAllRecords();
    }
}
