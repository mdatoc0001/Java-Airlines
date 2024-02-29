public class Flight {
    // declaring variables
    protected String name;
    protected String date;
    protected double cost;
    protected String departure;
    protected String arrival;
    protected String duration;
    protected int totalSeats;
    protected int takenSeats;
    protected int availableSeats;
    protected String seatNumber;

    public Flight (String name, String date, double cost, String departure, String arrival, String duration, int totalSeats, int takenSeats, int availableSeats, String seatNumber) {
        this.name = name;
        this.date = date;
        this.cost = cost;
        this.departure = departure;
        this.arrival = arrival;
        this.duration = duration;
        this.totalSeats = totalSeats;
        this.takenSeats = takenSeats;
        this.availableSeats = availableSeats;
        this.seatNumber = seatNumber;
    }

}
