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
   //
	
	//private GridPane grid3;
	//private Scene flightInfoScene;
	
	private Airport lax = new Airport("LAX");
   {
    lax.makeFlight("F1", "LAX", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
      "Terminal17", 1, 150, 50, 100, "$200", "2 hours", false);

    lax.makeFlight("F2", "LAX", "JFK", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
      "Terminal100", 1, 150, 50, 100, "$200", "2 hours", false);
    flights1 = lax.getFlights();
   }
      
   private Airport jfk = new Airport("JFK");
   {
    jfk.makeFlight("F3", "JFK", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal78", 1, 150, 50, 100, "$200", "2 hours", false);

    jfk.makeFlight("F4", "JFK", "LAX", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal54", 1, 150, 50, 100, "$200", "2 hours", false);
    flights2 = jfk.getFlights();
   }
	
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
	
	
	FXMLLoader loader = new FXMLLoader(getClass().getResource("AirportSelection.fxml"));
	root = loader.load();
   
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}

public void Flight1(ActionEvent event) throws IOException {
   //Flight[] flights = lax.getFlights();
   flights1 = lax.getFlights();
    if (flights1.length > 0) {    
        selectedFlight = flights1[0];
    } else {
        System.out.println("No flights available for LAX.");
    }
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightInfo.fxml"));
	root = loader.load();
   
   Scene2Controller controller = loader.getController();
    controller.setSelectedFlight(selectedFlight); // Set the selected flight
    controller.displayFlightInfo(selectedFlight);
    
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
   }
public void Flight2(ActionEvent event) throws IOException {
   //Flight[] flights = lax.getFlights();
   flights1 = lax.getFlights();
    if (flights1.length > 0) {    
        selectedFlight = flights1[1];
    } else {
        System.out.println("No flights available for LAX.");
    }
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightInfo.fxml"));
	root = loader.load();
   
   Scene2Controller controller = loader.getController();
    controller.setSelectedFlight(selectedFlight); // Set the selected flight
    controller.displayFlightInfo(selectedFlight);
    
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
}
public void Flight3(ActionEvent event) throws IOException {
   //Flight[] flights = jfk.getFlights();
   flights2 = jfk.getFlights();
    if (flights2.length > 0) {    
        selectedFlight = flights2[0];
    } else {
        System.out.println("No flights available for JFK.");
    }
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightInfo.fxml"));
	root = loader.load();
   
   Scene2Controller controller = loader.getController();
    controller.setSelectedFlight(selectedFlight); // Set the selected flight
    controller.displayFlightInfo(selectedFlight);
    
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
}
public void Flight4(ActionEvent event) throws IOException {
   //Flight[] flights = jfk.getFlights();
   flights2 = jfk.getFlights();
    if (flights2.length > 1) {    
        selectedFlight = flights2[1];
    } else {
        System.out.println("No flights available for JFK.");
    }
    
    FXMLLoader loader = new FXMLLoader(getClass().getResource("FlightInfo.fxml"));
	root = loader.load();
   
   Scene2Controller controller = loader.getController();
    controller.setSelectedFlight(selectedFlight); // Set the selected flight
    controller.displayFlightInfo(selectedFlight);
    
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
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
         
     if (selectedFlight != null) {
        nameLabel2.setText("Flight Number: " + selectedFlight.getName());
        departAirportLabel.setText("Departure Airport: " + selectedFlight.getDepartAirport());
        arrivalAirportLabel.setText("Arrival Airport: " + selectedFlight.getArrivalAirport());
        departDateLabel.setText("Departure Date: " + selectedFlight.getDepartDate());
        arrivalDateLabel.setText("Arrival Date: " + selectedFlight.getArrivalDate());
        departTimeLabel.setText("Departure Time: " + selectedFlight.getDepartTime());
        arrivalTimeLabel.setText("Arrival Time: " + selectedFlight.getArrivalTime());
        terminalLabel.setText("Terminal: " + selectedFlight.getTerminal());
        gateLabel.setText("Gate: " + selectedFlight.getGate());
        totalSeatsLabel.setText("Total Seats: " + selectedFlight.getTotalSeats());
        takenSeatsLabel.setText("Taken Seats: " + selectedFlight.getTakenSeats());
        availableSeatsLabel.setText("Available Seats: " + selectedFlight.getAvailableSeats());
        costLabel.setText("Cost: " + selectedFlight.getCost());
        durationLabel.setText("Duration: " + selectedFlight.getDuration());
        bookStatusLabel.setText("Booking Status: " + (selectedFlight.getBookStatus() ? "Booked" : "Available"));
    } else {
        // Handle case where no flight is selected
        nameLabel2.setText("No flight selected");
        departAirportLabel.setText("");
        arrivalAirportLabel.setText("");
        departDateLabel.setText("");
        arrivalDateLabel.setText("");
        departTimeLabel.setText("");
        arrivalTimeLabel.setText("");
        terminalLabel.setText("");
        gateLabel.setText("");
        totalSeatsLabel.setText("");
        takenSeatsLabel.setText("");
        availableSeatsLabel.setText("");
        costLabel.setText("");
        durationLabel.setText("");
        bookStatusLabel.setText("");
    } 
  }
}
