import java.util.Arrays;

public class Airport {
    private String name; //Airport name
    private Flight[] flights; // Array to store flights
    private int numFlights; // Variable to keep track of the number of flights
    
    public Airport(String name) {
        this.name = name;
        this.flights = new Flight[5]; // Initialize the array with 5 flights
        this.numFlights = 0; // Initialize the number of flights
    }

    public void makeFlight(String name, String date, String cost, String destination, String departure, String arrival,
                            String duration, int totalSeats, int takenSeats, int availableSeats, String seatName,
                            String terminal, String gate) {
        // Check if the array has space for a new flight
        if (numFlights < 5) {
            // Create a new Flight object
            Flight newFlight = new Flight(name, date, cost, destination, departure, arrival, duration, totalSeats,
                    takenSeats, availableSeats, seatName, terminal, gate);

            // Add the new flight to the array
            flights[numFlights] = newFlight;

            // Increment the number of flights
            numFlights++;
        } else {
            System.out.println("Cannot add more flights. Maximum capacity reached.");
        }
    }
    
    //getters
    public String getName() {
         return this.name;
    }
    public int getNumFlights() {
         return this.numFlights;
    }
    public Flight[] getFlights() {
        return Arrays.copyOf(flights, numFlights);
    }
    
    //setters
    public void setName(String name) { // Sets Airport name
        this.name = name;
    }    
}