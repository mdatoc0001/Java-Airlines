package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Scene2Controller {

	@FXML
	Label nameLabel;
	
	public void displayName(String userName) {
		
		nameLabel.setText("Welcome " + userName);
	}

	
}
