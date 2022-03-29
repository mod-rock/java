package custAddress.custAddressInnerBean;

public class AddressBook {
	private String phoneNumber;
	private Address tempAddress;
	
	public AddressBook(Address tempAddress) {
		this.tempAddress=tempAddress;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setAddress(Address tempAddress) {
		this.tempAddress=tempAddress;
	}
	public Address getAddress() {
		return tempAddress;
	}
}
