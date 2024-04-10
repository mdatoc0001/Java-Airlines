public class Reservation {
    private Flight flight;
    private Airport airport;
    private boolean isConfirmed;

    public Reservation(Flight flight, Airport airport) {
        this.flight = flight;
        this.airport = airport;
        this.isConfirmed = false; // Default reservation status is not confirmed
    }

    // Getters
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
        return "Reservation{" +
                "flight=" + flight.getName() +
                ", airport=" + airport.getName() +
                ", isConfirmed=" + isConfirmed +
                '}';
    }
}
