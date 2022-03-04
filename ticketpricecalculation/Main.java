package ticketpricecalculation;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ticket obj = new Ticket();
		
		System.out.println("Enter no of bookings:");
		int noOfBookings = sc.nextInt();
		System.out.println("Enter the available tickets:");
		obj.setAvailableTickets(sc.nextInt());
		
		for(int i=0; i<noOfBookings; ++i) {
			System.out.println("Enter the ticketid:");
			obj.setTicketid(sc.nextInt());
			System.out.println("Enter the price:");
			obj.setPrice(sc.nextInt());
			System.out.println("Enter the no of tickets:");
			int tickets_needed = sc.nextInt();
			
			System.out.println("Available tickets:" + obj.getAvailableTickets());
			System.out.println("Total amount:" + obj.calculateCost(tickets_needed));
			System.out.println("Available ticket after booking:" + obj.getAvailableTickets());
			}
	}
}
