
/*
   
   4.  Write a Java program that reads user input for two integers and performs division. 
       Handle the exception that is thrown when the second number is zero, and display an error message to the user.

*/

package guvitaskjat11;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) 
	{
		//Initialized the integer variables
		int num1, num2, result;
		
		//Creating the scanner object to get the user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number  : ");
		num1 =scan.nextInt(); //Getting first number
		System.out.println("Enter the second number : ");
		num2 = scan.nextInt(); //Getting second number
		
		//Try-Catch to handle the exception cause by the division
		try
		{
			//Dividing the two number input from the user
			result = num1/num2; 
			System.out.println("The Division of the two number is : " + result);
		}
		
		//Catch block will get the exception based on the kind of terminal occur
		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught : " + e);
			
		}
		
		System.out.println(); //Line
		//Below string is printed after exception is handled properly.
		System.out.println("Program executed successfully"); 
	
		//Scanner class is closed
		scan.close();
	}

}
