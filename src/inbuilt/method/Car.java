package inbuilt.method;

public class Car {
int year;
String make;
int milage;
String color;



Car(int year, String make, int milage, String color){
	
	this.year = year;
	this.make = make;
	this.milage = milage;
	this.color = color;
}



@Override
public String toString() {
	return "Car [year=" + year + ", make=" + make + ", milage=" + milage + ", color=" + color + "]";
}




}

