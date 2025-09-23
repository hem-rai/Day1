package databse.practice;

import java.util.Scanner;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the Database:");
        String dbname = sc.nextLine();
        Register.createDatabase(dbname);

        System.out.println("Enter the name of the table:");
        String tbname = sc.nextLine();
        Register.createTable(dbname, tbname);

        sc.close();
    }
}
