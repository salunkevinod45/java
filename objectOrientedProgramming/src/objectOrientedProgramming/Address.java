package objectOrientedProgramming;

public class Address {

	private String line1;
	private String location;
	private String pin;

	Address(String line1, String location, String pin) {
		this.line1 = line1;
		this.location = location;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return String.format("Address-%s,location-%s,pin-%s", line1, location, pin);
	}

}
