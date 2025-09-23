package random.practice;

public class Account {

	
	int id;
	String name;
	int balance;
	
	public Account() {
		
		id = 0;
		name = "Unknown";
		balance = 0;
	}
	
	public Account(int id, String name, int blance) {
		
		this.id = id;
		this.name = name;
		this.balance = blance;
	}
	
	
	public Account(int id, int blance) {
	
		this.id = id;
		this.balance = blance;
	}
	
	
	public void myMethod7(int ids, String names,int balances){
		
	this.id = ids;
	this.name = names;
	this.balance = balances;
	}
	
	
	
}
