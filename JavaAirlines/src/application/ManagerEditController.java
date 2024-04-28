package application;

import java.io.IOException;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ManagerEditController {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	Manager manager = new Manager();
	
	@FXML
    private SplitMenuButton dataToChange;
	
	@FXML
    private ComboBox<String> dataToChange2;
	
    @FXML
    private TextField dataText;

    @FXML
    private Label flightDetailsText;

    @FXML
    private TextField flightName;
    
    @FXML
    private Label confirmationText;

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
    public void Enter(ActionEvent event) {
    	
    }

    @FXML
    public void Submit(ActionEvent event) throws IOException {
    	String name = flightName.getText();
    	String dataType = dataToChange.getText();
    	String newData = dataText.getText();
    	FlightParser parser2 = new FlightParser();
    	List<Flight> flights = parser2.readFlightsFromTXT("src//application//Flights.txt");
    	Flight flight = manager.getFlight(flights, name);
    	manager.changeFlightInfo(flight, dataType, newData);
    	confirmationText.setText("Data Change Successful!");
    	System.out.print(flight);
    }

}
