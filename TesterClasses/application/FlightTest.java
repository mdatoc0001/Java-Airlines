import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FlightTest {

    private Flight flight;

    @Before 
    public void setUp() {
        flight = new Flight("TestFlight", "DepartCity", "ArrivalCity", "2024-05-01", "2024-05-02", 
                            "08:00", "10:00", "Terminal A", "Gate 1", "100", "20", "80", "100.00", "2 hours", "Booked");
    }

    //Getters
    @Test
    public void testGetName() {
        assertEquals("TestFlight", flight.getName());
    }

    @Test
    public void testGetDepartCity() {
        assertEquals("DepartCity", flight.getDepartCity());
    }

    @Test
    public void testGetArrivalCity() {
        assertEquals("ArrivalCity", flight.getArrivalCity());
    }

    @Test
    public void testGetDepartDate() {
        assertEquals("2024-05-01", flight.getDepartDate());
    }

    @Test
    public void testGetArrivalDate() {
        assertEquals("2024-05-02", flight.getArrivalDate());
    }

    @Test
    public void testGetDepartTime() {
        assertEquals("08:00", flight.getDepartTime());
    }

    @Test
    public void testGetArrivalTime() {
        assertEquals("10:00", flight.getArrivalTime());
    }

    @Test
    public void testGetTerminal() {
        assertEquals("Terminal A", flight.getTerminal());
    }

    @Test
    public void testGetGate() {
        assertEquals("Gate 1", flight.getGate());
    }

    @Test
    public void testGetTotalSeats() {
        assertEquals("100", flight.getTotalSeats());
    }

    @Test
    public void testGetTakenSeats() {
        assertEquals("20", flight.getTakenSeats());
    }

    @Test
    public void testGetAvailableSeats() {
        assertEquals("80", flight.getAvailableSeats());
    }

    @Test
    public void testGetCost() {
        assertEquals("100.00", flight.getCost());
    }

    @Test
    public void testGetDuration() {
        assertEquals("2 hours", flight.getDuration());
    }

    @Test
    public void testGetBookStatus() {
        assertEquals("Booked", flight.getBookStatus());
    }
    
    //Setters
    @Test
    public void testSetName() {
        flight.setName("NewTestFlight");
        assertEquals("NewTestFlight", flight.getName());
    }

    @Test
    public void testSetDepartCity() {
        flight.setDepartCity("NewDepartCity");
        assertEquals("NewDepartCity", flight.getDepartCity());
    }

    @Test
    public void testSetArrivalCity() {
        flight.setArrivalCity("NewArrivalCity");
        assertEquals("NewArrivalCity", flight.getArrivalCity());
    }

    @Test
    public void testSetDepartDate() {
        flight.setDepartDate("2024-06-01");
        assertEquals("2024-06-01", flight.getDepartDate());
    }

    @Test
    public void testSetArrivalDate() {
        flight.setArrivalDate("2024-06-02");
        assertEquals("2024-06-02", flight.getArrivalDate());
    }

    @Test
    public void testSetDepartTime() {
        flight.setDepartTime("09:00");
        assertEquals("09:00", flight.getDepartTime());
    }

    @Test
    public void testSetArrivalTime() {
        flight.setArrivalTime("11:00");
        assertEquals("11:00", flight.getArrivalTime());
    }

    @Test
    public void testSetTerminal() {
        flight.setTerminal("NewTerminal");
        assertEquals("NewTerminal", flight.getTerminal());
    }

    @Test
    public void testSetGate() {
        flight.setGate("NewGate");
        assertEquals("NewGate", flight.getGate());
    }

    @Test
    public void testSetTotalSeats() {
        flight.setTotalSeats("200");
        assertEquals("200", flight.getTotalSeats());
    }

    @Test
    public void testSetTakenSeats() {
        flight.setTakenSeats("50");
        assertEquals("50", flight.getTakenSeats());
    }

    @Test
    public void testSetAvailableSeats() {
        flight.setAvailableSeats("150");
        assertEquals("150", flight.getAvailableSeats());
    }

    @Test
    public void testSetCost() {
        flight.setCost("150.00");
        assertEquals("150.00", flight.getCost());
    }

    @Test
    public void testSetDuration() {
        flight.setDuration("3 hours");
        assertEquals("3 hours", flight.getDuration());
    }

    @Test
    public void testSetBookStatus() {
        flight.setBookStatus("Not Booked");
        assertEquals("Not Booked", flight.getBookStatus());
    }
}