/* WednesdayCalculations.java
 * Rod Palmer
 * 15 Nov 2023
 * This program verifies the calculations I did by hand.  I was spot on until I got to the type overflow
 * issues where I didn't take into account how bits roll over when the max value is exceeded.
 */

package com.skillstorm.week1;

public class WednesdayCalculations {

	public static void main(String[] args) {
		try {

			System.out.println("5 + 7 % 3 = " + 5 + 7 % 3);
			
			System.out.println("12 % 6 = " + 12 % 6);
			
			System.out.println("6 % 12 = " + 6 % 12);
			
			System.out.println("3 % 5 = " + 3 % 5);
			
			System.out.println("5 % 3 = " + 5 % 3);
			
			System.out.println("5 % 5 = " + 5 % 5);
			
			System.out.println("1 % -2 = " + 1 % -2);
			
			System.out.println("-1 % 2 = " + -1 % 2);
			
			System.out.println("-1 % -2 = " + -1 % -2);
			
			System.out.println("0 % 2 = " + 0 % 2);
			
			System.out.println("2 % 0 = Error!!!  Cannot divide by zero!");
			
			System.out.println("6 * 2 % 6 = " + 6 * 2 % 6);
			
			System.out.println("12 % 4 = " + 12 % 4);
			
			System.out.println("7 % 3 % 2 = " + 7 % 3 % 2);
		
			System.out.println("10 - 12 * 2 = " + (10 - 12 * 2));
		
			System.out.println("5 * (3 - 2) = " + (5 * 3 - 2));
		
			System.out.println("5 + 2 * 3 = " + 5 + 2 * 3);
			
			System.out.println("7 + 2 * 3 / 5 - 1 = " + (7 + 2 * 3 / 5 - 1));
		
			System.out.println("18 / 3 % 7 * (4 + 1) = " + 18 / 3 % 7 * (4 + 1));
			
			System.out.println("15 / 3 / 5 = " + 15 / 3 / 5);
			
			System.out.println("1 / 2 = " + 1 / 2);
			
			System.out.println("3 / 4 = " + 3 / 4);
			
			System.out.println("4 / 3 = " + 4 / 3);
			
			System.out.println("Integer.MAX_VALUE + 1 = " + Integer.MAX_VALUE + 1);

			System.out.println("Integer.MIN_VALUE - 1 = " + (Integer.MIN_VALUE - 1));
			
			System.out.println("Integer.MAX_VALUE + Integer.MIN_VALUE = " + Integer.MAX_VALUE + Integer.MIN_VALUE);

			System.out.println("Short.MAX_VALUE + 1 = " + Short.MAX_VALUE + 1);
			
			System.out.println("Short.MIN_VALUE - 1 = " + (Short.MIN_VALUE - 1));

			System.out.println("Short.MAX_VALUE + Short.MIN_VALUE = " + Short.MAX_VALUE + Short.MIN_VALUE);

			System.out.println("(int)7.9 - 3 = " + ((int)(7.9) - 3));
			
			System.out.println("(int)84.3 / (int)2.8 = " + ((int)84.3 / (int)2.8));
			
			System.out.println("(byte)1000 - 10 = " + ((byte)1000 - 10));

			System.out.println("(short)100000 = " + ((short)100000));
			
			System.out.println("(long)10 + (-10) = " + ((long)10 + (-10)));
		}
		catch (ArithmeticException e) {
			throw new ArithmeticException("Error.");
					}
		finally{}
	}
}//end main
