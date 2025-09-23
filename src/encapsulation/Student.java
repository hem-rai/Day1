package encapsulation;

public class Student {
	
	private String name = "Divya";
	private int age = 21;
	private int id = 3523 ;
	private String password = "test";
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	
	
	//how to restrict id from invalid id (non negative)
	public void setId(int id) {
		
		if (id>0) {
		
		
		this.id = id;
		
		
		}else {
			
			System.out.println("Please enter valid number of id");
		}
	}
	
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	
	
	
	

}
