import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // Create an Airport object
        Airport LAX = new Airport("LAX");

        LAX.makeFlight("Flight1", "2024-03-10", "$200", "Destination1", "Departure1", "Arrival1",
                "2 hours", 150, 50, 100, "A1", "Terminal1", "Gate1");

        LAX.makeFlight("Flight2", "2024-03-15", "$250", "Destination2", "Departure2", "Arrival2",
                "3 hours", 200, 75, 125, "B1", "Terminal2", "Gate2");

        // Display information about the flights stored in the airport
        displayFlights(LAX);
    }

    // Helper method to display information about flights
    private static void displayFlights(Airport airport) {
        System.out.println("Flights in " + airport.getName() + " Airport:");
        for (int i = 0; i < airport.getNumFlights(); i++) {
            Flight flight = airport.getFlights()[i];
            System.out.println("Flight " + (i + 1) + ":");
            System.out.println("  Name: " + flight.getName());
            System.out.println("  Date: " + flight.getDate());
            System.out.println("  Cost: " + flight.getCost());
            System.out.println("  Destination: " + flight.getDestination());
            System.out.println("  Departure: " + flight.getDeparture());
            System.out.println("  Arrival: " + flight.getArrival());
            System.out.println("  Duration: " + flight.getDuration());
            System.out.println("  Total Seats: " + flight.getTotalSeats());
            System.out.println("  Taken Seats: " + flight.getTakenSeats());
            System.out.println("  Available Seats: " + flight.getAvailableSeats());
            System.out.println("  Seat Name: " + flight.getSeatName());
            System.out.println("  Terminal: " + flight.getTerminal());
            System.out.println("  Gate: " + flight.getGate());
            System.out.println();
        }
    }
}