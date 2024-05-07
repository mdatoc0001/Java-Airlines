package application;

public class UserInfo {
	
	
	private static final UserInfo instance = new UserInfo();
	
	private String Name, userName, Phone, Country, Passport, Password;
	int Age = 0;
	
	private UserInfo(){}
	
	public static UserInfo getInstance() {
		
		return instance;
	}
	
	public void setUserInfo(String one, String two, int three, String four, String five, String six, String seven) {
		
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
	public int getAge() {
		
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
	
	// Sets user name
	public void setUserName(String a) {
		
		userName = a;
	}
	
	public void displayName(String userName) {
		
		//nameLabel.setText("Welcome " + userName);
	}

}
