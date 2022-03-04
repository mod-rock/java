package contact_details_of_hosteller;

public class Student {
	protected int studentId;
	protected String name;
	protected int departmentId;
	protected String gender;
	protected int phone;
	// student id
	public void setStudentId(int s_id) {
		this.studentId = s_id;
	}
	
	public int getStudentId() {
		return studentId;
	}
	// student name
	public void setStudentName(String s_name) {
		this.name = s_name;
	}
	
	public String getStudentName() {
		return name;
	}
	// department id
	public void setDepartmentId(int d_id) {
		this.departmentId = d_id;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	// gender
	public void setGender(String gender_i) {
		this.gender = gender_i;
	}
	public String getGender() {
		return gender;
	}
	// phone
	public void setPhone(int phone_i) {
		this.phone = phone_i;
	}
	
	public int getPhone() {
		return phone;
	}
}
