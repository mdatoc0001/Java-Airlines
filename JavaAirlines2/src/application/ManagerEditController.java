package application;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ManagerEditController implements Initializable {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	Manager manager = new Manager();
	
	@FXML
    private ComboBox<String> comboBox;
	
    @FXML
    private TextField dataText;

    @FXML
    private Label flightDetailsText;
    
    @FXML 
    private Label flightDetailsText2;

    @FXML
    private TextField flightName;
    
    @FXML
    private Label confirmationText;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    	comboBox.setItems(FXCollections.observableArrayList("Flight Name","Departing City","Arrival City","Departing Date","Arrival Date","Departing Time","Arrival Time","Terminal","Gate","Total Seats","Taken Seats","Available Seats","Cost","Duration","Book Status"));
    }

    @FXML
    public void getComboBoxInfo(ActionEvent event) {
    	System.out.println(comboBox.getValue());
    }
    
    @FXML
    public void Back(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("ManagerScene.fxml"));
		root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    public void Enter(ActionEvent event) throws IOException {
    	
    	String name = flightName.getText();
    	FlightParser parser2 = new FlightParser();
    	List<Flight> flights = parser2.readFlightsFromTXT("src//application//Flights.txt");
    	Flight flight = manager.getFlight(flights, name);
    	
    	flightDetailsText.setText(
    			"Flight Number: " + flight.getName() + "\n" +
    			"Departing City: " + flight.getDepartCity() + "\n" +
    			"Arrival City: " + flight.getArrivalCity() + "\n" +
    			"Departing Date: " + flight.getDepartDate() + "\n" +
    			"Arrival Date: " + flight.getArrivalDate() + "\n" +
    			"Departing Time: " + flight.getDepartTime() + "\n" +
    			"Arrival Time: " + flight.getArrivalTime());
    	flightDetailsText2.setText(
    			"Terminal: " + flight.getTerminal() + "\n" + 
    			"Gate: " + flight.getGate() + "\n" +
				"Total Seats: " + flight.getTotalSeats() + "\n" +
				"Taken Seats: " + flight.getTakenSeats() + "\n" +
				"Available Seats: " + flight.getAvailableSeats() + "\n" +
				"Cost: " + flight.getCost() + "\n" +
				"Duration: " + flight.getDuration() + "\n" +
				"Booking Status: " + flight.getBookStatus());
    }

    @FXML
    public void Submit(ActionEvent event) throws IOException {
    	String name = flightName.getText();
    	String dataType = comboBox.getValue();
    	String newData = dataText.getText();
    	FlightParser parser2 = new FlightParser();
    	List<Flight> flights = parser2.readFlightsFromTXT("src//application//Flights.txt");
    	Flight flight = manager.getFlight(flights, name);
    	manager.changeFlightInfo(flight, dataType, newData);
    	confirmationText.setText("Data Change Successful!");
    	System.out.print(flight);
    }

}
