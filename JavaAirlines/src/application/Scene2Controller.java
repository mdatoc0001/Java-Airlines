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
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
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
	
public void Reservation(ActionEvent event) throws IOException {
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	
	
	FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneReservation.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}

public void Back(ActionEvent event) throws IOException {
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	
	
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
}
