package objectOrientedProgramming;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address homeAddress = new Address("Bakori Road,BJS College", "Wagholi", "412207");

		Address workAddress = new Address("WTC", "Kharadi", "412207");

		Customer vinod = new Customer("Vinod", homeAddress);

		Customer vish = new Customer("Vishakha", homeAddress);
		vish.setWorkAddress(workAddress);

		System.out.println(vinod.getHomeAddress());
		System.out.println(vinod.getWorkAddress());

		System.out.println(vish.getHomeAddress());
		System.out.println(vish.getWorkAddress());

	}

}
