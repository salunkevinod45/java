package objectOrientedProgramming;

public class Review {
	private int id;
	private String rating;
	private String feedback;

	Review(int id, String rating) {
		this.id = id;
		this.rating = rating;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return String.format("rating - %s, feedback - %s", rating, feedback);
	}

}
