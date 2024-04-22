package application;

public class UserInfo {
	
	
	private static final UserInfo instance = new UserInfo();
	
	private String Name, userName, Age, Phone, Country, Passport, Password;
	
	private UserInfo(){}
	
	public static UserInfo getInstance() {
		
		return instance;
	}
	

	public void setUserInfo(String one, String two, String three, String four, String five, String six, String seven) {
		
		Name = one;
		userName = two;
		Age = three;
		Phone = four;
		Country = five;
		Passport = six;
		Password = seven;
	}
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
	
	public void setUserName(String a) {
		
		   userName = a;
		  }
	
	public void displayName(String userName) {
		
		//nameLabel.setText("Welcome " + userName);
	}

}
