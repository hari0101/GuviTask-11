
/*
    5. Write the code of ArrayIndexOutOfBoundsException & StringIndexOutOfBoundsException?

*/

package guvitaskjat11;

public class Question5 {

	public static void main(String[] args) 
	{
		System.out.println("**********ArrayIndexOutOfBoundsException*********");
//   i) ArrayIndexOutOfBoundsException
		//Declaring the array variables, length of the array is 7 & index of the array is 6.
		
		int[] arr = {12,34,153,370,371,401,731}; 
		
		//Try-Catch block to handle exception
		try
		{
			//ArrayIndexOutOfBoundsException occur when we trying to print the array index which is not present in array declaration
			System.out.println("The array value of 6th index is : " + arr[6]);
			System.out.println("The array value of 7th index is : " + arr[7]);
		
		}
		//catching the array exception
		catch(ArrayIndexOutOfBoundsException exe)
		{
			System.out.println("Exception Caught :" + exe);
		}
		//For each loop to print all the array values
		for(int array : arr)
		{
			System.out.print(array + " ");
		}
			
		System.out.println(); // Line
		System.out.println(); // Line

//   ii)  StringIndexOutOfBoundsException
		System.out.println("**********StringIndexOutOfBoundsException*********");
		
		//Declared the string variable name as exe
		String exe = "StringException";
		
		//By using charAt function we are access one by one value in the string variable
		char ch = exe.charAt(0);
		System.out.println("String value at 1st index : " + ch);
		
		//Try-Catch
		try
		{
			char ch2 = exe.charAt(15);
			System.out.println("String value at 15th index : " + ch2);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception Caught : " + e);
		}
	
		//For loop for execute all the char values
		for(int i=0;i<=exe.length()-1;i++)
		{
			//Storing all the string values into individual characters
			char character = exe.charAt(i);
			
			System.out.print(character + " ");
		}
	
	}

}
