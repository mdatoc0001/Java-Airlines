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

public class JFKAirportController implements Initializable {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	Airport jfk = new Airport("JFK");
	List<String> listOfNames;
    
    @FXML
    private ComboBox<String> comboBoxJFK;

    @FXML
    private Label textBox1;

    @FXML
    private Label textBox2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    	FlightParser parser2 = new FlightParser();
    	List<Flight> flights = null;
		try {
			flights = parser2.readFlightsFromTXT("src//application//Flights.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(flights);
    	
    	//JFK ComboBox Flights
    	listOfNames = jfk.getJFKFlights(flights);
    	ObservableList<String> list2 = FXCollections.observableArrayList(listOfNames);
    	System.out.println(list2);
    	comboBoxJFK.setItems(list2);
    	
    }
    
    @FXML
    public void getComboBoxInfo(ActionEvent event) {
    	System.out.println(comboBoxJFK.getValue());
    }
    
    @FXML
    public void Back(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("AirportSelection.fxml"));
		root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    @FXML
    public void flightChosenJFK(ActionEvent event) throws IOException {
    	String name = comboBoxJFK.getValue();
    	FlightParser parser2 = new FlightParser();
    	List<Flight> flights = parser2.readFlightsFromTXT("src//application//Flights.txt");
    	Flight flight = jfk.getFlight(flights, name);
    	
    	if (name == null) {
    		textBox1.setText("No Flights Reserved");
    	} else {
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
    	}
    }

}
