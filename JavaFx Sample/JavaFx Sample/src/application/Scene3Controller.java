package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene3Controller {
	UserInfo data = UserInfo.getInstance();
	@FXML
	TextField nameTextField2;
	@FXML
	TextField UserNameTextField;
	@FXML
	TextField AgeTextField;
	@FXML
	TextField phoneNumTextField;
	@FXML
	TextField CountryTextField;
	@FXML
	TextField PassportTextField;
	@FXML
	Label errorPrompt2;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void CreateProfile(ActionEvent event) throws IOException {
		//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		String name = nameTextField2.getText();
		String userName = UserNameTextField.getText();
		String Age = AgeTextField.getText();
		String phoneNum = phoneNumTextField.getText();
		String Country = CountryTextField.getText();
		String Passport = PassportTextField.getText();
		
		data.setUserInfo(name, userName, Age, phoneNum, Country, Passport);
		
		errorPrompt2.setText("Account Created!");
		
		//FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
		//root = loader.load();
		 
		//UserInfo UserInfo = loader.getController();
		//UserInfo.setUserInfo(name, userName, Age, phoneNum, Country, Passport);
		

	}
	
	public void loginPage(ActionEvent event) throws IOException {
		
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
		root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
