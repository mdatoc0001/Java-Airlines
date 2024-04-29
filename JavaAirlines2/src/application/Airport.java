package application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Airport {
	
    private String name; //Airport name
    private Flight flight;
    List<String> laxFlights = new ArrayList<>();
    List<String> jfkFlights = new ArrayList<>();
    
    /*private Flight[] flights; // Array to store flights
    private int numFlights; // Variable to keep track of the number of flights
    */
    //Airport Constructor
    public Airport(String name) {
        
    	this.name = name;
        
        //this.flights = new Flight[5]; // Initialize the array with 5 flights
        //this.numFlights = 0; // Initialize the number of flights
    }

    /*public void makeFlight(String name, String departAirport, String arrivalAirport, String departDate, String arrivalDate,
                       String departTime, String arrivalTime, String terminal, String gate, String totalSeats, String takenSeats,
                       String availableSeats, String cost, String duration, String bookStatus) {
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
    }*/
    
    public List<String> getLAXFlights(List<Flight> flights) {
    	for (int i=0; i<flights.size(); i++) {
        	if (flights.get(i).getDepartCity().equals("Los Angeles")) {
        		laxFlights.add(flights.get(i).getName());
        	}
        }
    	return laxFlights;
    }
    
    public List<String> getJFKFlights(List<Flight> flights) {
    	for (int i=0; i<flights.size(); i++) {
        	if (flights.get(i).getDepartCity().equals("New York")) {
        		jfkFlights.add(flights.get(i).getName());
        	}
        }
    	return jfkFlights;
    }
    
    //Gets specific flight data based on flight name chosen
    public Flight getFlight(List<Flight> flights, String name) {
    	
    	for (int i=0; i<flights.size(); i++) {
        	if (flights.get(i).getName().equals(name)) {
        		flight = flights.get(i);
        	}
        }
    	return flight;
    }
    
    //getters
    public String getName() {
         return this.name;
    }
    /*public int getNumFlights() {
         return this.numFlights;
    }
    public Flight[] getFlights() {
        return Arrays.copyOf(flights, numFlights);
    }*/
    
    //setters
    public void setName(String name) { // Sets Airport name
        this.name = name;
    }    
}
