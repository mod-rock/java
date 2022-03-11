package flight_management_jdbc;

import java.sql.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter flight ID:");
		int flightid_in = sc.nextInt();
		System.out.println("Enter source:");
		String source_in = sc.next();
		System.out.println("Enter destination:");
		String destination_in = sc.next();
		System.out.println("Enter number of seats:");
		int noOfSeats_in = sc.nextInt();
		System.out.println("Enter flight fare:");
		double flightFare_in = sc.nextDouble();
		
		Flight flight = new Flight(flightid_in, source_in, destination_in, noOfSeats_in, flightFare_in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightmanagement","root","0000");
			PreparedStatement ps = con.prepareStatement("insert into flight values(?,?,?,?,?)");
			ps.setInt(1, flight.getFlightId());
			ps.setString(2, flight.getSource());
			ps.setString(3, flight.getDestination());
			ps.setInt(4, flight.getNoOfSeats());
			ps.setDouble(5, flight.getFlightFare());
			ps.execute();
			System.out.println("insertion complete");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
