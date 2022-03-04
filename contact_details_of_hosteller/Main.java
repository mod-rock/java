package contact_details_of_hosteller;
import java.util.*;

public class Main {
	public static Hosteller getHostellerDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Details:");
		System.out.println("Student Id");
		int s_id = sc.nextInt();
		System.out.println("Student Name");
		String s_name = sc.next();
		System.out.println("Department Id");
		int d_id = sc.nextInt();
		System.out.println("Gender");
		String s_gen = sc.next();
		System.out.println("Phone Number");
		int s_hp = sc.nextInt();
		System.out.println("Hostel Name");
		String h_name = sc.next();
		System.out.println("Room Number");
		int r_no = sc.nextInt();
		System.out.println("Modify Phone Number(Y/N");
		String mod_hp = sc.next();
		if(mod_hp=="Y" || mod_hp=="y") {
			System.out.println("New phone Number");
			s_hp = sc.nextInt();
		}
		
		Hosteller hostel = new Hosteller();
		
		hostel.setStudentId(s_id);
		hostel.setStudentName(s_name);
		hostel.setDepartmentId(d_id);
		hostel.setGender(s_gen);
		hostel.setPhone(s_hp);
		hostel.setHostelName(h_name);
		hostel.setRoomNumber(r_no);
		
		return hostel;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hosteller hostel = getHostellerDetails();
		
		System.out.println("Modify Room Number (Y/N)");
		boolean updateRoom = sc.next().equals("Y");
		if(updateRoom) {
			System.out.println("New Phone Number");
			int phone = sc.nextInt();
			hostel.setPhone(phone);
		}
		
		StringJoiner sj = new StringJoiner(" ");
		sj
		.add(String.valueOf(hostel.getStudentId()))
		.add(hostel.getStudentName())
		.add(String.valueOf(hostel.getDepartmentId()))
		.add(hostel.getGender())
		.add(String.valueOf(hostel.getPhone()))
		.add(hostel.getHostelName())
		.add(String.valueOf(hostel.getRoomNumber()));
		
		System.out.println("The Student Details:");
		System.out.println(sj.toString());
	}
}
