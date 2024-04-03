import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class FlightTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   Flight test = new Flight("Flight1", "LAX", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal1", 1, 150, 50, 100, "$200", "2 hours", false);

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
   
   // Test for getting and setting gate
   @Test
   public void testGetFlightGate() {
      assertEquals(1, test.getGate());
   }
   @Test
   public void testSetFlightGate() {
      test.setGate(22);
      assertEquals(22, test.getGate());
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
   
   // Test for getting and setting departure
   @Test
   public void testGetFlightDeparture() {
      assertEquals("LAX", test.getDepartAirport());
   }
   @Test
   public void testSetFlightDeparture() {
      test.setDepartAirport("Departure2");
      assertEquals("Departure2", test.getDepartAirport());
   }
   
   // Test for getting and setting arrival
   @Test
   public void testGetFlightArrival() {
      assertEquals("BNA", test.getArrivalAirport());
   }
   @Test
   public void testSetFlightArrival() {
      test.setArrivalAirport("Airport2");
      assertEquals("Airport2", test.getArrivalAirport());
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
   
   // Test for getting and setting total seats
   @Test
   public void testGetTotalSeats() {
      assertEquals(150, test.getTotalSeats());
   }
   @Test
   public void testSetTotalSeats() {
      test.setTotalSeats(200);
      assertEquals(200, test.getTotalSeats());
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
   
   //Test for book status
   @Test
   public void testGetBookStatus() {
      assertEquals(false, test.getBookStatus());
   }
   @Test
   public void testSetBookStatus() {
      test.setBookStatus(true);
      assertEquals(true, test.getBookStatus());
   }
}
