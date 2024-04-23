//importing java libraries
import java.util.Date;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.Arrays;

public class Manager {
    // classifying attributes

    private String name = "Manager";
    private Flight flight;
    private Airport airport;

    private int numReservations;
    private int numFlightsFull;
    private int numFlightsOpen;
    
    public int getNumReservations() {
        
        return numReservations;
    }
    public int getNumFlightsFull() {
        return numFlightsFull;
    }
    public int getNumFlightsOpen() {
        return numFlightsOpen;
    }
    
}
