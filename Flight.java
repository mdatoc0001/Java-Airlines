public class Flight {
    private String name;
    private String departAirport;
    private String arrivalAirport;
    private String departDate;
    private String arrivalDate;
    private String departTime;
    private String arrivalTime;
    private String terminal;
    private int gate;
    private int totalSeats;
    private int takenSeats;
    private int availableSeats;
    private String cost;
    private String duration;
    public Flight (String n, String da, String aa, String dd, String ad, String dt, String at, int t, int g, int ts, String tas, String as, String c, String d) {
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
