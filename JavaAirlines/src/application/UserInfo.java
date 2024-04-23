package application;

public class UserInfo {
	
	
	private static final UserInfo instance = new UserInfo();
	
	private String Name, userName, Age, Phone, Country, Passport, Password;
	
	private UserInfo(){}
	
	public static UserInfo getInstance() {
		
		return instance;
	}
	
	public UserInfo (String[] userInfoData) {
    	
    	if (userInfoData.length == 7) {
    	
        this.Name = userInfoData[0];
        this.userName = userInfoData[1];
        this.Age = userInfoData[2];
        this.Phone = userInfoData[3];
        this.Country = userInfoData[4];
        this.Passport = userInfoData[5];
        this.Password = userInfoData[6];
        
    	} else {
            throw new IllegalArgumentException("Invalid flight data");
        }
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
	
	public String toString() {
	       return getName() + " " + getUserName() + " " + getAge() + " " + getPhone() + " " + getCountry() + " " + getPassport() + " " + getPassword();
	   }

}
