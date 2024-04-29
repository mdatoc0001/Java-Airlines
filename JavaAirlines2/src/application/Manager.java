package application;
//importing java libraries
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;



public class Manager {
    
	// classifying attributes
	
    private String username;
    private String password;
    private Flight flight;

    List<String> reservedFlights = new ArrayList<>();
    List<String> openFlights = new ArrayList<>();
    List<String> allFlights = new ArrayList<>();
    
    // Constructor
    public Manager() {
    	username = "Manager";
    	password = "Java123";
    }
    
    //Gets Manager Username
    public String getUsername() {
    	return username;
    }
    
    //Gets Manager password
    public String getPassword() {
    	return password;
    }
    
    //Gets list of names of all Flights
    public List<String> getAllFlights(List<Flight> flights) {
    	for (int i=0; i<flights.size(); i++) {
    		allFlights.add(flights.get(i).getName());
        }
    	return allFlights;
    }
    
    //Gets list of names of Reserved Flights
    public List<String> getReservedFlights(List<Flight> flights) {
    	for (int i=0; i<flights.size(); i++) {
        	if (flights.get(i).getBookStatus().equals("Booked")) {
        		reservedFlights.add(flights.get(i).getName());
        	}
        }
    	return reservedFlights;
    }
    
    //Gets list of names of Open Flights
    public List<String> getOpenFlights(List<Flight> flights) {
    	for (int i=0; i<flights.size(); i++) {
        	if (flights.get(i).getBookStatus().equals("Available")) {
        		openFlights.add(flights.get(i).getName());
        	}
        }
    	return openFlights;
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
    
    //Update Flight Data
    public void changeFlightInfo(Flight flight, String attribute, String data) {
    	if (attribute.equals("Flight Name") ) {
    		flight.setName(data);
    	} else if (attribute.equals("Departing City")) {
    		flight.setDepartCity(data);
    	} else if (attribute.equals("Arrival City")) {
    		flight.setArrivalCity(data);
    	} else if (attribute.equals("Departing Date")) {
    		flight.setDepartDate(data);
    	} else if (attribute.equals("Arrival Date")) {
    		flight.setArrivalDate(data);
    	} else if (attribute.equals("Departing Time")) {
    		flight.setDepartTime(data);
    	} else if (attribute.equals("Arrival Time")) {
    		flight.setArrivalTime(data);
    	} else if (attribute.equals("Terminal")) {
    		flight.setTerminal(data);
    	} else if (attribute.equals("Gate")) {
    		flight.setGate(data);
    	} else if (attribute.equals("Total Seats")) {
    		flight.setTotalSeats(data);
    	} else if (attribute.equals("Taken Seats")) {
    		flight.setTakenSeats(data);
    	} else if (attribute.equals("Available Seats")) {
    		flight.setAvailableSeats(data);
    	} else if (attribute.equals("Cost")) {
    		flight.setCost(data);
    	} else if (attribute.equals("Duration")) {
    		flight.setDuration(data);
    	} else if (attribute.equals("Book Status")) {
    		flight.setBookStatus(data);
    	}
    }
    
    //Terminates Flight
    public void terminateFlight(Flight flight) {
        flight.setBookStatus("Terminated");
    }
    
}

