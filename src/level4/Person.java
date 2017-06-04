package level4;

import java.util.Random;

public class Person {
	static int age;
	String name;
	String[] names = {"Ian", "Casey", "Tommy", "Ki", "Bonrad"};
	public Person(){
		Random rand = new Random();
		int age = rand.nextInt(100);
		this.age = age;
		int nameInd = rand.nextInt(5);
		String name = names[nameInd];
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	public static void age(){
		age++;
	}

}
