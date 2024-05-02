package application;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FlightsList {
	
	private static final FlightsList instance = new FlightsList();

	FlightParser parser2 = new FlightParser();
	List<Flight> flights = null;
	
	private FlightsList(){}

	public static FlightsList getInstance() {

		return instance;
	}
	
	public List<Flight> getList() {
		return flights;
	}
	
	public void setList() {
		try {
			flights = parser2.readFlightsFromTXT("src//application//Flights.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}