package hascode;

import java.util.Objects;

public class Dog1 {

	private String name;
	private int age;
	private int price;

	public Dog1(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog1 other = (Dog1) obj;
		return age == other.age && Objects.equals(name, other.name) && price == other.price;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dog1 [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
	
	
	

}
