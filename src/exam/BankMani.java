package exam;

public class BankMani {

	public static void main(String[] args) {
	
	
		        Bank sbi = new SBI();
		        Bank hdfc = new HDFC();

		        System.out.println("SBI Interest Rate: " + sbi.rateOfInterest() + "%");
		        System.out.println("HDFC Interest Rate: " + hdfc.rateOfInterest() + "%");
	
		
		
		
		
		
	}

}
