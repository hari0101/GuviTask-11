/*
	
	7. Create a custom exception in Java called "InvalidAgeException" that is thrown when the user enters an age less than 18. 
	   
	   Implement exception handling in a Java program to catch the "InvalidAgeException" and display an error message.

*/

package guvitaskjat11;

import java.util.Scanner;

/*
  	To custom the Exception handling we have create the class with have custome exception name and extends the parent class exception
	Super keyword with the constructor is automatically call the parent exception class.
	

*/
class InvalidAgeException extends Exception {

	// Constructor will invoke the exception class message
	public InvalidAgeException(String exception) {
		super(exception);
	}

	// Constructor will invoke the exception class message and root cause
	public InvalidAgeException(String exception, Throwable cause) {

		super(exception, cause);
	}

}

public class Question7 {

	public static void main(String[] args) {
		// Creating the scanner object to get the user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = scan.nextInt();

		// Invoking the method inclosed inside try-catch
		try {
			// Static Method invoked
			Question7.ageException(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		scan.close();
	}

	// Declaring new method to get the age and check the condition
	public static void ageException(int age) throws InvalidAgeException {
		if (age < 18) {
			// Created new throw exception that printed on console
			throw new InvalidAgeException("Invalid age " + age + " Age must be greater then 18");
		} else {
			System.out.println("The age of the person : " + age);
		}
	}

}
