package constructorInjection;

public class Membership {
	private int membershipId;
	private String membershipType;
	private int visitsPerYear;
	private Customer customer;
	
	public int getMembershipId() {
		return membershipId;
	}
	public void setMembershipId(int membershipId) {
		this.membershipId=membershipId;
	}
	
	public String getMembershipType() {
		return membershipType;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType=membershipType;
	}
	
	public int getVisitsPerYear() {
		return visitsPerYear;
	}
	public void setVisitsPerYear(int visitsPerYear) {
		this.visitsPerYear=visitsPerYear;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	
	
	
	
}
