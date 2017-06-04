package level4;

import java.util.Random;

public class Dogman extends Person{
	static int age;
	String name;
	String [] names = {"Doggo", "Doge","Pup"};
	public Dogman(){
		Random rand = new Random();
		int age = rand.nextInt(20);
		this.age = age;
		int nameInd = rand.nextInt(3);
		String name = names[nameInd];
	}
	public static void age(){
		age+=7;
	}

}
