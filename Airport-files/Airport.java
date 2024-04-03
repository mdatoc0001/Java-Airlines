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

    public void makeFlight(String name, String departAirport, String arrivalAirport, String departDate, String arrivalDate,
                       String departTime, String arrivalTime, String terminal, int gate, int totalSeats, int takenSeats,
                       int availableSeats, String cost, String duration, boolean bookStatus) {
        // Check if the array has space for a new flight
        if (numFlights < 5) {
        // Create a new Flight object
        Flight newFlight = new Flight(name, departAirport, arrivalAirport, departDate, arrivalDate, departTime,
                arrivalTime, terminal, gate, totalSeats, takenSeats, availableSeats, cost, duration, bookStatus);
                
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
