package objectOrientedProgramming;

public class Customer {

	private String name;
	private Address homeAddress;
	private Address workAddress;

	Customer(String name, Address homeAddress) {
		this.name = name;
		this.setHomeAddress(homeAddress);
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

}
