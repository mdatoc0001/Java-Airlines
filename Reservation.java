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
    }
}
