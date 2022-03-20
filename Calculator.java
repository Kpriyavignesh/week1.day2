package week1.day2;

public class Calculator {
	
	public int add (int NumOne, int NumTwo) {
	return NumOne+NumTwo;
	}
	public double sub (int NumOne, int NumTwo) {
		return NumOne-NumTwo;
	}
	public double mul (int NumOne, int NumTwo) {
		return NumOne*NumTwo;
	}
	public double div (int NumOne, int NumTwo) {
		return NumOne/NumTwo;
	}
	
	//public void getCalculator(int NumOne, int NumTwo) {
		//System.out.println("NumOne" + NumOne);
		//System.out.println("NumTwo" + NumTwo);
	//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ca = new Calculator();
		//int NumOne = ca.getNumOne();
		//System.out.println("Number One is " + ca.getNumOne());
		//int NumTwo = ca.getNumtwo();
		//System.out.println("Number Two is" + ca.getNumTwo());
		System.out.println("Add is " +  + ca.add(2,5));
		System.out.println("Sub is " +  + ca.sub(2,5));
		System.out.println("Mul is " +  + ca.mul(2,5));
		System.out.println("Div is " +  + ca.div(2,5));
		
	}

}
