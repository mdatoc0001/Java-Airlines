import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class AirportTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   Airport test = new Airport("LAX");

   /** A test that always passes. **/
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 1, 1);
   }
   
   /** Airport class tests **/
   @Test
   public void testGetAirportName() {
      assertEquals("LAX", test.getName());
   }
   @Test
   public void testMakeFlight() {
      test.makeFlight("Flight1", "2024-03-10", "$200", "Destination1", "Departure1", "Arrival1",
                      "2 hours", 150, 50, 100, "A1", "Terminal1", "Gate1");
      assertTrue(test.getFlights() != null); // Assert there are flights for airport
   }
   @Test
   public void testGetNumFlights() {
      test.makeFlight("Flight1", "2024-03-10", "$200", "Destination1", "Departure1", "Arrival1",
                      "2 hours", 150, 50, 100, "A1", "Terminal1", "Gate1");
      assertEquals(1, test.getNumFlights());
   }
   @Test
   public void testSetName() {
      test.makeFlight("Flight1", "2024-03-10", "$200", "Destination1", "Departure1", "Arrival1",
                      "2 hours", 150, 50, 100, "A1", "Terminal1", "Gate1");
      test.setName("John Wayne Airport");
      assertEquals("John Wayne Airport", test.getName());
   }
   @Test
   public void testGetFlights() {
      test.makeFlight("Flight1", "2024-03-10", "$200", "Destination1", "Departure1", "Arrival1",
                      "2 hours", 150, 50, 100, "A1", "Terminal1", "Gate1");
      Flight[] flight1 = test.getFlights();
      assertEquals("Flight1", flight1[0].getName()); 
   }
}
