package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	

	public static void main(String[] args) {
			// Here is the input
					int[] arr = {1,2,3,5,7,6,8};

					// Sort the array	
					
					Arrays.sort(arr);
					//1,2,3,4,6,7,8; length is 7
					
					for (int i=arr[0];i<arr.length;i++) {
						if(i!=arr[i-1]) {
							System.out.println("The missing elment in an array is:  "+ i );
							break;
						}
					}
					// loop through the array (start i from arr[0] till the length of the array)

						// check if the iterator variable is not equal to the array values respectively
						
							// print the number
							
							// once printed break the iteration


		}
}
