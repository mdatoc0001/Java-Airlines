package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Scene2Controller {
	
	UserInfo data = UserInfo.getInstance();

	@FXML
	Label nameLabel;
	
	@FXML
	Label Label1;

	
public void UserDetails(ActionEvent event) throws IOException {
		
		
	Label1.setText("Details:\n" + "Name: " + data.getName() + "\n" +
	"Username: " + data.getUserName() + "\n" + 
	"Age: " + data.getAge() + "\n" +
	"Phone: " + data.getPhone() + "\n" + 
	"Country: " + data.getCountry() + "\n" + 
	"Passport: " + data.getPassport() + "\n" );
	}
	
}
