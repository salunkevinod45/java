package oops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike bullet = new MotorBike(40);
		MotorBike honda = new MotorBike(50);
		MotorBike hero = new MotorBike();

		bullet.start();
		honda.start();
		System.out.println(bullet.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(hero.getSpeed());

		bullet.setSpeed(100);
		bullet.increaseSpeed(17);
		bullet.decreaseSpeed(116);
		System.out.println(bullet.getSpeed());
		honda.setSpeed(80);
		honda.increaseSpeed(19);
		honda.decreaseSpeed(9);
		System.out.println(honda.getSpeed());
	}

}
