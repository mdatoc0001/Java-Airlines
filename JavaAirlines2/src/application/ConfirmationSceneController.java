package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ConfirmationSceneController implements Initializable {

	UserInfo user = UserInfo.getInstance();
	Airport airport = Airport.getInstance();
	Flight flight = Flight.getInstance();
	Payment payment = Payment.getInstance();
	Reservation reservation = Reservation.getInstance();
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
    @FXML
    private Label confirmationNo;
    
    @FXML
    private Label textBox1;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    	
    	confirmationNo.setText(payment.getPaymentID());
    	textBox1.setText(reservation.toString());
    	
    }

    @FXML
    public void Logout(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
		root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
    }

    @FXML
    public void Yes(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("AirportSelection.fxml"));
		root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		stage.setScene(scene);
		stage.show();
    }

}
