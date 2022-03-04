package ticketpricecalculation;
import java.util.*;

public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public static void setAvailableTickets(int initial_amt) {
		if(initial_amt>0) {
			Ticket.availableTickets = initial_amt;
		}
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getAvailableTickets() {
		return availableTickets;
	}
	
	public int calculateCost(int bookings) {
		if(availableTickets >= bookings) {
			availableTickets -= bookings;
			return (bookings * price);
		}
		else {
			return -1;
		}
	}
	
}
