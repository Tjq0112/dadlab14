package TCPSummationServerApp.src.controller;


/**
 * This is a controller class that manage the arithmetic operations.
 * 
 * @author emalianakasmuri
 *
 */

public class NumberCalculator {
	
	
	/**
	 * A method that will get the summation from three numbers
	 * @param number1
	 * @param number2
	 * @param number3
	 * @return
	 */
	public int getSum(int number1, int number2, int number3) {
		
		return number1 + number2 + number3;
		
	}
	
	/**
	 * 
	 * This method multiplies three numbers
	 * @param number1
	 * @param number2
	 * @return
	 */
	
	public int getMultiplication(int number1, int number2, int number3)
	{
		return number1 * number2 * number3;
	}

}
