package random.practice;

public class Vehicle {

    public String brand = "Ford";

    public void honk() {
        System.out.println("Tutu, tututt");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myObj = new Car();

        // Call inherited method
        myObj.honk();

        // Print brand + modelName with a space
        System.out.println(myObj.brand + " " + myObj.modelName);
    }
}
