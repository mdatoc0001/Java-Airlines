package application;

import java.io.IOException;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileReader;



public class Scene2Controller {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	FlightParser parser = new FlightParser();
	String fileName1 = "src//application//Flight1.txt";
	String filePath = fileName1; // Path to Text file
	Flight userFlight;
	
	UserInfo data = UserInfo.getInstance();
	Flight details = Flight.getInstance();
	
	boolean LAX = true;

	@FXML
	Label nameLabel;
	
	@FXML
	Label Label1;
	
	@FXML
	Label FlightLabel;
	@FXML
	Label FlightLabel2;

	

	
public void Reservation(ActionEvent event) throws IOException {
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	
    
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
	LAX = true;
	//System.out.println(LAX);
	FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightSelection.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void JFK(ActionEvent event) throws IOException {
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	LAX = false;
	//System.out.println(LAX);
	FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightSelection2.fxml"));
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

public void Back3(ActionEvent event) throws IOException {
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	
	
	FXMLLoader loader = new FXMLLoader(getClass().getResource("AirportSelection.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}

public void Flight1(ActionEvent event) throws IOException {
	int userNum = -1;
		userNum = 0;
		parseMethod(userNum);

	FXMLLoader loader = new FXMLLoader(getClass().getResource("PrintFlightInfo.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void Flight2(ActionEvent event) throws IOException {
	int userNum = -1;
		userNum = 1;
		parseMethod(userNum);

	FXMLLoader loader = new FXMLLoader(getClass().getResource("PrintFlightInfo.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void Flight3(ActionEvent event) throws IOException {
	int userNum = -1;
		userNum = 2;
		parseMethod(userNum);

	FXMLLoader loader = new FXMLLoader(getClass().getResource("PrintFlightInfo.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void Flight4(ActionEvent event) throws IOException {
	int userNum = -1;
		userNum = 3;
		parseMethod(userNum);

	FXMLLoader loader = new FXMLLoader(getClass().getResource("PrintFlightInfo.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void parseMethod(int num) throws IOException {
	
try {
    List<Flight> flights = parser.readFlightsFromTXT(filePath);
    
    if(num == 0) {

    Flight flight1 = flights.get(0);
    System.out.println("First Flight:");
    System.out.println(flight1);
    
    userFlight = flight1;
    System.out.println("User Flight:");
    //System.out.println(userFlight);
    //System.out.println(userFlight.getName());
    details.setFlight(flight1);
    details.setBookStatus("false");
    //System.out.println(details.getBookStatus());
    
    }
    if(num == 1) {
    	
    Flight flight2 = flights.get(1);
    System.out.println(flights.get(1).getName());
    System.out.println(flight2);
    
    details.setFlight(flight2);
    }
    if(num == 2) {
    	
    Flight flight3 = flights.get(2);
    System.out.println("Third Flight:");
    System.out.println(flight3);
    
    details.setFlight(flight3);
    }
    if(num == 3) {

    Flight flight4 = flights.get(3);
    System.out.println("Fourth Flight:");
    System.out.println(flight4);
    
    details.setFlight(flight4);
    }
    
	} catch (IOException e) {
		System.err.println("Error reading flights from CSV: " + e.getMessage());
	} catch (IndexOutOfBoundsException e) {
		System.err.println("Requested index is out of bounds: " + e.getMessage());
	}
}

public void FlightDetails(ActionEvent event) throws IOException {
	
	
	FlightLabel.setText(
			"Flight Number: " + details.getName() + "\n" +
			"Departure Airport: " + details.getDepartAirport() + "\n" +
			"Arrival Airport: " + details.getArrivalAirport() + "\n" +
			"Departure Date: " + details.getDepartDate() + "\n" +
			"Arrival Date: " + details.getArrivalDate() + "\n" +
			"Departure Time: " + details.getDepartTime() + "\n" +
			"Arrival Time: " + details.getArrivalTime() + "\n" +
			"Terminal: " + details.getTerminal());
	FlightLabel2.setText(
			
			"Gate: " + details.getGate() + "\n" +
			"Total Seats: " + details.getTotalSeats() + "\n" +
			"Taken Seats: " + details.getTakenSeats() + "\n" +
			"Available Seats: " + details.getAvailableSeats() + "\n" +
			"Cost: " + details.getCost() + "\n" +
			"Duration: " + details.getDuration() + "\n" +
			"Booking Status: " + details.getBookStatus());

}
}

