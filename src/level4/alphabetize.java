package level4;

import java.util.Arrays;

public class alphabetize {
	public static void main(String[] args) {
		System.out.print(alphabet("elephant"));

	}

	public static String alphabet(String word) {
		char[] letters = word.toCharArray();
		int len = letters.length - 1;
		int count = 0;
		boolean go = true;
																																						Arrays.sort(letters);
		while (!go) {

			int index = 0;
			go = false;
			for (char c : letters) {
				if (c > letters[index + 1]) {
					char temo = c;
					c = letters[index + 1];
					letters[index + 1] = temo;
					index++;
				} else {
					count++;
				}
			}
			if (count == len) {
				go = false;
			} else {
				count = 0;
				index = 0;

			}
		}

		String out = "";
		for (char x : letters) {
			out += x;
		}

		return out;
	}

}
