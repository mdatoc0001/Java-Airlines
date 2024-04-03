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
    private Scene flightInfoScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Airport GUI V2");

        // Create a grid pane for the main menu
        GridPane grid1 = new GridPane();
        grid1.setPadding(new Insets(10, 10, 10, 10));
        grid1.setVgap(8);
        grid1.setHgap(10);
        Scene airportScene = new Scene(grid1, 400, 200);

        // Create a grid pane for flight selection
        GridPane grid2 = new GridPane();
        grid2.setPadding(new Insets(10, 10, 10, 10));
        grid2.setVgap(8);
        grid2.setHgap(10);
        Scene flightSelectionScene = new Scene(grid2, 400, 200);

        // Create a grid pane for displaying flight information
        GridPane grid3 = new GridPane();
        grid3.setPadding(new Insets(10, 10, 10, 10));
        grid3.setVgap(8);
        grid3.setHgap(10);
        Scene flightInfoScene = new Scene(grid3, 400, 200);

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
                "Terminal1", 1, 150, 50, 100, "$200", "2 hours", false);
      
              selectedAirport.makeFlight("Flight2", "LAX", "JFK", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal1", 1, 150, 50, 100, "$200", "2 hours", false);
        primaryStage.setScene(flightSelectionScene);
        });
        
        Button JFKButton = new Button("JFK");
        JFKButton.setOnAction(e -> {
              //
              selectedAirport = new Airport("JFK");
              selectedAirport.makeFlight("Flight3", "JFK", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal1", 1, 150, 50, 100, "$200", "2 hours", false);
      
              selectedAirport.makeFlight("Flight4", "JFK", "LAX", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal1", 1, 150, 50, 100, "$200", "2 hours", false);
        primaryStage.setScene(flightSelectionScene);
        });

        // Add airport buttons and text to the main menu grid
        grid1.add(l1, 0, 0);
        grid1.add(LAXButton, 0, 1); //column 0, row 1
        grid1.add(JFKButton, 1, 1); //column 1, row 1
        
        // Handle flight selection in the flight selection scene
         Button flight1Button = new Button("Flight1");
         flight1Button.setOnAction(e -> {
             Flight[] flights = selectedAirport.getFlights();
             if (flights.length > 0) {
                 displayFlightInfo(flights[0]);
                 primaryStage.setScene(flightInfoScene);
             } else {
                 System.out.println("No flights available for the selected airport.");
             }
         });

         Button flight2Button = new Button("Flight2");
         flight2Button.setOnAction(e -> {
             Flight[] flights = selectedAirport.getFlights();
             if (flights.length > 1) {
                 displayFlightInfo(flights[1]);
                 primaryStage.setScene(flightInfoScene);
             } else {
                 System.out.println("No second flight available for the selected airport.");
             }
         });
         
        // Handle going back to the airport selection scene from the flight selection scene
        Button backToAirportSelectionButton = new Button("Back to Airport Selection");
        backToAirportSelectionButton.setOnAction(e -> primaryStage.setScene(airportScene));

        // Add flight buttons to the flight selection grid
        grid2.add(flight1Button, 0, 0);
        grid2.add(flight2Button, 1, 0);
        grid2.add(backToAirportSelectionButton, 2, 0);

        // Handle going back to the flight selection scene from the flight info scene
        Button backToFlightSelectionButton = new Button("Back to Flight Selection");
        backToFlightSelectionButton.setOnAction(e -> primaryStage.setScene(flightSelectionScene));

        // Add the back button to the flight info grid
        grid3.add(backToFlightSelectionButton, 0, 2);
    }

    private void displayFlightInfo(Flight flight) {
    
       System.out.println("Flight Information:");
       System.out.println("Name: " + flight.getName());
       System.out.println("Cost: " + flight.getCost());
       System.out.println("Duration: " + flight.getDuration());
       System.out.println("Total Seats: " + flight.getTotalSeats());
       System.out.println("Taken Seats: " + flight.getTakenSeats());
       System.out.println("Available Seats: " + flight.getAvailableSeats());
       System.out.println("Terminal: " + flight.getTerminal());
       System.out.println("Gate: " + flight.getGate());
   
       System.out.println("----------------------------------------");
    /**
       grid.add(new Label("Flight Information:"), 0, 0, 2, 1);
       grid.add(new Label("Name:"), 0, 1);
       grid.add(new Label(flight.getName()), 1, 1);
       grid.add(new Label("Date:"), 0, 2);
       grid.add(new Label(flight.getDate()), 1, 2);
       grid.add(new Label("Cost:"), 0, 3);
       grid.add(new Label(Double.toString(flight.getCost())), 1, 3);
       grid.add(new Label("Destination:"), 0, 4);
       grid.add(new Label(flight.getDestination()), 1, 4);
       grid.add(new Label("Departure:"), 0, 5);
       grid.add(new Label(flight.getDeparture()), 1, 5);
       grid.add(new Label("Arrival:"), 0, 6);
       grid.add(new Label(flight.getArrival()), 1, 6);
       grid.add(new Label("Duration:"), 0, 7);
       grid.add(new Label(Integer.toString(flight.getDuration())), 1, 7);
       grid.add(new Label("Total Seats:"), 0, 8);
       grid.add(new Label(Integer.toString(flight.getTotalSeats())), 1, 8);
       grid.add(new Label("Taken Seats:"), 0, 9);
       grid.add(new Label(Integer.toString(flight.getTakenSeats())), 1, 9);
       grid.add(new Label("Available Seats:"), 0, 10);
       grid.add(new Label(Integer.toString(flight.getAvailableSeats())), 1, 10);
       grid.add(new Label("Seat Name:"), 0, 11);
       grid.add(new Label(flight.getSeatName()), 1, 11);
       grid.add(new Label("Terminal:"), 0, 12);
       grid.add(new Label(flight.getTerminal()), 1, 12);
       grid.add(new Label("Gate:"), 0, 13);
       grid.add(new Label(flight.getGate()), 1, 13);   
       */
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
    */
}
