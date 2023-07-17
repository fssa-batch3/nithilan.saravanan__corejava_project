package day04.Solved;

public class ToStringDemo {
	public static void main(String[] args) {
		// create Account using Setter methods and Default constructor
		Account3 acct1 = new Account3();
		acct1.setAccNo("A101");
		acct1.setName("Naresh");
		acct1.setBalance(1000);
		
		System.out.println(acct1);
		
		// Create Account using toString method
		m acct2 = new m("A073", "Nitilan", 2000);
		System.out.println(acct2.toString());
		
	}
}