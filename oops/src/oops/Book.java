package oops;

public class Book {

	int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}

	}

	void increaseNoOfCopies(int noOfCopies) {
		this.setNoOfCopies(noOfCopies + this.noOfCopies);
	}

	void decreaseNoOfCopies(int noOfCopies) {
		this.setNoOfCopies(this.noOfCopies - noOfCopies);
	}
	void print() {
		System.out.println("this is print ");
	}
}
