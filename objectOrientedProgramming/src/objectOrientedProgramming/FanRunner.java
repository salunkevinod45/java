package objectOrientedProgramming;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan("Havells", 2.5, "Black");

		fan.switchOn();
		System.out.println(fan.toString());

		fan.setSpeed((byte) 4);
		System.out.println(fan.toString());

		fan.switchOff();
		System.out.println(fan.toString());

	}

}
