package week1.day2;

public class Factorial {

	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5
	 * output: 5*4*3*2*1 = 120
	 * 
	 */	
	
	public static void main(String[] args) {
		
		int input=5;
		System.out.print("Factorial of input " + input + " is: ");
		int fact=1;
		System.out.print(input);
		for (int i=1;i<=input;i++)
		{
			fact=i*fact;
			if (input>i)
			{
				System.out.print("*"+(input-i));
			}
		}
		System.out.print(" = "+fact);
		
	}

}
