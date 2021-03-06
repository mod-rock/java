package flight_management_jdbc;

public class Flight {
	private int flightId;
	private String source;
	private String destination;
	private int noOfSeats;
	private double flightFare;
	
	public void setFlightId(int flightId) {
		this.flightId=flightId;
	}
	
	public void setSource(String source) {
		this.source=source;
	}
	
	public void setDestination(String destination) {
		this.destination=destination;
	}
	
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats=noOfSeats;
	}
	
	public void setFlightFare(double flightFare) {
		this.flightFare=flightFare;
	}
	
	public int getFlightId() {
		return flightId;
	}
	
	public String getSource() {
		return source;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public int getNoOfSeats() {
		return noOfSeats;
	}
	
	public double getFlightFare() {
		return flightFare;
	}
	
	public Flight(int flightId, String source, String destination, int noOfSeats, double flightFare) {
		
		this.flightId=flightId;
		this.source=source;
		this.destination=destination;
		this.noOfSeats=noOfSeats;
		this.flightFare=flightFare;
	}
	
}
