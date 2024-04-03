import java.util.Arrays;

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
    private boolean bookStatus;
    public Flight (String n, String da, String aa, String dd, String ad, String dt, String at, String t, int g, int ts, int tas, int as, String c, String d, boolean b) {
        this.name = n;
        this.departAirport = da;
        this.arrivalAirport = aa;
        this.departDate = dd;
        this.arrivalDate = ad;
        this.departTime = dt;
        this.arrivalTime = at;
        this.terminal = t;
        this.gate = g;
        this.totalSeats = ts;
        this.takenSeats = tas;
        this.availableSeats = as;
        this.cost = c;
        this.duration = d;
        this.bookStatus = b;
    }
    
    //Getters
    public String getName() {
         return this.name;
    }
    public String getDepartAirport() {
         return this.departAirport;
    }
    public String getArrivalAirport() {
         return this.arrivalAirport;
    }
    public String getDepartDate() {
        return this.departDate;
   }
    public String getArrivalDate() {
         return this.arrivalDate;
    }
    public String getDepartTime() {
         return this.departTime;
    }
    public String getArrivalTime() {
         return this.arrivalTime;
    }
    public String getTerminal() {
        return this.terminal;
    }
    public int getGate() {
        return this.gate;
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
    public String getCost() {
      return this.cost;
    }
    public String getDuration() {
        return this.duration;
    }

    public boolean getBookStatus() {
        return this.bookStatus;
    }
    
    //Setters
    public void setName(String n) {
        this.name = n;
   }
   public void setDepartAirport(String da) {
        this.departAirport = da;
   }
   public void setArrivalAirport(String aa) {
        this.arrivalAirport = aa;
   }
   public void setDepartDate(String dd) {
       this.departDate = dd;
  }
   public void setArrivalDate(String ad) {
        this.arrivalDate = ad;
   }
   public void setDepartTime(String dt) {
        this.departTime = dt;
   }
   public void setArrivalTime(String at) {
        this.arrivalTime = at;
   }
   public void setTerminal(String t) {
       this.terminal = t;
   }
   public void setGate(int g) {
       this.gate = g;
   }
   public void setTotalSeats(int ts) {
       this.totalSeats = ts;
   }
   public void setTakenSeats(int tas) {
       this.takenSeats = tas;
   }
   public void setAvailableSeats(int as) {
       this.availableSeats = as;
   }
   public void setCost(String c) {
       this.cost = c;
   }
   public void setDuration(String d) {
       this.duration = d;
   }

   public void setBookStatus(boolean b) {
       this.bookStatus = b;
   }

   public String toString() {
       return getName() + " " + getDepartAirport() + " " + getArrivalAirport() + " " + getDepartDate() + " " + getArrivalDate() + " " + getDepartTime() + " " + getArrivalTime() + " " + getTerminal() + " " + getGate() + " " + getTotalSeats() + " " + getTakenSeats() + " " + getAvailableSeats() + " " + getCost() + " " + getDuration();
   }
}
