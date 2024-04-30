// importing java library
package application;

import java.util.Arrays;
// Flight Class
public class Flight {
	
	private static final Flight instance = new Flight();

	private Flight(){}

	public static Flight getInstance() {

		return instance;
	}
	
    // declaring variables
    private String name;
    private String departCity;
    private String arrivalCity;
    private String departDate;
    private String arrivalDate;
    private String departTime;
    private String arrivalTime;
    private String terminal;
    private String gate;
    private String totalSeats;
    private String takenSeats;
    private String availableSeats;
    private String cost;
    private String duration;
    private String bookStatus;
    
    // Constructor method using manual string parameters
    public void setFlight(String n, String da, String aa, String dd, String ad, String dt, String at, String t, String g, String ts, String tas, String as, String c, String d, String b) {
        this.name = n;
        this.departCity = da;
        this.arrivalCity = aa;
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
    
    // Constructor method for String List of Flight Details
    public Flight (String[] flightDetails) {
    	
    	if (flightDetails.length == 15) {
    		
    	
        this.name = flightDetails[0];
        this.departCity = flightDetails[1];
        this.arrivalCity = flightDetails[2];
        this.departDate = flightDetails[3];
        this.arrivalDate = flightDetails[4];
        this.departTime = flightDetails[5];
        this.arrivalTime = flightDetails[6];
        this.terminal = flightDetails[7];
        this.gate = flightDetails[8];
        this.totalSeats = flightDetails[9];
        this.takenSeats = flightDetails[10];
        this.availableSeats = flightDetails[11];
        this.cost = flightDetails[12];
        this.duration = flightDetails[13];
        this.bookStatus = flightDetails[14];
        
    	} else {
            throw new IllegalArgumentException("Invalid flight data");
        }
    }
    
    // Set Flight details based on Flight object
    public void setFlight (Flight flightDetails) {
    	
        this.name = flightDetails.getName();
        this.departCity = flightDetails.getDepartCity();
        this.arrivalCity = flightDetails.getArrivalCity();
        this.departDate = flightDetails.getDepartDate();
        this.arrivalDate = flightDetails.getArrivalDate();
        this.departTime = flightDetails.getDepartTime();
        this.arrivalTime = flightDetails.getArrivalTime();
        this.terminal = flightDetails.getTerminal();
        this.gate = flightDetails.getGate();
        this.totalSeats = flightDetails.getTotalSeats();
        this.takenSeats = flightDetails.getTakenSeats();
        this.availableSeats = flightDetails.getAvailableSeats();
        this.cost = flightDetails.getCost();
        this.duration = flightDetails.getDuration();
        this.bookStatus = flightDetails.getBookStatus();
      
    }
    
    //Getters
    public String getName() {
         return this.name;
    }
    public String getDepartCity() {
         return this.departCity;
    }
    public String getArrivalCity() {
         return this.arrivalCity;
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
    public String getGate() {
        return this.gate;
    }
    public String getTotalSeats() {
        return this.totalSeats;
    }
    public String getTakenSeats() {
        return this.takenSeats;
    }
    public String getAvailableSeats() {
      return this.availableSeats;
    }
    public String getCost() {
      return this.cost;
    }
    public String getDuration() {
        return this.duration;
    }

    public String getBookStatus() {
        return this.bookStatus;
    }
    
    //Setters
    public void setName(String n) {
        this.name = n;
    }
    public void setDepartCity(String da) {
        this.departCity = da;
    }
    public void setArrivalCity(String aa) {
        this.arrivalCity = aa;
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
    public void setGate(String g) {
        this.gate = g;
    }
    public void setTotalSeats(String ts) {
        this.totalSeats = ts;
    }
    public void setTakenSeats(String tas) {
        this.takenSeats = tas;
    }
    public void setAvailableSeats(String as) {
        this.availableSeats = as;
    }
    public void setCost(String c) {
        this.cost = c;
    }
    public void setDuration(String d) {
        this.duration = d;
    }
    public void setBookStatus(String b) {
        this.bookStatus = b;
    }
    
    // Implemented toString method to combine all variables of the flight for user readability.
    public String toString() {
        return getName() + "," + getDepartCity() + "," + getArrivalCity() + "," + getDepartDate() + "," + getArrivalDate() + "," + getDepartTime() + "," + getArrivalTime() + "," + getTerminal() + "," + getGate() + "," + getTotalSeats() + "," + getTakenSeats() + "," + getAvailableSeats() + "," + getCost() + "," + getDuration() + "," + getBookStatus();
    }
}
