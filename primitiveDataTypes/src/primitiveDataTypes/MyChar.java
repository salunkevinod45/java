package primitiveDataTypes;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (this.ch == 'a' || this.ch == 'A' || this.ch == 'e' || this.ch == 'E' || this.ch == 'i' || this.ch == 'I'
				|| this.ch == 'o' || this.ch == 'O' || this.ch == 'u' || this.ch == 'U') {
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
		return !this.isVowel();
	}

	public boolean isAlphabet() {
		int ascii = this.ch;
		if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
			return true;
		}
		return false;
	}

	public boolean isNumber() {
		return !this.isAlphabet();
	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}

}
