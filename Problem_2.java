/* Author: Christian Ropchock
 * Date: 02-17-2016
 * Site: ProjectEuler.net
 * 
 * Problem: This program is to find the sum of all the even Fibonacci numbers
 * less than 4,000,000
 */

public class Problem_2
{
	public static void main(String[] args)
	{ 
		int oldCounter = 0; // Stores 1st tier of numbers in the 3 number subset for saving the Fibonacci numbers
		int counter = 1; // Stores 2nd tier in 3 number subset pointer and starts at one to increment the sequence
		int newCounter = 0; // Stores the sum of the two previous numbers in the 3 number subset
		int sum = 0; // Saves the sum of the even Fibonacci numbers

		
// This loop is to count through all of the Fibonacci numbers until they exceed 4,000,000		
		while (counter <= 4000000)
		{	
			newCounter = oldCounter + counter;
			
			if(isEven(newCounter)) // If the Fibonacci number is even, then add it to the running sum
			{
				sum += newCounter;
				System.out.println(sum);
			}

// Save the 2nd and 3rd numbers in the 3 number subset to increment the pointer			
			oldCounter = counter;
			counter = newCounter;
			
		}
		
		System.out.print(sum);
		
	} // End of main

/**Method used to return whether the current Fibonacci number is even*/	
	public static boolean isEven(int counter)
	{
		if ((counter % 2) == 0) return true;
		else return false;	
	}
}
