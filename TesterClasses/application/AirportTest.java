import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class AirportTest {

    private Airport airport;
    private Airport airport2;
    private List<Flight> flights;

    @Before
    public void setUp() {
        airport = new Airport("Test Airport");
        flights = new ArrayList<>();
        
        // Adding flights to the list
        flights.add(new Flight("Flight 1", "Los Angeles", "New York", "2024-05-01", 
                               "2024-05-02", "10:00", "12:00", "Terminal 1", "Gate A", 
                               "100", "50", "50", "$200", "2 hours", "Available"));
    }

    @Test
    public void testGetFlight1() {
        // Testing when flight is found
        Flight foundFlight = airport.getFlight(flights, "Flight 1");
        assertNotNull(foundFlight);
        assertEquals("Flight 1", foundFlight.getName());
        assertEquals("Los Angeles", foundFlight.getDepartCity());
        assertEquals("New York", foundFlight.getArrivalCity());
        assertEquals("Available", foundFlight.getBookStatus());
    }
    @Test
    public void testGetFlight2() {
        // Testing when flight is not found
        Flight notFoundFlight = airport.getFlight(flights, "Flight 2");
        assertNull(notFoundFlight);
    }
}