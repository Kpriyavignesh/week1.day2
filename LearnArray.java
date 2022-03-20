package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class LearnArray {

	public static void main(String[] args) {
		// Group/Collection of Values - Array
		//Arrays are of Fixed Size
		//10,20,30,40
		//Single Dimensional Array
		int[] a = {10, 20, 30 ,40, 25};
		//print the length of the Array
		System.out.println("Length of the Array is  " +a.length);
		//Get the 4th item in the Array
		System.out.println(a[3]);
		
		//Print before Sort
		System.out.println("Print before Sort");
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Sorting of Array");
		//Sorting Of Array
		Arrays.sort(a);
		System.out.println(a[4]);
		
		//Ascending Order
		System.out.println("Ascending Order");
		for (int i = 0; i<a.length; i++) {
		System.out.println(a[i]);
		}
		//Descending Order
		System.out.println("Descending Order");
				for (int i = a.length-1; i>=0; i--) {
					System.out.println(a[i]);
				}
		
		}
	}






