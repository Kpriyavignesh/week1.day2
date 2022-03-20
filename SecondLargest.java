package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// Group/Collection of Values - Array
		int[] data = {3, 2, 11, 4, 6, 7};
		//print the length of the Array
		System.out.println("Length of the Array is  " +data.length);
		//Print before Sort
		System.out.println("Print before Sort");
		for (int i = 0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println("Sorting of Array");
		//Sorting Of Array
		Arrays.sort(data);
		System.out.println("Print after Sort");
		for (int i = 0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		//Printing Second Largest
		System.out.println("Printing Second Largest");
				System.out.println(data[data.length - 2]);
		}
		
	}