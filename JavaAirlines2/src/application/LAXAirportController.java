package application;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LAXAirportController implements Initializable {

	private Stage stage;
	private Scene scene;
	private Parent root;

	Airport lax = Airport.getInstance();
	Flight flightChosen = Flight.getInstance();
	FlightsList list = FlightsList.getInstance();
	List<String> listOfNames;
	List<Flight> flights = null;

    @FXML
    private ComboBox<String> comboBoxLAX;

    @FXML
    private Label textBox1;

    @FXML
    private Label textBox2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    	
		flights = list.getList();
		System.out.println(flights);

		//LAX ComboBox Flights
    	listOfNames = lax.getLAXFlights(flights);
    	ObservableList<String> list1 = FXCollections.observableArrayList(listOfNames);
    	System.out.println(list1);
    	comboBoxLAX.setItems(list1);
    	
    	lax.setName("LAX");

    }

    @FXML
    public void getComboBoxInfo(ActionEvent event) {
    	System.out.println(comboBoxLAX.getValue());
    }

    @FXML
    public void Back(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("AirportSelection.fxml"));
		root = loader.load();

		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
	    	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    public void flightChosenLAX(ActionEvent event) throws IOException {
    	String name = comboBoxLAX.getValue();
    	Flight flight = lax.getFlight(flights, name);

    	textBox1.setText(
    			"Flight Number: " + flight.getName() + "\n" +
    			"Departing City: " + flight.getDepartCity() + "\n" +
    			"Arrival City: " + flight.getArrivalCity() + "\n" +
    			"Departing Date: " + flight.getDepartDate() + "\n" +
    			"Arrival Date: " + flight.getArrivalDate() + "\n" +
    			"Departing Time: " + flight.getDepartTime() + "\n" +
    			"Arrival Time: " + flight.getArrivalTime());
    	textBox2.setText(
    			"Terminal: " + flight.getTerminal() + "\n" + 
    			"Gate: " + flight.getGate() + "\n" +
				"Total Seats: " + flight.getTotalSeats() + "\n" +
				"Taken Seats: " + flight.getTakenSeats() + "\n" +
				"Available Seats: " + flight.getAvailableSeats() + "\n" +
				"Cost: " + flight.getCost() + "\n" +
				"Duration: " + flight.getDuration() + "\n" +
				"Booking Status: " + flight.getBookStatus());
    	
    	flightChosen.setFlight(flight.getName(),flight.getDepartCity(),flight.getArrivalCity(),
    			flight.getDepartDate(),flight.getArrivalDate(),flight.getDepartTime(),
    			flight.getArrivalTime(),flight.getTerminal(),flight.getGate(),
    			flight.getTotalSeats(),flight.getTakenSeats(),flight.getAvailableSeats(),
    			flight.getCost(),flight.getDuration(),flight.getBookStatus());
    }
    
    @FXML
    void reserve(ActionEvent event) throws IOException {
    	if (comboBoxLAX.getValue() == null) {
    		textBox1.setText("Please Select Flight");
    	} else {
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("PaymentScreen.fxml"));
    		root = loader.load();
    		
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		scene = new Scene(root);
    	    	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    		stage.setScene(scene);
    		stage.show();
    	}
    	
    }

}
