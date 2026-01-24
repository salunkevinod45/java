package oops;

public class MotorBike {
	private double speed;
	private int gear;

	public MotorBike() {
		this(2);
	}


	public MotorBike(double speed) {
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(double howMuch) {
		this.setSpeed(howMuch + this.speed);
	}

	public void decreaseSpeed(double howMuch) {
		this.setSpeed(this.speed - howMuch);
	}

	void setNoOfGears(int noOfGears) {
		this.gear = noOfGears;
	}

	void start() {
		System.out.println("Bike started");
	}
}
