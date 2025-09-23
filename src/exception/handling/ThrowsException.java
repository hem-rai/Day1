package exception.handling;

import java.util.Scanner;

public class ThrowsException {

    private static String takeInput() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the guest name:");
        String name = scanner.nextLine();

        if (name.equals("agile")) {
            throw new Exception("Sorry, agile is not permitted");
        }

        return name;
    }

    public static void main(String[] args) {
        String name = null;

        try {
            name = takeInput();
        } catch (Exception e) {
            e.printStackTrace();
            return; // exit if exception occurs
        }

        System.out.println("Hello Name " + name);
        System.out.println("Main Thanks end");
    }
}
