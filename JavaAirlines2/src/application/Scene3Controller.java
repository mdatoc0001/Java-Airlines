package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Scene3Controller{
	UserInfo data = UserInfo.getInstance();
	
	@FXML Label confirm;
	@FXML
	TextField nameTextField2;
	@FXML
	TextField UserNameTextField;
	@FXML
	TextField AgeTextField;
	@FXML
	TextField phoneNumTextField;
	@FXML
	TextField PassportTextField;
	@FXML
	TextField PasswordTextField;
	@FXML
	Label errorPrompt2;
	@FXML
	Label errorName,errorUsername,errorAge,errorPhone,errorPassport,errorPassword;
	@FXML
	ChoiceBox<String> myChoiceBox;
	
	boolean nameCheck,userCheck,ageCheck,phoneCheck,passportCheck,passwordCheck = false;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	int age;
	
	private static final Pattern PHONE_CHAR = Pattern.compile(
	        "^\\+?[0-9 ()-]+$" 
	    );
	
	private static final Pattern PASSPORT_PATTERN = Pattern.compile("^E0000\\d{4}$");

	
	public void CreateProfile(ActionEvent event) throws IOException {
		//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		String name = nameTextField2.getText();
		String userName = UserNameTextField.getText();
		String Age = AgeTextField.getText();
		String phoneNum = phoneNumTextField.getText();
		String Country = "USA";
		String Passport = PassportTextField.getText();
		String Password = PasswordTextField.getText();
		
		
		try {
            age = Integer.parseInt(Age);
            if (age < 1) {
            	
            	errorAge.setText("Must be larger than 0");
            }
            else {
            	
            	errorAge.setText("Age Checked");
            	ageCheck = true;
            }
        } catch (NumberFormatException e) {
        	errorAge.setText("Not a number");
        }
		
		if(CheckSpace(name)) {
			
			errorName.setText("Name checked");
			nameCheck = true;
		}
		else {
			errorName.setText("First and Last Name Required");
		}
		if(userName.length() > 4 && userName.length() < 21) {
			
			errorUsername.setText("Username checked");
			userCheck = true;
		}
		else {
			errorUsername.setText("Username not within 5 to 20\nCharacters");
		}
		if(isValidPhoneNumber(phoneNum)) {
			
			errorPhone.setText("Phone checked");
			phoneCheck = true;
		}
		else {
			errorPhone.setText("Re-Enter Phone Number");
		}
		if(isMatchingPattern(Passport)) {
			
			errorPassport.setText("Passport checked");
			passportCheck = true;
		}
		else {
			errorPassport.setText("Re-Enter Passport");
		}
		if(Password.length() > 6 && Password.length() < 21) {
			
			errorPassword.setText("Password checked");
			passwordCheck = true;
		}
		else {
			errorPassword.setText("Password not within 7 to 20\nCharacters");
		}
		
		if (nameCheck && userCheck && ageCheck && phoneCheck && passportCheck && passwordCheck) {
			confirm.setText("Profile Created!");
			data.setUserInfo(name, userName, age, phoneNum, Country, Passport, Password);
		} else {
			confirm.setText("Profile Not Created, please check warnings");
		}

	}
	
	public void loginPage(ActionEvent event) throws IOException {
		
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
		root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	public void Back(ActionEvent event) throws IOException {
		//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
		root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
	}
	
	 public static boolean CheckSpace(String str) {
	        int spaceCount = 0;

	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == ' ') {
	                spaceCount++;
	            }
	        }

	        return spaceCount == 1; 
	    }
	 
	 public static boolean isValidPhoneNumber(String phoneNumber) {
	        if (phoneNumber == null || phoneNumber.isEmpty()) {
	            return false; 
	        }

	        Matcher matcher = PHONE_CHAR.matcher(phoneNumber);
	        return matcher.matches(); 
	    }
	 public static boolean isMatchingPattern(String input) {
	        if (input == null) {
	            return false; 
	        }

	        Matcher matcher = PASSPORT_PATTERN.matcher(input); 
	        return matcher.matches(); 
	    }

}
