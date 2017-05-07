package level4;

import java.util.ArrayList;

public class Inserting {

	public static int[] insertAt(int[] testArray, int index, int value) {
		testArray[index] = value;
		return testArray;
	}

	public static String[] insertAlphabetically(String[] orderedArray, String string) {
		ArrayList <String> list = new ArrayList<String>();
		for(String x: orderedArray){
			list.add(x);
		}
		for(int i = 0; i < orderedArray.length; i++){
			if(string.compareTo(orderedArray[i])<0){
				list.add(i,string);
			}
		}
		String [] out = new String[list.size()];
		int counter =0;
		for(String b: list){
			out[counter] = b;
			counter++;
		}
		return out;
	}

}
