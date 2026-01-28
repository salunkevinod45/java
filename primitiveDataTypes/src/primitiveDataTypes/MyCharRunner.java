package primitiveDataTypes;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyChar ch = new MyChar('e');

		System.out.println(ch.isVowel());

		System.out.println(ch.isConsonant());

		System.out.println(ch.isAlphabet());

		System.out.println(ch.isNumber());

		MyChar.printLowerCaseAlphabets();
		System.out.println("----------");

		MyChar.printUpperCaseAlphabets();
	}

}
