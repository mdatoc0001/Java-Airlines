package application;
//importing java libraries
import java.util.Date;
import java.util.List;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;



public class Manager {
    
	// classifying attributes
	
    private String username = "Manager";
    private String password = "Java123";
    private Flight flight;

    private int reservationCount = 0;
    List<Flight> reservedFlights = new ArrayList<>();
    private int numFlightsFull = 0;
    List<Flight> fullFlights = new ArrayList<>();
    private int numFlightsOpen = 0;
    List<Flight> openFlights = new ArrayList<>();
    
    //Gets Manager username
    public String getUsername() {
    	return username;
    }
    
    //Gets Manager password
    public String getPassword() {
    	return password;
    }
    
    //Sets reserved flights list and count
    public void setReservedFlights(List<Flight> list) {
    	for (int i=0; i<list.size(); i++) {
        	if (list.get(i).getBookStatus().equals("Booked")) {
        		reservationCount++;
        		reservedFlights.add(list.get(i));
        	}
        }
    }
    
    //Gets number of reserved flights
    public int getReservationCount() {
        return reservationCount;
    }
    
    //Gets list of reserved flights
    public List<Flight> getReservedFlights() {
    	return reservedFlights;
    }
    
    //Sets open and full flights list and flight open or full count
    public void setFlightsOpenStatus(List<Flight> list) {
    	for (int i=0; i<list.size(); i++) {
        	if (list.get(i).getTotalSeats().equals(list.get(i).getTakenSeats())) {
        		numFlightsFull++;
        		fullFlights.add(list.get(i));
        	} else {
        		numFlightsOpen++;
        		openFlights.add(list.get(i));
        	}
        }
    }
    
    //Gets number of Flights Full
    public int getNumFlightsFull() {
        return numFlightsFull;
    }
    
    //Gets list of Flights full
    public List<Flight> getFlightsFull() {
    	return fullFlights;
    }
    
    //Gets number of Flights Open
    public int getNumFlightsOpen() {
        return numFlightsOpen;
    }
    
    //Gets List of Flights Open
    public List<Flight> getFlightsOpen() {
    	return openFlights;
    }
    
    //Write Flight Data to Flights.txt
    public void addFlight(String newFlight) throws IOException {
    	Writer output;
    	output = new BufferedWriter(new FileWriter("src//application//Flights.txt", true)); 
    	output.append(newFlight);
    	output.close();
    }
    
    //Gets specific flight data based on flight name chosen
    public Flight getFlight(List<Flight> list, String name) {
    	
    	for (int i=0; i<list.size(); i++) {
        	if (list.get(i).getName().equals(name)) {
        		flight = list.get(i);
        	}
        }
    	return flight;
    }
    
    //Update Flight Data
    public void changeFlightInfo(Flight flight, String attribute, String data) {
    	if (attribute.equals("Flight Name") ) {
    		flight.setName(data);
    	} else if (attribute.equals("Departing City")) {
    		flight.setDepartAirport(data);
    	} else if (attribute.equals("Arrival City")) {
    		flight.setArrivalAirport(data);
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
    
    //Main method
    public static void main(String[] Args) throws IOException {
    	UserInfoParser parser = new UserInfoParser();
    	List<UserInfo> userInfoList = parser.readUserDataFromTXT("src//application//UserInfo.txt");
    	try {
			System.out.println(userInfoList);
    	} catch (IndexOutOfBoundsException e) {
    		System.err.println("Requested index is out of bounds: " + e.getMessage());
    	}
    	FlightParser parser2 = new FlightParser();
    	List<Flight> flights = parser2.readFlightsFromTXT("src//application//Flights.txt");
    	try {
			System.out.println(flights);
    	} catch (IndexOutOfBoundsException e) {
    		System.err.println("Requested index is out of bounds: " + e.getMessage());
    	}
    	
    }
    
}

