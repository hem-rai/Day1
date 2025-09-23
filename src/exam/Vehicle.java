package exam;

class Vehicle {
    public void start() {
        System.out.println("Tututtut.");
    }

}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("bhrummm bhrummm.");
    }
 
 
}
