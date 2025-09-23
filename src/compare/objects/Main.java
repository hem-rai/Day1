package compare.objects;

public class Main {

	public static void main(String[] args) {
		
		
		
		Student std1 = new Student("Prakash", 21, 400);
		Student std2 = new Student("Prakash", 21, 400);
		
		
		
		
		
		System.out.println(std1.equals(std2)); // false when equals() is not overridden, otherwise true.

	}

}
