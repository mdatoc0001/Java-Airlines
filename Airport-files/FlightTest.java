import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class FlightTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   Flight test = new Flight("Flight1", "2024-03-10", "$200", "Destination1", "Departure1", "Arrival1",
                      "2 hours", 150, 50, 100, "A1", "Terminal1", "Gate1");

   /** A test that always passes. **/
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 1, 1);
   }
   
   /** Flight class tests **/
   @Test
   public void testGetFlightName() {
      assertEquals("Flight1", test.getName());
   }
   @Test
   public void testSetFlightName() {
      test.setName("Flight2");
      assertEquals("Flight2", test.getName());
   }
   
   // Test for getting and setting date
   @Test
   public void testGetFlightDate() {
      assertEquals("2024-03-10", test.getDate());
   }
   @Test
   public void testSetFlightDate() {
      test.setDate("2024-03-11");
      assertEquals("2024-03-11", test.getDate());
   }
   
   // Test for getting and setting cost
   @Test
   public void testGetFlightCost() {
      assertEquals("$200", test.getCost());
   }
   @Test
   public void testSetFlightCost() {
      test.setCost("$250");
      assertEquals("$250", test.getCost());
   }
   
   // Test for getting and setting destination
   @Test
   public void testGetFlightDestination() {
      assertEquals("Destination1", test.getDestination());
   }
   @Test
   public void testSetFlightDestination() {
      test.setDestination("Destination2");
      assertEquals("Destination2", test.getDestination());
   }
   
   // Test for getting and setting departure
   @Test
   public void testGetFlightDeparture() {
      assertEquals("Departure1", test.getDeparture());
   }
   @Test
   public void testSetFlightDeparture() {
      test.setDeparture("Departure2");
      assertEquals("Departure2", test.getDeparture());
   }
   
   // Test for getting and setting arrival
   @Test
   public void testGetFlightArrival() {
      assertEquals("Arrival1", test.getArrival());
   }
   @Test
   public void testSetFlightArrival() {
      test.setArrival("Arrival2");
      assertEquals("Arrival2", test.getArrival());
   }
   
   // Test for getting and setting duration
   @Test
   public void testGetFlightDuration() {
      assertEquals("2 hours", test.getDuration());
   }
   @Test
   public void testSetFlightDuration() {
      test.setDuration("3 hours");
      assertEquals("3 hours", test.getDuration());
   }
   
   // Test for getting and setting total seats
   @Test
   public void testGetFlightTotalSeats() {
      assertEquals(150, test.getTotalSeats());
   }
   @Test
   public void testSetFlightTotalSeats() {
      test.setTotalSeats(200);
      assertEquals(200, test.getTotalSeats());
   }
   
   // Test for getting and setting taken seats
   @Test
   public void testGetFlightTakenSeats() {
      assertEquals(50, test.getTakenSeats());
   }
   @Test
   public void testSetFlightTakenSeats() {
      test.setTakenSeats(60);
      assertEquals(60, test.getTakenSeats());
   }
   
   // Test for getting and setting available seats
   @Test
   public void testGetFlightAvailableSeats() {
      assertEquals(100, test.getAvailableSeats());
   }
   @Test
   public void testSetFlightAvailableSeats() {
      test.setAvailableSeats(90);
      assertEquals(90, test.getAvailableSeats());
   }
   
   // Test for getting and setting seat name
   @Test
   public void testGetFlightSeatName() {
      assertEquals("A1", test.getSeatName());
   }
   @Test
   public void testSetFlightSeatName() {
      test.setSeatName("B1");
      assertEquals("B1", test.getSeatName());
   }
   
   // Test for getting and setting terminal
   @Test
   public void testGetFlightTerminal() {
      assertEquals("Terminal1", test.getTerminal());
   }
   @Test
   public void testSetFlightTerminal() {
      test.setTerminal("Terminal2");
      assertEquals("Terminal2", test.getTerminal());
   }
   
   // Test for getting and setting gate
   @Test
   public void testGetFlightGate() {
      assertEquals("Gate1", test.getGate());
   }
   @Test
   public void testSetFlightGate() {
      test.setGate("Gate2");
      assertEquals("Gate2", test.getGate());
   }
}
