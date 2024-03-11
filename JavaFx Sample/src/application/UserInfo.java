package application;

public class UserInfo {
	
	
	private static final UserInfo instance = new UserInfo();
	
	private String Name, userName, Age, Phone, Country, Passport;
	
	private UserInfo(){}
	
	public static UserInfo getInstance() {
		
		return instance;
	}
	

	public void setUserInfo(String one, String two, String three, String four, String five, String six) {
		
		Name = one;
		userName = two;
		Age = three;
		Phone = four;
		Country = five;
		Passport = six;
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
	
	public void setUserName(String a) {
		
		   userName = a;
		  }
	
	public void displayName(String userName) {
		
		//nameLabel.setText("Welcome " + userName);
	}

}
