package level4;

import java.util.Random;

public class demographics {
	static Person[] peopleList;
	static Person[] PanD;
	public static void main(String[] args) {
		//init();
		//boolean go = true;
		//while (go) {
		//	generationGap();
		//	if(getAvgAge()<30){
		//		go  = false;
		//	}
	//	}
	//	System.out.println("Average age is " +getAvgAge()+ " years old");
		init2();
		boolean go2 = true;
		while (go2) {
			generationGap();
			if(getAvgAge()<30){
				go2  = false;
			}
			ratio();
			System.out.println("average age: "+getAvgAge());
		}
	}

	static void init() {
		peopleList = new Person[50];
		for (int i = 0; i < peopleList.length; i++) {
			peopleList[i] = new Person();
		}
	}
	static void init2(){
		PanD = new Person[50];
		for (int i = 0; i < 25; i++) {
			PanD[i] = new Person();
		}
		for (int i = 25; i < PanD.length; i++) {
			PanD[i] = new Dogman();
		}
	}

	public static float getAvgAge() {
		int total = 0;
		for (Person i : PanD) {
			total += i.getAge();
		}
		return (float) total / 50;
	}

	public static int getOldest() {
		int old = 0;
		for (int i = 0; i < PanD.length; i++) {
			if(PanD[i].getAge()>old){
				old = i;
			}
		}
		return old;
	}
	public static void ratio(){
		int dogs = 0;
		int people = 0;
		for(Person x: PanD){
			if(x instanceof Dogman){
				dogs++;
			}
			else{
				people++;
			}
		}
		System.out.println("The ratio of dogs to people is: "+dogs+":"+people);
	}

	public static void generationGap() {
		for (int i = 0; i < PanD.length; i++) {
			PanD[i].age();
		}
		for (int i = 0; i < 5; i++) {
			
			int idx = getOldest();
			Random r = new Random();
			int oot = r.nextInt(2);
			if(oot==1){
				PanD[idx] = new Person();
			}
			else{
				PanD[idx] = new Dogman();
			}
			
		}
	}

}
