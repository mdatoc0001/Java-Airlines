//package application;

import java.util.Date;
import java.util.Scanner;

public class Payment {
	
	private static final Payment instance = new Payment();

	private Payment(){}

	public static Payment getInstance() {

		return instance;
	}
	
   private String cardType;
   private String name;
   private String validityDate;
   private String cost;
   private boolean paymentStatus;
   protected String cardNo;
   protected String cvv;
   protected String paymentID;
   
   public void setPaymentInfo(String cardType, String name, String validityDate, String cost, String cardNo, String cvv) {
      this.cardType = cardType;
      this.name = name;
      this.validityDate = validityDate; 
      this.cost = cost;
      this.paymentStatus = false;
      this.cardNo = cardNo;
      this.cvv = cvv;
      this.paymentID = generateID();
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
   
   public String getCardNo() {
      return this.cardNo;
   }
   
   public String getCvv() {
      return this.cvv;
   }
   
   public String getPaymentID() {
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
   
   public void setCardNo(String cardNo) {
      this.cardNo = cardNo;
   }
   
   public void setCvv(String cvv) {
      this.cvv = cvv;
   }
   
   public void setPaymentID(String paymentID) {
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
      cardNo = scanner.nextLine();
      scanner.nextLine();
      
      System.out.println("CVV: "); 
      cvv = scanner.nextLine();
      scanner.nextLine();
      while (cvvLength() == false) { //cvv must be three digits, if not give an invalid message
         System.out.println("Invalid CVV! Try again.");
         cvv = scanner.nextLine();
         scanner.nextLine();
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

   //Generates random transaction ID for each successful transaction
   public String generateID() {
	   int temp = (int)(Math.random() * 5000000 +2000);
	   paymentID = Integer.toString(temp);
	   return paymentID;
   }
   
   //Checks the length of card no. for validation
   public boolean validityDateLength() {
	   if (validityDate.length() == 4) {
		   return true;
	   } else {
		   return false;
	   }
   }
   
   //Checks the length of card no. for validation
   public boolean cardNoLength() {
	   if (cardNo.length() == 15) {
		   return true;
	   } else {
		   return false;
	   }
   }
   
   //Checks the length of cvv no. for validation
   public boolean cvvLength() {
	   if (cvv.length() == 2) {
		   return true;
	   } else {
		   return false;
	   }
   }
   
   // ToString Method
   public String toString() {
	   return getCardType() + "," + getName() + "," + getValidityDate() + "," + getCost() + "," + getCardNo() + "," + getCvv();
   }
   
}