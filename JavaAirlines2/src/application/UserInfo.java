package application;

public class UserInfo {
	
	// Creates instance of UserInfo Object
	private static final UserInfo instance = new UserInfo();
	
	// Declaring Variables
	private String Name, userName, Age, Phone, Country, Passport, Password;
	
	//Constructor with no parameters
	private UserInfo(){}
	
	// Get Method that return instance of UserInfo Object
	public static UserInfo getInstance() {
		
		return instance;
	}
	
	// Constructor with manual String parameters of User info details
	public void setUserInfo(String one, String two, String three, String four, String five, String six, String seven) {
		
		Name = one;
		userName = two;
		Age = three;
		Phone = four;
		Country = five;
		Passport = six;
		Password = seven;
	}
	
	// Getters
	public String getName() {
		return Name;
	}
	public String getUserName() {
		return userName;
	}
	public String getAge() {
		return Age;
	}
	public String getPhone() {
		return Phone;
	}
	public String getCountry() {
		return Country;
	}
	public String getPassport() {
		return Passport;
	}
	public String getPassword() {
		return Password;
	}
	
	// Sets UserName
	public void setUserName(String a) {
		userName = a;
	}

}
