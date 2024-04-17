import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class PaymentTest {


   /** Fixture initialization (common initialization for all tests). **/
   @Before public void setUp() {
   }
   
   Payment p = new Payment("Debit", "Emy", "04/2028", "$600.96", true, 90907, 788, 909090);


   /** A test that always passes. **/
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 1, 1);
   }
   
   @Test
   public void testGetName() {
      assertEquals("Emy", p.getName());
   }
   
   @Test
   public void testGetCardType() {
      assertEquals("Debit", p.getCardType());
   }
   
   @Test
   public void testGetValiditydate() {
      assertEquals("04/2028", p.getValidityDate());
   }
   
   @Test
   public void testGetCost() {
      assertEquals("$600.96", p.getCost());
   }
   
   @Test
   public void testGetPaymentStatus() {
      assertEquals(true, p.getPaymentStatus());
   }
   
   @Test
   public void testGetCardNo() {
      assertEquals(90907, p.getCardNo());
   }
   
   @Test
   public void testGetCvv() {
      assertEquals(788, p.getCvv());
   }
   
   @Test
   public void testGetPaymentID() {
      assertEquals(909090, p.getPaymentID());
   }
   
   @Test
   public void testSetCardType() {
      p.setCardType("Credit");
      assertEquals("Credit", p.getCardType());
   }
   
   @Test
   public void testSetName() {
      p.setName("John");
      assertEquals("John", p.getName());
   }
   
   @Test
   public void testSetValidityDate() {
      p.setValidityDate("05/30");
      assertEquals("05/30", p.getValidityDate());
   }
   
   @Test
   public void testSetCost() {
      p.setCost("$550");
      assertEquals("$550", p.getCost());
   }
   
   @Test
   public void testSetPaymentStatus() {
      p.setPaymentStatus(false);
      assertEquals(false, p.getPaymentStatus());
   }
   
   @Test
   public void testSetCardNo() {
      p.setCardNo(67838);
      assertEquals(67838, p.getCardNo());
   }
   
   @Test
   public void testSetCvv() {
      p.setCvv(345);
      assertEquals(345, p.getCvv());
   }
   
   @Test
   public void testPaymentID() {
      p.setPaymentID(678384);
      assertEquals(678384, p.getPaymentID());
   }

}
