package level4;

public class longArray {
	public static void main(String[] args) {
		int[] arr = new int[]{2,4,8,6,7,10,12,14,3,7,5};
		
		System.out.println(findLongest(arr));
	}
	public static int findLongest(int[] arr){
		int len = arr.length;
		int[] len2 = new int[len];
		int counter = 0;
		int index = 0;
		for(int i = 0; i<len; i ++){
			if(i==(len-1)){
				
			}
			else{
			if(arr[i] <arr[i+1]){
				++counter;
			}
			else{
				len2[index] = counter;
				++index;
				counter = 0;
			}
			}
			
		}
		int high = 0;
		for(int i: len2){
			if(i>high){
				high = i;
			}
			}
		return high+1;
		}
	}

