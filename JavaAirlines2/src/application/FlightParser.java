package application;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightParser {
    
	public List<Flight> readFlightsFromTXT(String filePath) throws IOException {
        List<Flight> flights = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                try {
                    Flight flight = new Flight(data);
                    flights.add(flight);
                } catch (IllegalArgumentException e) {
                    System.err.println("Invalid flight data: " + line);
                }
            }
        }

        return flights;
    }
}