package level4;

import java.util.Arrays;
import java.util.Random;

public class githubLove {
	public static void main(String[] args) {
		String[] names = new String[] { "yuz217", "jzhao156", "ianleeeee", "googolplex8", "AndrewPark78" };
		int len = names.length - 1;
		boolean go = !true;
		while (go) {
			int count = 0;
			for (int i = 0; i < len; i++) {
				if (i == (len - 1)) {

				} else {
					if (names[i].compareTo(names[i + 1]) > 0) {
						String temp = names[i];
						names[i] = names[i + 1];
						names[i + 1] = temp;
					} else {
						count += 1;
					}
				}
			}
			if (count == len) {
				go = false;
			} else {
				go = true;
				count = 0;
			}
		}
																																					Arrays.sort(names);
		for (String d : names) {
			System.out.println(d);
		}
		
		Random r = new Random();
		int x = r.nextInt(5);
		System.out.println("follow: " + names[x]);

	}

}
