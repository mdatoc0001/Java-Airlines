package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneReservationController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	private Airport selectedAirport;

	
	public void LAX(ActionEvent event) throws IOException {
		selectedAirport = new Airport("LAX");
		
        selectedAirport.makeFlight("Flight1", "LAX", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
          "Terminal17", "1", "150", "50", "100", "$200", "2 hours", "false");

        selectedAirport.makeFlight("Flight2", "LAX", "JFK", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
          "Terminal100", "1", "150", "50", "100", "$200", "2 hours", "false");

		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LAX.fxml"));
		root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
public void JFK(ActionEvent event) throws IOException {
		
	selectedAirport = new Airport("JFK");
    selectedAirport.makeFlight("Flight3", "JFK", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
      "Terminal78", "1", "150", "50", "100", "$200", "2 hours", "false");

    selectedAirport.makeFlight("Flight4", "JFK", "LAX", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
      "Terminal54", "1", "150", "50", "100", "$200", "2 hours", "false");
    
		FXMLLoader loader = new FXMLLoader(getClass().getResource("JFK.fxml"));
		root = loader.load();
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
public void Back(ActionEvent event) throws IOException {
	//Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
	
	
	FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
	root = loader.load();
	
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}

}
