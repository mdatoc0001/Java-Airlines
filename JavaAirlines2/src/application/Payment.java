package application;

import java.util.Date;
import java.util.Scanner;

public class Payment {
   private String cardType;
   private String name;
   private String validityDate;
   private String cost;
   private boolean paymentStatus;
   protected int cardNo;
   protected int cvv;
   protected int paymentID;
   
   public Payment(String cardType, String name, String validityDate, String cost, boolean paymentStatus, int cardNo, int cvv, int paymentID) {
      this.cardType = cardType;
      this.name = name;
      this.validityDate = validityDate; 
      this.cost = cost;
      this.paymentStatus = paymentStatus;
      this.cardNo = cardNo;
      this.cvv = cvv;
      this.paymentID = paymentID;
   }
   
   //Getters
   public String getCardType() {
      return this.cardType;
   }
   
   public String getName() {
      return this.name;
   }
   
   public String getValidityDate() {
      return this.validityDate;
   }
   
   public String getCost() {
      return this.cost;
   }
   
   public boolean getPaymentStatus() {
      return this.paymentStatus;
   }
   
   public int getCardNo() {
      return this.cardNo;
   }
   
   public int getCvv() {
      return this.cvv;
   }
   
   public int getPaymentID() {
      return this.paymentID;
   }
     
   //Setters
   public void setCardType(String cardType) {
      this.cardType = cardType;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public void setValidityDate(String validityDate) {
      this.validityDate = validityDate;
   }
   
   public void setCost(String cost) {
      this.cost = cost;
   }
   
   public void setPaymentStatus(boolean paymentStatus) {
      this.paymentStatus = paymentStatus;
   }
   
   public void setCardNo(int cardNo) {
      this.cardNo = cardNo;
   }
   
   public void setCvv(int cvv) {
      this.cvv = cvv;
   }
   
   public void setPaymentID(int paymentID) {
      this.paymentID = paymentID;
   }
   
   Date paymentDate = new Date();
   
   public Date getpaymentDate() {
      return paymentDate;
   }
   
   public void displayPaymentInfo() {
      System.out.println("*****************");
      System.out.println("Payment Details: ");
      System.out.println("*****************");
      System.out.println("Card Type: " + cardType);
      System.out.println("Name of Card Holder: " + name);
      System.out.println("Card No: " + cardNo); 
      System.out.println("CVV: " + cvv); 
      System.out.println("Valid Thru: " + validityDate);
      System.out.println("Payment ID: " + paymentID);
      System.out.println("Payment Date and Time:" + paymentDate);
      System.out.println("Total Amount paid: " + getCost());
      System.out.println("*****************");
   }
   
   public void Payment() {
      Scanner scanner = new Scanner(System.in);
      int selection;
      while(true) {
         System.out.println("****************************");
         System.out.println("Enter Payment Details below:");
         System.out.println("****************************");
         System.out.println("1. Pay by Debit/Credit card");
         System.out.println("2. Make payment later");
         System.out.print("\nEnter selection:");
         selection = scanner.nextInt();
      
         switch(selection) {
            case 1:
               card();
               break;
            case 2:
               System.out.println("\n**************");
               System.out.println("See you later!");
               System.out.println("**************");
               paymentStatus = false;
               System.exit(1);
               break;
            default:
               System.out.println("\nInvalid Selection! Please select option 1 or 2");
               System.out.println(" ");
               break;
         }
      }
   }
   
   public void card() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("***************************");
      System.out.println("Enter Card Type(D for Debit/C for Credit): ");  
      cardType = scanner.nextLine();
     
      System.out.println("Enter name of card holder: ");
      name = scanner.nextLine();
                  
      System.out.println("Card No: "); 
      cardNo = scanner.nextInt();
      scanner.nextLine();
      
      System.out.println("CVV: "); 
      cvv = scanner.nextInt();
      scanner.nextLine();
      int length = cvvLength(cvv);
      while (length != 3) { //cvv must be three digits, if not give an invalid message
         System.out.println("Invalid CVV! Try again.");
         cvv = scanner.nextInt();
         scanner.nextLine();
         length = cvvLength(cvv);
      }
      
      System.out.println("Valid Thru: ");
      validityDate = scanner.nextLine();
            
      System.out.println("Total amount: " + getCost()); 
      
      System.out.println("Confirm payement? yes/no");
      String response = scanner.next();
      if (response.equals("yes")) {
         generateID();
         paymentStatus = true;
         System.out.println(" ");
         System.out.println("***************************");
         System.out.println("Thank you for your payment");
         displayPaymentInfo();
         System.exit(0);
      } else {
         paymentStatus = false;
         System.out.println("Review amount in the reservation details and come back");
         System.out.println("***************************");
         System.exit(0);
      }
   }

   //Generates random transaction ID for each successful transcation
   public void generateID() {
     paymentID = (int)(Math.random() * 5000000 +2000);
   }
   
   //Checks the length of cvv no. for validation
   public int cvvLength(int cvv) {
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
