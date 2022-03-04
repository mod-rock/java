package contact_details_of_hosteller;

public class Hosteller extends Student {
	private String hostelName;
	private int roomNumber;
	// hostel name
	public void setHostelName(String hostel) {
		this.hostelName = hostel;
	}
	
	public String getHostelName() {
		return hostelName;
	}
	// room number
	public void setRoomNumber(int no) {
		this.roomNumber = no;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
}
