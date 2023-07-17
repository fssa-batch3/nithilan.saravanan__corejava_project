package day03.Practice;



public class TestUser{
	public static void main(String[] args) {
//		instantiate object 
		User user = new User();
		
		//declearing names for the atribute
		User user1 = new User("Manoj","manojennumnaan","manoj@gmail.com");
	}
}
class User {
//	declaring methods
	private String name;
	private String password;
	private String emailId;
	
//	default constructor
	User(){}
	
//	here we overloaded constructor
	User(String name, String password, String emailId){
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}
	
}