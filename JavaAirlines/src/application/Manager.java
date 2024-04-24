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

    private String name = "Manager";
    private Flight flight;
    private Airport airport;
    private UserInfo user;

    private int reservationCount = 0;
    List<Flight> reservedFlights = new ArrayList<>();
    private int numFlightsFull = 0;
    List<Flight> fullFlights = new ArrayList<>();
    private int numFlightsOpen = 0;
    List<Flight> openFlights = new ArrayList<>();
    
    
    public void setReservedFlights(List<Flight> list) {
    	for (int i=0; i<list.size(); i++) {
        	if (list.get(i).getBookStatus().equals("Booked")) {
        		reservationCount++;
        		reservedFlights.add(list.get(i));
        	}
        }
    }
    
    public int getReservationCount() {
        return reservationCount;
    }
    
    public List<Flight> getReservedFlights() {
    	return reservedFlights;
    }
    
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
    
    public int getNumFlightsFull() {
        return numFlightsFull;
    }
    
    public List<Flight> getFlightsFull() {
    	return fullFlights;
    }
    
    public int getNumFlightsOpen() {
        return numFlightsOpen;
    }
    
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
    
    //Update Flight Data
    public void changeFlightInfo(String flight, String attribute, String data) {
    	//for (int i=0; i<)
    	if (attribute.equals("Flight Name") ) {
    		
    	} else if (attribute.equals("Departing City")) {
    		
    	} else if (attribute.equals("Arrival City")) {
    		
    	} else if (attribute.equals("Departing Date")) {
    		
    	} else if (attribute.equals("Arrival Date")) {
    		
    	} else if (attribute.equals("Departing Time")) {
    		
    	} else if (attribute.equals("Arrival Time")) {
    		
    	} else if (attribute.equals("Terminal")) {
    		
    	} else if (attribute.equals("Gate")) {
    		
    	} else if (attribute.equals("Total Seats")) {
    		
    	} else if (attribute.equals("Taken Seats")) {
    		
    	} else if (attribute.equals("Available Seats")) {
    		
    	} else if (attribute.equals("Cost")) {
    		
    	} else if (attribute.equals("Duration")) {
    		
    	} else if (attribute.equals("Book Status")) {
    		
    	}
    }
    
    
    public void terminateFlight(List<Flight> list, String flightName) {
    	for (int i=0; i<list.size(); i++) {
        	if (list.get(i).getName().equals(flightName)) {
        		list.get(i).setBookStatus("Terminated");
        		break;
        	}
        }
    }
    
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

