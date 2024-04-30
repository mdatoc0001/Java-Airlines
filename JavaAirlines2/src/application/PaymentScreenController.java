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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PaymentScreenController implements Initializable {

	Flight flight = Flight.getInstance();
	Payment payment = Payment.getInstance();
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
    @FXML
    private TextField cardName;

    @FXML
    private TextField cardNo;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Label cost;

    @FXML
    private TextField cvv;
    
    @FXML
    private Label error;

    @FXML
    private TextField validityDate;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    	
    	comboBox.setItems(FXCollections.observableArrayList("Debit","Credit"));
    	
    	cost.setText(flight.getCost());
    	
    }
    
    @FXML
    public void getComboBoxInfo(ActionEvent event) {
    	System.out.println(comboBox.getValue());
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
    public void Pay(ActionEvent event) throws IOException {
    	
    	payment.setPaymentInfo(comboBox.getValue(), cardName.getText(), validityDate.getText(), 
    			cost.getText(), cardNo.getText(), cvv.getText());
    	
    	System.out.println(payment);
    	
    	if (comboBox.getValue() == null) {
    		error.setText("Please Select Card Type"); 
    	} else if (payment.getName().equals("")) {
    		error.setText("Please Enter Card Name Info");
    	} else if (payment.getValidityDate().equals("") || payment.validityDateLength()) {
    		error.setText("Please Enter Validity Date Info");
    	} else if (payment.getCardNo().equals("") || payment.cardNoLength()) {
    		error.setText("Please Enter Card Number Info");
       	} else if (payment.getCvv().equals("") || payment.cvvLength()) {
       		error.setText("Please Enter cvv Info");
       	} else {
       		FXMLLoader loader = new FXMLLoader(getClass().getResource("ConfirmationScene.fxml"));
    		root = loader.load();
    		
    		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    		scene = new Scene(root);
    		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    		stage.setScene(scene);
    		stage.show(); 
    	}
    	
    }

}
	
	
	
