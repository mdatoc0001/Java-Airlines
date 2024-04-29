package application;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWriter { 
    public static void main(String[] args) {  
        
        FlightParser parser = new FlightParser();
    	List<Flight> flights = null;
		try {
			flights = parser.readFlightsFromTXT("src//application//Flights.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(flights);
  
        // Specify the File Path 
        String filePath = "src//application//Flights2.txt"; 
  
        /* Convert ArrayList to the text file 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))  
        { 
            for (Flight flight : flights) { 
                writer.write(flight.toString()); 
                writer.newLine();  
            } 
            System.out.println("ArrayList written to file successfully."); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } */
    } 
} 