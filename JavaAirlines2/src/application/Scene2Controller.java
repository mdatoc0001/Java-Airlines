package application;

import java.io.IOException;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileReader;



public class Scene2Controller {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
   
   //
   private Flight selectedFlight;
   
   public void setSelectedFlight(Flight flight) {
       this.selectedFlight = flight;
   }
   
   private Flight[] flights1;
   private Flight[] flights2;
   
   UserInfo data = UserInfo.getInstance();
	
	

	@FXML
	Label nameLabel;
	
	@FXML
	Label Label1;
	
	@FXML
	Label FlightLabel;
	@FXML
	Label FlightLabel2;
	
	//@FXML
	//GridPane grid3;
	@FXML
	Label nameLabel2,departAirportLabel,arrivalAirportLabel,departDateLabel,arrivalDateLabel,departTimeLabel,arrivalTimeLabel,terminalLabel;
	@FXML
	Label gateLabel,totalSeatsLabel,takenSeatsLabel,availableSeatsLabel,costLabel,durationLabel,bookStatusLabel;


	

	
public void Reservation(ActionEvent event) throws IOException {

	FXMLLoader loader = new FXMLLoader(getClass().getResource("AirportSelection.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}


public void UserDetails(ActionEvent event) throws IOException {
	
	
	Label1.setText("Details:\n" + "Name: " + data.getName() + "\n" +
	"Username: " + data.getUserName() + "\n" + 
	"Age: " + data.getAge() + "\n" +
	"Phone: " + data.getPhone() + "\n" + 
	"Country: " + data.getCountry() + "\n" + 
	"Passport: " + data.getPassport() + "\n" );
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

public void LAX(ActionEvent event) throws IOException {
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

	//System.out.println(LAX);
    
	FXMLLoader loader = new FXMLLoader(getClass().getResource("LAXAirport.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void JFK(ActionEvent event) throws IOException {
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	
	//System.out.println(LAX);
    
	FXMLLoader loader = new FXMLLoader(getClass().getResource("JFKAirport.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}

public void Back2(ActionEvent event) throws IOException {
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	
	
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}

}
