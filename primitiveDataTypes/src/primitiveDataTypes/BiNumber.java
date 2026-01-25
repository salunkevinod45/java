package primitiveDataTypes;

public class BiNumber {

	private int numb1;
	private int numb2;

	public BiNumber(int numb1, int numb2) {
		this.numb1 = numb1;
		this.numb2 = numb2;
	}

	public int add() {
		// TODO Auto-generated method stub
		return numb1 + numb2;
	}

	public int multiply() {
		// TODO Auto-generated method stub
		return numb1 * numb2;
	}

	public void doubleNum() {
		// TODO Auto-generated method stub
		this.numb1 += this.numb1;
		this.numb2 += this.numb2;
	}

	public int getNumber1() {
		// TODO Auto-generated method stub
		return numb1;
	}

	public int getNumber2() {
		// TODO Auto-generated method stub
		return numb2;
	}

}
