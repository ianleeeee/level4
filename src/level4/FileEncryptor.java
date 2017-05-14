package level4;

import java.io.File;

public class FileEncryptor {

	public static File openSecretFile() {
		File f = new File("/Users/league/Desktop/level4/src/level4/f.txt");
		// System.out.println(f.isFile());
		return f;
	}

	public static String encrypt(String encryptMe) {
		char[] arr = encryptMe.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 120) {

				arr[i] += 2;
			} else {
				int val = arr[i];
				int dif = val - 120;
				arr[i] = (char) (96 + dif);
			}
		}
		String encrypted = "";
		for (char x : arr) {
			encrypted += x;
		}
		return encrypted;
	}

	public static String decrypt(String decryptMe) {
		char [] arr = decryptMe.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=99){
				arr[i] -=2;
			}
			else{
				int val = arr[i];
				int dif = val-97;
				arr[i] = (char) (122-dif);
			}
			
			}
		String decrypted = "";
		for(char x: arr){
			decrypted+=x;
		}
		return decrypted;
	}

}
