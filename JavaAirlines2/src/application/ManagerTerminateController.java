package application;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.ArrayList;

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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ManagerTerminateController implements Initializable{

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	Flight flight = Flight.getInstance();
	FlightsList list = FlightsList.getInstance();
	Airport airport = Airport.getInstance();
	Manager manager = new Manager();
	List<String> listOfNames;
	List<Flight> flights = null;
	FlightsFileWriter writer = new FlightsFileWriter();
	
	@FXML
    private Label textBox1;

    @FXML
    private Label textBox2;
	
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Label confirmationText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    	
		flights = list.getList();
		System.out.println(flights);
		
    	listOfNames = manager.getAllFlights(flights);
    	System.out.println(listOfNames);
    	ObservableList<String> list = FXCollections.observableArrayList(listOfNames);
    	System.out.println(list);
    	comboBox.setItems(list);
    	
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
	    	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    public void chooseFlight(ActionEvent event) throws IOException {
    	String name = comboBox.getValue();
    	flight = manager.getFlight(flights, name);
    	
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
    
    @FXML
    public void Submit(ActionEvent event) throws IOException {
    	String name = comboBox.getValue();
    	flight = manager.getFlight(flights, name);
    	manager.terminateFlight(flight);
    	System.out.print(flight);
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
    	confirmationText.setText("Successfully Terminated!");
    	
    	//Writes to File
    	writer.write(list.getList());
    }

}
