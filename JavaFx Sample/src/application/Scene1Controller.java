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

public class Scene1Controller {
	
	
	UserInfo data = UserInfo.getInstance();
	@FXML
	Label errorPrompt;
	@FXML
	TextField nameTextField;

	private Stage stage;
	private Scene scene;
	private Parent root;
	private String userName = null;
	
	public void login(ActionEvent event) throws IOException {
		//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		//String userName = nameTextField.getText();
		try {

			userName = data.getUserName();

		}

		catch (NumberFormatException e){

			errorPrompt.setText("Unable to get name");

		}

		
		
		if(userName == null) {
			errorPrompt.setText("Account doesn't exist, Create account");
		}
		else {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
			root = loader.load();
			 
			
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}
	public void CreateAccount(ActionEvent event) throws IOException {
		//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene3.fxml"));
		root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
