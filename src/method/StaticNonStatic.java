package method;

// Static methods can call other static methods directly.
// But to call a non-static method, we need to create an object.

public class StaticNonStatic {

    public static void main(String[] args) {
        int collection = sum(20, 30);
        System.out.println(collection);

        StaticNonStatic obj = new StaticNonStatic();

        boolean isEven = obj.checkEven(collection);

        System.out.println("The number is " + (isEven ? "even" : "odd"));
    }

    static int sum(int x, int y) {
        int result = x + y;
        return result;
    }

    boolean checkEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
