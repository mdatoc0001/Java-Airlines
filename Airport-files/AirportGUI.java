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
    private GridPane flightInfoGrid;
    private Stage primaryStage;
    private Scene flightInfoScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Airport GUI V2");

        // Create a grid pane for the main menu
        GridPane mainMenuGrid = createMainMenuGrid();
        Scene airportScene = new Scene(mainMenuGrid, 400, 200);

        // Create a grid pane for flight selection
        GridPane flightSelectionGrid = createFlightSelectionGrid();
        Scene flightSelectionScene = new Scene(flightSelectionGrid, 400, 200);

        // Create a grid pane for displaying flight information
        GridPane flightInfoGrid = createFlightInfoGrid();
        Scene flightInfoScene = new Scene(flightInfoGrid, 400, 200);

        // Set up main menu scene
        primaryStage.setScene(airportScene);
        primaryStage.show();

        // Handle airport button clicks in the main menu
        Button LAXButton = new Button("LAX");
        LAXButton.setOnAction(e -> {
              //
              selectedAirport = new Airport("LAX");
              selectedAirport.makeFlight("Flight1", "2024-03-10", "$200", "Destination1", "Departure1", "Arrival1",
                      "2 hours", 150, 50, 100, "A1", "Terminal1", "Gate1");
      
              selectedAirport.makeFlight("Flight2", "2024-03-15", "$250", "Destination2", "Departure2", "Arrival2",
                      "3 hours", 200, 75, 125, "B1", "Terminal2", "Gate2");
        primaryStage.setScene(flightSelectionScene);
        });
        
        Button JFKButton = new Button("JFK");
        JFKButton.setOnAction(e -> {
              //
              selectedAirport = new Airport("JFK");
              selectedAirport.makeFlight("Flight1", "2024-03-10", "$200", "Destination1", "Departure1", "Arrival1",
                      "2 hours", 150, 50, 100, "A1", "Terminal1", "Gate3");
      
              selectedAirport.makeFlight("Flight2", "2024-03-15", "$250", "Destination2", "Departure2", "Arrival2",
                      "3 hours", 200, 75, 125, "B1", "Terminal2", "Gate4");
        primaryStage.setScene(flightSelectionScene);
        });

        // Add airport buttons to the main menu grid
        mainMenuGrid.add(LAXButton, 0, 0);
        mainMenuGrid.add(JFKButton, 1, 0);
        // Add more airport buttons as needed

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
        flightSelectionGrid.add(flight1Button, 0, 0);
        flightSelectionGrid.add(flight2Button, 1, 0);
        flightSelectionGrid.add(backToAirportSelectionButton, 2, 0);

        // Handle going back to the flight selection scene from the flight info scene
        Button backToFlightSelectionButton = new Button("Back to Flight Selection");
        backToFlightSelectionButton.setOnAction(e -> primaryStage.setScene(flightSelectionScene));

        // Add the back button to the flight info grid
        flightInfoGrid.add(backToFlightSelectionButton, 0, 2);
    }

    private GridPane createMainMenuGrid() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);
        return grid;
    }

    private GridPane createFlightSelectionGrid() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);
        return grid;
    }

    private GridPane createFlightInfoGrid() {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);
        return grid;
    }

    private void displayFlightInfo(Flight flight) {
       // Print flight information to the console
       System.out.println("Flight Information:");
       System.out.println("Name: " + flight.getName());
       System.out.println("Date: " + flight.getDate());
       System.out.println("Cost: " + flight.getCost());
       System.out.println("Destination: " + flight.getDestination());
       System.out.println("Departure: " + flight.getDeparture());
       System.out.println("Arrival: " + flight.getArrival());
       System.out.println("Duration: " + flight.getDuration());
       System.out.println("Total Seats: " + flight.getTotalSeats());
       System.out.println("Taken Seats: " + flight.getTakenSeats());
       System.out.println("Available Seats: " + flight.getAvailableSeats());
       System.out.println("Seat Name: " + flight.getSeatName());
       System.out.println("Terminal: " + flight.getTerminal());
       System.out.println("Gate: " + flight.getGate());
   
       System.out.println("----------------------------------------");
    }
}