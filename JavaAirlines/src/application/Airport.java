package application;
import java.util.Arrays;

public class Airport {
    private String name; //Airport name
    private Flight[] flights; // Array to store flights
    private int numFlights; // Variable to keep track of the number of flights
    
    public Airport(String name) {
        this.name = name;
        this.flights = new Flight[100]; // Initialize the array with 100 flights
        this.numFlights = 0; // Initialize the number of flights
    }

    public void makeFlight(String name, String departAirport, String arrivalAirport, String departDate, String arrivalDate,
                       String departTime, String arrivalTime, String terminal, String gate, String totalSeats, String takenSeats,
                       String availableSeats, String cost, String duration, String bookStatus) {
        // Check if the array has space for a new flight
        if (numFlights < 100) {
        // Create a new Flight object
        String[] flightInfo = new String[15];
        flightInfo[0] = name;
        flightInfo[1] = departAirport;
        flightInfo[2] = arrivalAirport;
        flightInfo[3] = departDate;
        flightInfo[4] = arrivalDate;
        flightInfo[5] = departTime;
        flightInfo[6] = arrivalTime;
        flightInfo[7] = terminal;
        flightInfo[8] = gate;
        flightInfo[9] = totalSeats;
        flightInfo[10] = takenSeats;
        flightInfo[11] = availableSeats;
        flightInfo[12] = cost;
        flightInfo[13] = duration;
        flightInfo[14] = bookStatus;
        
        Flight newFlight = new Flight(flightInfo);
                
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
