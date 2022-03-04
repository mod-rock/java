package student_details_constructor;
import java.util.*;
import java.util.jar.Attributes.Name;

public class Main_student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student's Id:");
		int s_id = sc.nextInt();
		System.out.println("Enter Student's Name:");
		String s_name = sc.next();
		System.out.println("Enter Student's address:");
		String s_address = sc.next();
		
		System.out.println("Whether the student is from NIT(Yes/No):");
		String s_NIT = sc.next();
		
		switch(s_NIT.toLowerCase()) {	
		case("yes"): {
			Student student = new Student(s_id, s_name, s_address);
			System.out.println("Student id:" + student.getStudentId());
			System.out.println("Student name:" + student.getStudentName());
			System.out.println("Address:" + student.getStudentAddress());
			System.out.println("College name:" + student.getCollegeName());
			break;
		}
		case("no"): {
			System.out.println("Enter the college name:");
			String collegeName = sc.next();
				
			Student student = new Student(s_id, s_name, s_address, collegeName);
			System.out.println("Student id:" + student.getStudentId());
			System.out.println("Student name:" + student.getStudentName());
			System.out.println("Address:" + student.getStudentAddress());
			System.out.println("College name:" + student.getCollegeName());
			break;
		}
		default:
			System.out.println("Wrong Input");
		
		}
		
	}
}
