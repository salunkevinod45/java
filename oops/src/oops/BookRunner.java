package oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfCompProg = new Book(20);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(60);

		System.out.println(artOfCompProg.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		artOfCompProg.setNoOfCopies(100);
		effectiveJava.setNoOfCopies(200);
		cleanCode.setNoOfCopies(300);

		artOfCompProg.increaseNoOfCopies(15);
		artOfCompProg.decreaseNoOfCopies(25);

		System.out.println(artOfCompProg.getNoOfCopies());

	}

}
