package objectOrientedProgramming;

public class Book {

	private String name;
	private String author;
	private Review review;

	Book(String name, String author, Review review) {
		this.name = name;
		this.author = author;
		this.review = review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public Review getReview() {
		return this.review;
	}

	public void setFeedback(String feedback) {
		this.review.setFeedback(feedback);
	}

	@Override
	public String toString() {
		return String.format("book name - %s, author- %s, rating- %s, feedback- %s", name, author, review.getRating(),
				review.getFeedback());
	}
}
