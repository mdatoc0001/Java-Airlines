import java.util.Arrays;

public class Flight {
    private String name;
    private String date;
    private String cost;
    private String destination;
    private String departure;
    private String arrival;
    private String duration;
    private int totalSeats;
    private int takenSeats;
    private int availableSeats;
    private String seatName;
    private String terminal;
    private String gate;
    public Flight (String name, String date, String cost, String destination, String departure, String arrival, String duration, int totalSeats, 
                   int takenSeats, int availableSeats, String seatName, String terminal, String gate) {
        this.name = name;
        this.date = date;
        this.cost = cost;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.duration = duration;
        this.totalSeats = totalSeats;
        this.takenSeats = takenSeats;
        this.availableSeats = availableSeats;
        this.seatName = seatName;
        this.terminal = terminal;
        this.gate = gate;
    }
    
    //Getters
    public String getName() {
         return this.name;
    }
    public String getDate() {
         return this.date;
    }
    public String getCost() {
         return this.cost;
    }
    public String getDestination() {
        return this.destination;
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
    public String getTerminal() {
      return this.terminal;
    }
    public String getGate() {
      return this.gate;
    }
    
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setCost(String cost) {
        this.cost = cost;
    }
    public void setDestination(String destination) {
        this.destination = destination;
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
    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }
    public void setGate(String gate) {
        this.gate = gate;
    }
}
