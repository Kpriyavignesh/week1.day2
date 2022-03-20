package week1.day2;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// Group/Collection of Values - Array
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		int count;
		int length = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i<length; i++) {
			count=0;
			for (int j = i+1; j<length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count>0) {
			System.out.println("Duplicate Values are: " + arr[i]);
			}
		}
			
	}

}
