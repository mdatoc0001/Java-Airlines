import java.util.*; 

public class Airport {
    private Flight flight;

    //constructor
    public Airport(String name, String date, String cost, String departure, String arrival, String duration) {
        this.flight = new Flight(name, date, cost, departure, arrival, duration);
    }
    
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("List of available airports: \n 1. LAX Airport \n 2. BNA Airport");
      System.out.print("Select which airport you are departing out of (1 or 2): ");
      try{
         int input = scan.nextInt();
         
         //LAX Airport
         if(input == 1) {
            System.out.println("\nLAX Airport selected. Select a flight below to view details.");
            Flight f1 = new Flight("Flight 287","Date: 2/28/24","$112.97","Departure: 3:53 PST","Arrival: 9:53 CST","4 hours");
            Flight f2 = new Flight("Flight 312","Date: 2/29/24","$115.97","Departure: 3:53 PST","Arrival: 9:53 CST","4 hours");
            System.out.println("1. " + f1.name);
            System.out.println("2. " + f2.name);
            System.out.print("Select which flight to view (1 or 2): ");
            input = scan.nextInt();

            if(input == 1) {
               System.out.println(f1.name + ", " + f1.date + ", " + f1.cost + ", " + f1.departure + ", " + f1.arrival + ", " + f1.duration);
            }
            if(input == 2) {
               System.out.println(f2.name + ", " + f2.date + ", " + f2.cost + ", " + f2.departure + ", " + f2.arrival + ", " + f2.duration);
            }
         }
         
         //BNA Airport
         else if(input == 2) {
            System.out.println("\nBNA Airport selected. Select a flight below to view details.");
            Flight f1 = new Flight("Flight 299","Date: 2/28/24","$112.97","Departure: 3:53 PST","Arrival: 9:53 CST","4 hours");
            Flight f2 = new Flight("Flight 355","Date: 2/29/24","$115.97","Departure: 3:53 PST","Arrival: 9:53 CST","4 hours");
            System.out.println("1. " + f1.name);
            System.out.println("2. " + f2.name);
            System.out.print("Select which flight to view (1 or 2): ");
            input = scan.nextInt();
            if(input == 1) {
               System.out.println(f1.name + ", " + f1.date + ", " + f1.cost + ", " + f1.departure + ", " + f1.arrival + ", " + f1.duration);
            }
            if(input == 2) {
               System.out.println(f2.name + ", " + f2.date + ", " + f2.cost + ", " + f2.departure + ", " + f2.arrival + ", " + f2.duration);
            }

         }
         else {
            System.out.println("\nInput error, select a listed value (1 or 2)");
         }
      }
      catch (Exception e) {
         System.out.println("\n\tInput error, input an applicable NUMBER to select from (1 or 2)");
      }

    }

}