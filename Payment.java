import java.util.Date;
import java.time.LocalTime;
import java.util.Scanner;

public class Payment {
   private String paymentMethod;
   private String cardType;
   private String name;
   private String accountType;
   private String address;
   private String validityDate;
   private String cost;
   private boolean paymentStatus;
   protected int cardNo;
   protected int accountNo;
   protected int cvv;
   protected int routingNo;
   protected int paymentID;
   public int phoneNo;
   
   LocalTime timeOpened = LocalTime.now();
   Date dateOpened = new Date();
   
   public LocalTime getTimeOpened() {
      return timeOpened;
   }

   public Date getdateOpened() {
      return dateOpened;
   }
   
   public void displayPaymentInfo() {
      System.out.println("\nPayment Details:");
      System.out.println("Payment Method: " + paymentMethod);
      if (paymentMethod.equals("banktransfer")) { //selection1
         System.out.println("Name of Account Holder: " + name);
         System.out.println("Billing Address: " + address);
         System.out.println("Phone no: " + phoneNo);
         System.out.println("Account Type: " + accountType);
         System.out.println("Account no: " + accountNo);
         System.out.println("Routing no: " + routingNo);
         System.out.println("Payment ID: " + paymentID);
         System.out.println("Payment date:" + dateOpened); 
         System.out.println("Payment Time" + timeOpened); 
         System.out.println("Total Amount paid: " + cost); 
      } else { //selection2
         System.out.println("Card Type: " + cardType);
         System.out.println("Name of Card Holder: " + name);
         System.out.println("Billing Address: " + address);
         System.out.println("Phone no: " + phoneNo);
         System.out.println("Card No: " + cardNo); 
         System.out.println("CVV: " + cvv); 
         System.out.println("Valid Thru: " + validityDate);
         System.out.println("Payment ID: " + paymentID);
         System.out.println("Payment date:" + dateOpened);
         System.out.println("Payment Time" + timeOpened);
         System.out.println("Total Amount paid: " + cost); 
         System.out.println("***************************");
      }
   }
   
   public void Payment() {
      Scanner scanner = new Scanner(System.in);
      int selection;
      while(true) {
         System.out.println("Enter Payment Details below:");
         System.out.println("***************************");
         System.out.println("1. Pay by Bank transfer");
         System.out.println("2. Pay by Debit/Credit card");
         System.out.println("3. Make payment later");
         System.out.print("\nEnter selection:");
         selection = scanner.nextInt();
      
         switch(selection) {
            case 1:
               bankTransfer();
               break;
            case 2:
               card();
               break;
            case 3:
               System.out.println("See you later!");
               System.out.println("***************************");
               paymentStatus = false;
               System.exit(1);
               break;
            default:
               System.out.println("\nInvalid Selection! Please select a number from 1 to 3");
               break;
         }
      }
   }
   public void bankTransfer() {
      Scanner scanner = new Scanner(System.in);
      paymentMethod="banktransfer";
      System.out.println("***************************");
      System.out.println("Enter the name of account holder: ");
      name = scanner.nextLine();
      
      System.out.println("Enter billing address: " + address);
      address = scanner.nextLine();
      
      System.out.println("Enter Phone no: " + phoneNo);
      phoneNo = scanner.nextInt();
      scanner.nextLine();
      
      System.out.println("Enter Account Type: " + accountType);
      accountType = scanner.nextLine();
      
      System.out.println("Enter Account no: " + accountNo);
      accountNo = scanner.nextInt();
      scanner.nextLine();
      
      System.out.println("Enter Rounting no: " + routingNo);
      routingNo = scanner.nextInt();
      scanner.nextLine();
      
      System.out.println("Total amount: " + cost);
      
      System.out.println("Confirm payement? yes/no"); 
      String response=scanner.next();
      if (response.equals("yes")) {
         generateID();
         paymentStatus = true;
         System.out.println("Your Payment ID: " + paymentID);
         System.out.println("Thank you for your payment");
      } else {
         paymentStatus = false;
         System.out.println("Review amount in the reservation details and come back");
         System.out.println("***************************");
         System.exit(0);
      }
   }
   
   public void card() {
      Scanner scanner = new Scanner(System.in);
      paymentMethod="card";
      System.out.println("***************************");
      System.out.println("Enter Card Type(Debit/Credit): " + cardType);  
      cardType = scanner.nextLine();
     
      System.out.println("Enter name of card holder: " + name);
      name = scanner.nextLine();
      
      System.out.println("Enter Billing Address: " + address);
      address = scanner.nextLine();
      
      System.out.println("Enter Phone no: " + phoneNo);
      phoneNo = scanner.nextInt();
      scanner.nextLine();
                  
      System.out.println("Card No: " + cardNo); 
      //give invalid message if the length of card no is not equal to 16
      cardNo = scanner.nextInt();
      scanner.nextLine();
      int count = cardNoLength(cardNo);
      while(count != 16) {
         System.out.println("Invalid card number! Try again.");
         cardNo = scanner.nextInt();
         scanner.nextLine();
         count = cardNoLength(cardNo);
      }
      
      
      System.out.println("CVV: " + cvv); 
      cvv = scanner.nextInt();
      scanner.nextLine();
      int length = cvvLength(cvv);
      while (length != 3) { //the length of cvv must be three digits
         System.out.println("Invalid CVV! Try again.");
         cvv = scanner.nextInt();
         scanner.nextLine();
         count = cvvLength(cvv);
      }
      
      
      System.out.println("Valid Thru: " + validityDate);
      validityDate = scanner.nextLine();
            
      System.out.println("Total amount: " + cost); 
      
      System.out.println("Confirm payement? yes/no");
      String response = scanner.next();
      if (response.equals("yes")) {
         generateID();
         paymentStatus = true;
         System.out.println("Your Payment ID: " + paymentID);
         System.out.println("Thank you for your payment");
      } else {
         paymentStatus = false;
         System.out.println("Review amount in the reservation details and come back");
         System.out.println("***************************");
         System.exit(0);
      }
   }
   
   public void generateID() 
   {
      paymentID = (int)(Math.random() * 5000 +2000);
   }
   
   public int cardNoLength(int cardNo) //checks the length of cardNo
   {
      int temp = cardNo;
      int count = 0;
      while(temp > 0)
      {
         count++;
         temp = temp / 10;
      }
      return count;
   }
   
   public int cvvLength(int cvv) //checks the length of cvv
   {
      int temp = cvv;
      int length = 0;
      while(temp > 0)
      {
         length++;
         temp = temp / 10;
      }
      return length;
   }
   
}
