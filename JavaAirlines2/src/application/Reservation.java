package application;

public class Reservation {
    private Flight flight;
    private Airport airport;
    private boolean isConfirmed;
    private UserInfo user;

    private static final Reservation instance = new Reservation();

	private Reservation(){}

	public static Reservation getInstance() {

		return instance;
	}
    
    public void setReservation(UserInfo user, Flight flight, Airport airport) {
    	this.user = user;
    	this.flight = flight;
        this.airport = airport;
        this.isConfirmed = false; // Default reservation status is not confirmed
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
        if(flight.getBookStatus().equals("Available")) {
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
        flight.setBookStatus("Booked"); // Mark the flight as booked
    }

    // Method to cancel the reservation
    public void cancelReservation() {
        isConfirmed = false;
        flight.setBookStatus("Available"); // Mark the flight as not booked
    }

    // Override toString() method to provide a meaningful string representation of the reservation
    @Override
    public String toString() {
        return "Reservation Details:" +
               "\n Flight: " + flight.getName() +
               "\n Airport: " + airport.getName() +
               "\n Destination: " + flight.getArrivalCity() +
               "\n Terminal: " + flight.getTerminal() + 
               "\n Gate: " + flight.getGate() +
               "\n Date: " + flight.getDepartDate() + " - " + flight.getDepartTime() +
               "\n Confirmed?: " + isConfirmed +
               "\n Customer Name: " + user.getName() +
               "\n Username: " + user.getUserName() +
               "\n Age: " + user.getAge() +
               "\n Phone: " + user.getPhone() +
               "\n Country: " + user.getCountry() +
               "\n";
    }
    
}
