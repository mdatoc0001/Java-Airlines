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
      test.makeFlight("Flight1", "LAX", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal1", 1, 150, 50, 100, "$200", "2 hours", false);
      assertEquals("LAX", test.getName());
   }
   @Test
   public void testMakeFlight() {
      test.makeFlight("Flight1", "LAX", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal1", 1, 150, 50, 100, "$200", "2 hours", false);
      assertTrue(test.getFlights() != null); // Assert there are flights for airport
   }
   @Test
   public void testGetNumFlights() {
      test.makeFlight("Flight1", "LAX", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal1", 1, 150, 50, 100, "$200", "2 hours", false);
      assertEquals(1, test.getNumFlights());
   }
   @Test
   public void testSetName() {
      test.makeFlight("Flight1", "LAX", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal1", 1, 150, 50, 100, "$200", "2 hours", false);
      test.setName("John Wayne Airport");
      assertEquals("John Wayne Airport", test.getName());
   }
   @Test
   public void testGetFlights() {
      test.makeFlight("Flight1", "LAX", "BNA", "2024-03-10", "2024-03-10", "Departure1", "Arrival1",
                "Terminal1", 1, 150, 50, 100, "$200", "2 hours", false);
      Flight[] flights = test.getFlights();
      assertEquals("Flight1", flights[0].getName()); 
   }
}
