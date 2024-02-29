public class Flight {
    private String name;
    private String date;
    private String cost;
    private String departure;
    private String arrival;
    private String duration;
    public Flight (String name, String date, String cost, String departure, String arrival, String duration) {
        this.name = name;
        this.date = date;
        this.cost = cost;
        this.departure = departure;
        this.arrival = arrival;
        this.duration = duration;
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
    public String getDeparture() {
         return this.departure;
    }
    public String getArrival() {
         return this.arrival;
    }
    public String getDuration() {
         return this.duration;
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

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
