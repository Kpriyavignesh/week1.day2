package week1.day2;

public class MyCalculator {
	/*Assignment #1: ( Class and Methods)
	===========
	--  Create a class "Calculator" with below methods
		(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
		(b) sub(int num1, int num2), it should return subtraction of of num1-num2
		(c) mul(double num1, double num2), it should return product of num1 * num2
		(d) divide(float num1, float num2), it should return division of num1 / num2

	-- Create another class as MyCalculator and call all the methods from Calculator and print the results
*/
	public int add (int NumOne, int NumTwo, int NumThree) {
		return NumOne+NumTwo+NumThree;
		}
		public int sub (int NumOne, int NumTwo) {
			return NumOne-NumTwo;
		}
		public double mul (double NumOne, double NumTwo) {
			return NumOne*NumTwo;
		}
		public float div (float NumOne, float NumTwo) {
			return NumOne/NumTwo;
		}

		
		public static void main(String[] args) {

			MyCalculator ca = new MyCalculator();
			System.out.println("Sum of 3 Numbers is " +  + ca.add(2,5,6));
			System.out.println("Subtraction of 2 Numbers is " +  + ca.sub(12,5));
			System.out.println("Product of 2 Numbers is " +  + ca.mul(10.5,5.1));
			System.out.println("Division of 2 Numbers is " +  + ca.div(125.6f,5.0f));
			
}
}