package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightsFileWriter { 
    
    public void write(List<Flight> flights) throws IOException {
        String filePath = "src//application//Flights2.txt";

        //Convert ArrayList to the text file 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))  
        { 
            for (Flight flight : flights) { 
                writer.write(flight.toString()); 
                writer.newLine();  
            } 
            System.out.println("ArrayList written to file successfully."); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        }
     }

}
     