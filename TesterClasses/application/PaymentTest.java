import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class PaymentTest {


   /** Fixture initialization (common initialization for all tests). **/
   @Before public void setUp() {
   }
   
   Payment p = Payment.getInstance();

   /** A test that always passes. **/
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 1, 1);
   }
   
   @Test
   public void testGetName() {
      p.setPaymentInfo("Debit", "Emy", "04/28", "$600", "909076847", "788");
      assertEquals("Emy", p.getName());
   }
   
   @Test
   public void testGetCardType() {
      p.setPaymentInfo("Debit", "Emy", "04/28", "$600", "909076847", "788");
      assertEquals("Debit", p.getCardType());
   }
   
   @Test
   public void testGetValiditydate() {
      p.setPaymentInfo("Debit", "Emy", "04/28", "$600", "909076847", "788");
      assertEquals("04/28", p.getValidityDate());
   }
   
   @Test
   public void testGetCost() {
      p.setPaymentInfo("Debit", "Emy", "04/28", "$600", "909076847", "788");
      assertEquals("$600", p.getCost());
   }
   
   /*@Test
   public void testGetPaymentStatus() {
      assertEquals(true, p.getPaymentStatus());
   }*/
   
   @Test
   public void testGetCardNo() {
      p.setPaymentInfo("Debit", "Emy", "04/28", "$600", "909076847", "788");
      assertEquals("909076847", p.getCardNo());
   }
   
   @Test
   public void testGetCvv() {
      p.setPaymentInfo("Debit", "Emy", "04/28", "$600", "909076847", "788");
      assertEquals("788", p.getCvv());
   }
   
   /*@Test
   public void testGetPaymentID() {
      assertEquals("909090", p.getPaymentID());
   }*/
   
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
      //System.out.println(" ");
   }
   
   @Test
   public void testSetCardNo() {
      p.setCardNo("67838");
      assertEquals("67838", p.getCardNo());
   }
   
   @Test
   public void testSetCvv() {
      p.setCvv("345");
      assertEquals("345", p.getCvv());
   }
   
   @Test
   public void testSetPaymentID() {
      p.setPaymentID("678384");
      assertEquals("678384", p.getPaymentID());
   }
   
}