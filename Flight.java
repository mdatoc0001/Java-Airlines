public class Flight {
    private String name;
    private String date;
    private double cost;
    private String departure;
    private String arrival;
    private String duration;
    private int totalSeats;
    private int takenSeats;
    private int availableSeats;
    private String seatName;
    public Flight (String name, String date, double cost, String departure, String arrival, String duration, int totalSeats, int takenSeats, int availableSeats, String seatName) {
        this.name = name;
        this.date = date;
        this.cost = cost;
        this.departure = departure;
        this.arrival = arrival;
        this.duration = duration;
        this.totalSeats = totalSeats;
        this.takenSeats = takenSeats;
        this.availableSeats = availableSeats;
        this.seatName = seatName;
    }
    
    //Getters
    public String getName() {
         return this.name;
    }
    public String getDate() {
         return this.date;
    }
    public double getCost() {
         return this.cost;
    }
    public String getDeparture() {
         return this.departure;
    }
    public String getArrival() {
         return this.arrival;
    }
    public String getDuration() {
         return this.duration;
    }
    public int getTotalSeats() {
        return this.totalSeats;
    }
    public int getTakenSeats() {
        return this.takenSeats;
    }
    public int getAvailableSeats() {
        return this.availableSeats;
    }
    public String getSeatName() {
        return this.seatName;
    }
    
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setDeparture(String departure) {
        this.departure = departure;
    }
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
    public void setTakenSeats(int takenSeats) {
        this.takenSeats = takenSeats;
    }
    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }
}
