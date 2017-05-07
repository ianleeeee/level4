package level4;

public class barf {
	public static void main(String[] args) {
	System.out.println(reverseMe("help"));
	}
	public static String reverseMe(String input){
		char[] letters = input.toCharArray();
		int len = letters.length-1;
		int counted = 0;
		for(int i = 0; i<len/2; i++){
			char temp = letters[i];
			letters[i] = letters[len-i];
			letters[len-1]=temp;
		}
		String output = "";
		for(char a: letters){
			output+=a;
		}
		return output;
	}

}
