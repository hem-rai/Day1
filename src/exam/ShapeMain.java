package exam;

public class ShapeMain {

	public static void main(String[] args) {
	
		
		Shape circle = new Circle(4.6);
		
		Shape rectangle = new Rectangle(4.6, 6.0);
		
		System.out.println("Area of circle :" + circle.area());
		System.out.println("Area of rectangle :" + rectangle.area());

	}

}
