public class Reservation {
    private Flight flight;
    private Airport airport;
    private boolean isConfirmed;
    private UserInfo user;

    public Reservation(UserInfo user, Flight flight, Airport airport) {
        this.flight = flight;
        this.airport = airport;
        this.isConfirmed = false; // Default reservation status is not confirmed
        this.user = user;
    }

    // Getters
    public UserInfo getUser() {
        return user;
    }
    
    public Flight getFlight() {
        return flight;
    }

    public Airport getAirport() {
        return airport;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    // Setters
    public void setUser(UserInfo user) {
        this.user = user;
    }
    public void setFlight(Flight flight) {
        if(flight.getBookStatus() == false) {
           this.flight = flight;
        }
        else {
           System.out.println("Error, flight is already booked.");
        }
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

    // Method to confirm the reservation
    public void confirmReservation() {
        isConfirmed = true;
        flight.setBookStatus(true); // Mark the flight as booked
    }

    // Method to cancel the reservation
    public void cancelReservation() {
        isConfirmed = false;
        flight.setBookStatus(false); // Mark the flight as not booked
    }

    // Override toString() method to provide a meaningful string representation of the reservation
    @Override
    public String toString() {
        return "Reservation:" +
               "\n flight: " + flight.getName() +
               "\n airport: " + airport.getName() +
               "\n destination: " + flight.getArrivalAirport() +
               "\n terminal: " + flight.getTerminal() + 
               "\n gate: " + flight.getGate() +
               "\n date: " + flight.getDepartDate() + ", " + flight.getDepartTime() +
               "\n isConfirmed: " + isConfirmed +
               "\n Customer Name: " + user.getName() +
               "\n Username: " + user.getUserName() +
               "\n Age: " + user.getAge() +
               "\n Phone: " + user.getPhone() +
               "\n Country: " + user.getCountry() +
               "\n";
    }
    
    //Test reservation
    public static void main(String[] Args) {
        
        /*
        getName() + " " + getDepartAirport() + " " + getArrivalAirport() + " " + getDepartDate() + " " 
       + getArrivalDate() + " " + getDepartTime() + " " + getArrivalTime() + " " + getTerminal() + " " + getGate() + " " 
       + getTotalSeats() + " " + getTakenSeats() + " " + getAvailableSeats() + " " + getCost() + " " + getDuration() + " " + getBookStatus();
        */
        
        // Create user
        UserInfo user = UserInfo.getInstance();

        // Set user information
        user.setUserInfo("John Smith", "johnnySmith123", "30", "1234567890", "USA", "ABCD1234", "password");
        
        //Make an Airport
        Airport airport = new Airport("LAX");
        
        //Make flight for airport
        airport.makeFlight("Flight 238", "LAX", "JFK", "2024-03-10", "2024-03-10", "1:35 AM", "Arrival1",
                                   "Terminal B", 99, 150, 50, 100, "$200", "2 hours", false);
        
        //Make array to access flights from LAX                           
        Flight[] flights = airport.getFlights();

        // Create a Reservation instance with the user, flight, and airport
        Reservation reservation = new Reservation(user, flights[0], airport);

        // Print the reservation details
        System.out.println(reservation.toString());
        
        // Other test cases
        UserInfo user2 = UserInfo.getInstance();
        user2.setUserInfo("George Baldwin", "gbald245", "20", "5554443327", "USA", "ABCD1234", "password");
        airport.makeFlight("Flight 542", "LAX", "JFK", "2024-04-10", "2024-04-10", "5:35 AM", "Arrival1",
                                   "Terminal F", 99, 150, 50, 100, "$195.67", "2.5 hours", true);    
        flights = airport.getFlights(); // update airport flights                 
        Reservation reservation2 = new Reservation(user2, flights[1], airport);
        reservation2.confirmReservation();
        System.out.println(reservation2.toString());
        
         UserInfo user3 = UserInfo.getInstance();
         user3.setUserInfo("Emily Johnson", "emilyj345", "25", "9876543210", "Canada", "WXYZ5678", "password123");
         airport.makeFlight("Flight 789", "LAX", "ORD", "2024-05-15", "2024-05-15", "10:00 AM", "1:30 PM",
                            "Terminal C", 15, 200, 80, 120, "$250", "3 hours", false);
         flights = airport.getFlights();
         Reservation reservation3 = new Reservation(user3, flights[2], airport);
         reservation3.confirmReservation();
         System.out.println(reservation3.toString());
         
         UserInfo user4 = UserInfo.getInstance();
         user4.setUserInfo("Sophia Smith", "sophias890", "35", "1231231234", "UK", "EFGH9101", "password456");
         airport.makeFlight("Flight 123", "LAX", "MIA", "2024-06-20", "2024-06-20", "1:45 PM", "5:15 PM",
                            "Terminal B", 20, 180, 60, 120, "$300", "4 hours", false);
         flights = airport.getFlights();
         Reservation reservation4 = new Reservation(user4, flights[3], airport);
         reservation4.confirmReservation();
         System.out.println(reservation4.toString());
         
         UserInfo user5 = UserInfo.getInstance();
         user5.setUserInfo("Michael Davis", "miked123", "30", "4564564567", "Australia", "IJKL1112", "password789");
         airport.makeFlight("Flight 456", "LAX", "SFO", "2024-07-25", "2024-07-25", "7:30 PM", "9:00 PM",
                            "Terminal A", 10, 170, 50, 120, "$180", "1.5 hours", false);
         flights = airport.getFlights();
         Reservation reservation5 = new Reservation(user5, flights[4], airport);
         reservation5.confirmReservation();
         System.out.println(reservation5.toString());
         
         //New airport
         Airport airport2 = new Airport("JFK");
         UserInfo user6 = UserInfo.getInstance();
         user6.setUserInfo("Emma Thompson", "emmat567", "28", "7897897890", "France", "LMNO1314", "passwordabc");
         airport2.makeFlight("Flight 789", "JFK", "LAS", "2024-08-30", "2024-08-30", "12:00 PM", "1:30 PM",
                   "Terminal D", 25, 190, 70, 120, "$220", "2 hours", false);
         Flight[] flights2 = airport2.getFlights();
         Reservation reservation6 = new Reservation(user6, flights2[0], airport2);
         reservation6.confirmReservation();
         System.out.println(reservation6.toString());

         UserInfo user7 = UserInfo.getInstance();
         user7.setUserInfo("Daniel Brown", "danb456", "33", "5556667777", "Germany", "EFGH2122", "password123");
         airport2.makeFlight("Flight 123", "JFK", "LAX", "2024-09-15", "2024-09-15", "9:30 AM", "12:00 PM",
                             "Terminal A", 20, 180, 60, 120, "$250", "2.5 hours", false);
         flights2 = airport2.getFlights();
         Reservation reservation7 = new Reservation(user7, flights2[1], airport2);
         reservation7.confirmReservation();
         System.out.println(reservation7.toString());
         
         UserInfo user8 = UserInfo.getInstance();
         user8.setUserInfo("Isabella Wilson", "izzyw890", "29", "8889990000", "France", "IJKL2324", "password456");
         airport2.makeFlight("Flight 456", "JFK", "SFO", "2024-10-20", "2024-10-20", "3:00 PM", "6:00 PM",
                             "Terminal B", 15, 200, 80, 120, "$300", "3 hours", false);
         flights2 = airport2.getFlights();
         Reservation reservation8 = new Reservation(user8, flights2[2], airport2);
         reservation8.confirmReservation();
         System.out.println(reservation8.toString());
         
         UserInfo user9 = UserInfo.getInstance();
         user9.setUserInfo("Oliver Parker", "oliverp345", "34", "1112223333", "Canada", "LMNO2526", "password789");
         airport2.makeFlight("Flight 789", "JFK", "ORD", "2024-11-25", "2024-11-25", "6:00 AM", "9:30 AM",
                             "Terminal C", 25, 170, 50, 120, "$200", "3.5 hours", false);
         flights2 = airport2.getFlights();
         Reservation reservation9 = new Reservation(user9, flights2[3], airport2);
         reservation9.confirmReservation();
         System.out.println(reservation9.toString());
         
         UserInfo user10 = UserInfo.getInstance();
         user10.setUserInfo("Amelia Harris", "ameliah789", "31", "4445556666", "UK", "PQRS2728", "passwordabc");
         airport2.makeFlight("Flight 542", "JFK", "MIA", "2024-12-30", "2024-12-30", "8:30 PM", "11:00 PM",
                             "Terminal D", 30, 190, 70, 120, "$280", "2.5 hours", false);
         flights2 = airport2.getFlights();
         Reservation reservation10 = new Reservation(user10, flights2[4], airport2);
         reservation10.confirmReservation();
         System.out.println(reservation10.toString());
    }
}
