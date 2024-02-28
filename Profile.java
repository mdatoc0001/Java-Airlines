import java.util.Scanner;

public class Main {
  String fullName, contactDetails, countryOfOrigin, passportDetails;
  int age;
  static int uniqueID;

public void displayAccountDetails() {
          System.out.println("\nYour Account details:");
          System.out.println("Full Name: " + fullName);
          System.out.println("Age: " + age);
          System.out.println("Contact Details: " + contactDetails);
          System.out.println("Unique ID for User: " + uniqueID);
          System.out.println("Country of Origin: " + countryOfOrigin);
          System.out.println("Passport Details: " + passportDetails);

  System.out.println("********************************");
      }

public void Menu(){
  Scanner scanner = new Scanner(System.in);
  System.out.println("Welcome to Java Airlines™!");
  int userInput;

          while(true){
            System.out.println("Menu");
            System.out.println("--------------------------------");
            System.out.println("1) Create Profile");
            System.out.println("2) View Profile Details");
            System.out.println("3) Reserve Flight");
            System.out.println("4) Make Payment");
            System.out.println("5) Change Reservation");
            System.out.println("6) Logout");
            System.out.print("\nEnter Selection: ");
              userInput = scanner.nextInt();

              switch(userInput){
                  case 1:
                      //call create profile method
                      profileCreation();
                      break;
                  case 2:
                      //call view profile method
                      displayAccountDetails();
                      break;
                  case 3:
                      //Reservation class
                      break;
                  case 4:
                  // Payment class
                  break;
                  case 5:
                  // Change Reservation class 
                  break;
                  case 6:
                  //Logout
                      System.out.println("Logging Out...");
                      System.exit(0);
                      break;
                      default:
                      System.out.println("\nInvalid choice. Please enter a number between 1 and 6.");
                      break;
              }
          }
      }
public void profileCreation(){
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("Enter Full Name:");
    fullName = scanner.nextLine();
  
    System.out.println("Enter Age:");
    age = scanner.nextInt();
    scanner.nextLine();
  
    System.out.println("Enter Phone#:");
    contactDetails = scanner.nextLine();
  
    System.out.println("Enter Country of Origin:");
    countryOfOrigin = scanner.nextLine();
  
    System.out.println("Enter Passport Details:");
    //E00007730
    passportDetails = scanner.nextLine();
  
    userID();

  System.out.println("\n********************************");
  
    System.out.println("Account Created");

  System.out.println("********************************");
  }
  
private static void userID() {
      System.out.print("Unique ID for User Created");
      uniqueID = (int)(Math.random() * 9000 + 1000);
}
  
public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       
        new Main().Menu();

        // Reservation

        // Payment
        

        scanner.close();
    }

}