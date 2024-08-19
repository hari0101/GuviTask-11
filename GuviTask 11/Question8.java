
/*Implement exception handling in a Java program that reads data from a file. If the file does not exist, throw a "FileNotFoundException" 
  and display an error message to the user.
*/


package guvitaskjat11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		//Using try-catch
		try {
		//File operation to check if the file is present in this location	
		File text = new File("D:\\Utils\\javafile.txt");
		
		//Creating scanner object to read the data in the javafile.txt
		Scanner scan =new Scanner(text);
		
		//Using while loop we are printing the txt file until it have lastline
		//hasNextLine() is a scanner object to check whether the document have atleast single character
		while(scan.hasNextLine())
		{	
				//Stores the readed line in the string variable
				String line = scan.nextLine();
				System.out.println(line);
		}
		scan.close();
		}
		//catching the FileNotFoundException if the file is not available in the directory
		catch(FileNotFoundException ex)
		{
			//Handle the exception by using the getmessage
			System.out.println("Exception caught : " + ex.getMessage());
		}
		
		
	}

}
