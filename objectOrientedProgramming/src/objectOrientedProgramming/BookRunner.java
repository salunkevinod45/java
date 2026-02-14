package objectOrientedProgramming;

public class BookRunner {

	public static void main(String[] args) {

		Review book1 = new Review(4, "5");

		Book java = new Book("Java", "James Gosling", book1);

		System.out.println(java.getReview());
		java.setFeedback("Best");
		System.out.println(java);

		Review book2 = new Review(3, "4");
		book2.setFeedback("Excellent");
		Book nodejs = new Book("Node js", "Ryan Dahl", book2);

		System.out.println(nodejs);

	}

}
