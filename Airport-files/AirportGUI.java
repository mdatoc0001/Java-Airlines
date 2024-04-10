import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AirportGUI extends Application {
    private Airport selectedAirport;
    private Stage primaryStage;
    private Scene airportScene;
    private Scene flightSelectionScene;
    private Scene flightInfoScene;
    private GridPane grid1;
    private GridPane grid2;
    private GridPane grid3;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Airport GUI V2");

        // Create a grid pane for the main menu (grid1)
        this.grid1 = new GridPane();
        grid1.setPadding(new Insets(10, 10, 10, 10));
        grid1.setVgap(8);
        grid1.setHgap(10);
        this.airportScene = new Scene(grid1, 400, 600);

        // Create a grid pane for flight selection
        this.grid2 = new GridPane();
        grid2.setPadding(new Insets(10, 10, 10, 10));
        grid2.setVgap(8);
        grid2.setHgap(10);
        this.flightSelectionScene = new Scene(grid2, 400, 600);

        // Create a grid pane for displaying flight information
        this.grid3 = new GridPane();
        grid3.setPadding(new Insets(10, 10, 10, 10));
        grid3.setVgap(8);
        grid3.setHgap(10);
        this.flightInfoScene = new Scene(grid3, 400, 600);

        // Set up main menu scene
        primaryStage.setScene(airportScene);
        primaryStage.show();

        // Main menu labels for text
        Label l1 = new Label("Please select an airport:");
                
        // Handle airport button clicks in the main menu
        Button LAXButton = new Button("LAX");
        LAXButton.setOnAction(e -> {
              //
              selectedAirport = new Airport("LAX");
              selectedAirport.makeFlight("Flight1", "LAX", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal17", 1, 150, 50, 100, "$200", "2 hours", false);
      
              selectedAirport.makeFlight("Flight2", "LAX", "JFK", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal100", 1, 150, 50, 100, "$200", "2 hours", false);
        primaryStage.setScene(flightSelectionScene);
        });
        
        Button JFKButton = new Button("JFK");
        JFKButton.setOnAction(e -> {
              //
              selectedAirport = new Airport("JFK");
              selectedAirport.makeFlight("Flight3", "JFK", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal78", 1, 150, 50, 100, "$200", "2 hours", false);
      
              selectedAirport.makeFlight("Flight4", "JFK", "LAX", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal54", 1, 150, 50, 100, "$200", "2 hours", false);
        primaryStage.setScene(flightSelectionScene);
        });

        // Add airport buttons and text to the main menu grid (grid 1)
        grid1.add(l1, 0, 0);
        grid1.add(LAXButton, 0, 1); //column 0, row 1
        grid1.add(JFKButton, 1, 1); //column 1, row 1
        
        // Handle going back to the flight selection scene from the flight info scene
        Button backToFlightSelectionButton = new Button("Back to Flight Selection");
        backToFlightSelectionButton.setOnAction(e -> primaryStage.setScene(flightSelectionScene));
        
        // Handle flight selection in the flight selection scene
         Button flight1Button = new Button("Flight1");
         flight1Button.setOnAction(e -> {
             Flight[] flights = selectedAirport.getFlights();
             if (flights.length > 0) {
                 grid3.getChildren().clear(); // Clear previous labels
                 grid3.add(backToFlightSelectionButton, 0, 15);
                 displayFlightInfo(flights[0], grid3);
                 primaryStage.setScene(flightInfoScene);
             } else {
                 System.out.println("No flights available for the selected airport.");
             }
         });

         Button flight2Button = new Button("Flight2");
         flight2Button.setOnAction(e -> {
             Flight[] flights = selectedAirport.getFlights();
             if (flights.length > 1) {
                 grid3.getChildren().clear(); // Clear previous labels
                 grid3.add(backToFlightSelectionButton, 0, 15);
                 displayFlightInfo(flights[1], grid3);
                 primaryStage.setScene(flightInfoScene);
             } else {
                 System.out.println("No second flight available for the selected airport.");
             }
         });
         
         
        // Handle going back to the airport selection scene from the flight selection scene
        Button backToAirportSelectionButton = new Button("Back to Airport Selection");
        backToAirportSelectionButton.setOnAction(e -> primaryStage.setScene(airportScene));  

        // Add flight buttons to the flight selection grid (grid 2)
        grid2.add(flight1Button, 0, 0);
        grid2.add(flight2Button, 1, 0);
        grid2.add(backToAirportSelectionButton, 2, 0);
    }

    private void displayFlightInfo(Flight flight, GridPane grid3) {   
          
       // Create labels for each variable of Flight
       Label nameLabel = new Label("Flight Number: " + flight.getName());
       Label departAirportLabel = new Label("Departure Airport: " + flight.getDepartAirport());
       Label arrivalAirportLabel = new Label("Arrival Airport: " + flight.getArrivalAirport());
       Label departDateLabel = new Label("Departure Date: " + flight.getDepartDate());
       Label arrivalDateLabel = new Label("Arrival Date: " + flight.getArrivalDate());
       Label departTimeLabel = new Label("Departure Time: " + flight.getDepartTime());
       Label arrivalTimeLabel = new Label("Arrival Time: " + flight.getArrivalTime());
       Label terminalLabel = new Label("Terminal: " + flight.getTerminal());
       Label gateLabel = new Label("Gate: " + flight.getGate());
       Label totalSeatsLabel = new Label("Total Seats: " + flight.getTotalSeats());
       Label takenSeatsLabel = new Label("Taken Seats: " + flight.getTakenSeats());
       Label availableSeatsLabel = new Label("Available Seats: " + flight.getAvailableSeats());
       Label costLabel = new Label("Cost: " + flight.getCost());
       Label durationLabel = new Label("Duration: " + flight.getDuration());
       Label bookStatusLabel = new Label("Booking Status: " + (flight.getBookStatus() ? "Booked" : "Available"));
   
       // Add labels to grid
       grid3.add(nameLabel, 0, 0);
       grid3.add(departAirportLabel, 0, 1);
       grid3.add(arrivalAirportLabel, 0, 2);
       grid3.add(departDateLabel, 0, 3);
       grid3.add(arrivalDateLabel, 0, 4);
       grid3.add(departTimeLabel, 0, 5);
       grid3.add(arrivalTimeLabel, 0, 6);
       grid3.add(terminalLabel, 0, 7);
       grid3.add(gateLabel, 0, 8);
       grid3.add(totalSeatsLabel, 0, 9);
       grid3.add(takenSeatsLabel, 0, 10);
       grid3.add(availableSeatsLabel, 0, 11);
       grid3.add(costLabel, 0, 12);
       grid3.add(durationLabel, 0, 13);
       grid3.add(bookStatusLabel, 0, 14);
    }
    
    /**
    NOTES: 
    
    - Need to find a way to add labels in the grids to add text
    - AirportGUI will need to be the main class that also declares the other classes, including profile, maybe?
      - Alternatively, AirportGUI will need to be initialized in the main class, HOWEVER the flight info must be initialized in the main class as well, NOT
        in the AirportGUI class
    - Need to implement the Flights.txt to create the flights in the GUI, the GitHub .txt is in SQL form
    
    3/26/24
    - optimized grid panes
    - need to optimize scenes, if do scene.getChildren().clear() it clears scene or grid, can optimize code too
    
    4/3/24
    - updated to newest version of Flight.java, need to change displayInfo to include all info AND need to 
    change it so it doesn't just print to console, need to print on the GUI
    
    4/10/24
    - updated GUI to display flight info on scene instead of printing to console
     
    */
}
