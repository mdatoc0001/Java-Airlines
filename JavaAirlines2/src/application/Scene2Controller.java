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
	
	//private GridPane grid3;
	//private Scene flightInfoScene;
	
	private Airport lax = new Airport("LAX");
   private Airport jfk = new Airport("JFK");
	
	//FlightParser parser = new FlightParser();
	//String fileName1 = "src//application//Flight1.txt";
	//String filePath = fileName1; // Path to Text file
	//Flight userFlight;
	//Flight details = Flight.getInstance();
	
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
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	// Create a grid pane for displaying flight information
    //this.grid3 = new GridPane();
    //this.flightInfoScene = new Scene(grid3, 400, 600);

    
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
	
    lax.makeFlight("Flight1", "LAX", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
      "Terminal17", 1, 150, 50, 100, "$200", "2 hours", false);

    lax.makeFlight("Flight2", "LAX", "JFK", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
      "Terminal100", 1, 150, 50, 100, "$200", "2 hours", false);


	FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightSelection.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void JFK(ActionEvent event) throws IOException {
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	
	//System.out.println(LAX);
	
    jfk.makeFlight("Flight3", "JFK", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
      "Terminal78", 1, 150, 50, 100, "$200", "2 hours", false);

    jfk.makeFlight("Flight4", "JFK", "LAX", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
      "Terminal54", 1, 150, 50, 100, "$200", "2 hours", false);
    
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

public void Back4(ActionEvent event) throws IOException {
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	
	
	FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightSelection.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}

public void Flight1(ActionEvent event) throws IOException {
	Flight[] flights = lax.getFlights();
    if (flights.length > 0) {
        
        displayFlightInfo(flights[0]);
        
    } else {
        System.out.println("No flights available for LAX.");
    }
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightInfo.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void Flight2(ActionEvent event) throws IOException {
	
	Flight[] flights = lax.getFlights();
    if (flights != null && flights.length > 1) {
        //grid3.getChildren().clear(); // Clear previous labels

        displayFlightInfo(flights[1]);
        //stage.setScene(flightInfoScene);
    } else {
        System.out.println("No second flight available for LAX.");
        return; // no flights available
    }
   
   FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightInfo.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void Flight3(ActionEvent event) throws IOException {
	Flight[] flights = jfk.getFlights();
    if (flights.length > 0) {
        
        displayFlightInfo(flights[0]);
        
    } else {
        System.out.println("No flights available for JFK.");
    }
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightInfo.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void Flight4(ActionEvent event) throws IOException {
	
	Flight[] flights = jfk.getFlights();
    if (flights != null && flights.length > 1) {
        //grid3.getChildren().clear(); // Clear previous labels

        displayFlightInfo(flights[1]);
        //stage.setScene(flightInfoScene);
    } else {
        System.out.println("No second flight available for JFK.");
        return; // no flights available
    }
   
   FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightInfo.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
public void Forward(ActionEvent event) throws IOException {
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	
	
	FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightInfo.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}

private void displayFlightInfo(Flight flight) {   
    
    // Create labels for each variable of Flight
     nameLabel.setText("Flight Number: " + flight.getName());
     departAirportLabel.setText("Departure Airport: " + flight.getDepartAirport());
     arrivalAirportLabel.setText("Arrival Airport: " + flight.getArrivalAirport());
     departDateLabel.setText("Departure Date: " + flight.getDepartDate());
     arrivalDateLabel.setText("Arrival Date: " + flight.getArrivalDate());
     departTimeLabel.setText("Departure Time: " + flight.getDepartTime());
     arrivalTimeLabel.setText("Arrival Time: " + flight.getArrivalTime());
     terminalLabel.setText("Terminal: " + flight.getTerminal());
     gateLabel.setText("Gate: " + flight.getGate());
     totalSeatsLabel.setText("Total Seats: " + flight.getTotalSeats());
     takenSeatsLabel.setText("Taken Seats: " + flight.getTakenSeats());
     availableSeatsLabel.setText("Available Seats: " + flight.getAvailableSeats());
     costLabel.setText("Cost: " + flight.getCost());
     durationLabel.setText("Duration: " + flight.getDuration());
     bookStatusLabel.setText("Booking Status: " + (flight.getBookStatus() ? "Booked" : "Available"));

 }
}
