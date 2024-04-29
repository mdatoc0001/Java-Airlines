package application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Airport {
	
	//Declaring variables
    private String name; 
    private Flight flight;
    List<String> laxFlights = new ArrayList<>();
    List<String> jfkFlights = new ArrayList<>();
    
    //Airport Constructor
    public Airport(String name) {
    	this.name = name;
    }

    // Creates and returns list of names of LAX Flights
    public List<String> getLAXFlights(List<Flight> flights) {
    	for (int i=0; i<flights.size(); i++) {
        	if (flights.get(i).getDepartCity().equals("Los Angeles")) {
        		laxFlights.add(flights.get(i).getName());
        	}
        }
    	return laxFlights;
    }
    
    // Creates and returns list of names of JFK Flights
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
    
    //setters
    public void setName(String name) { // Sets Airport name
        this.name = name;
    }    
}
