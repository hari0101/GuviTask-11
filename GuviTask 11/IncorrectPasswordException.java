

/*
 6. You are building a login system for a website using Java. If the user enters an incorrect password, you want to display a message informing them of the error. 
    
    How would you use exception handling to handle this situation?
 
 */

package guvitaskjat11;

//User defined exception by creating class which extends Parent class Exception.
public class IncorrectPasswordException extends Exception {
	
	//Creating constructor with one argument
	public IncorrectPasswordException(String exception)
	{
		//Super keyword will invoke the super class method from the Exception
		super(exception);
	}

}

//Creating an new class InvalidPassword
class InvalidPassword
{
	// creating the unchangeable variable by any method
	private final String passwd = "UserPassword123";
	
	//New method to make the condition 
	public void login(String username, String password) throws IncorrectPasswordException {
		
		//checks the Condition if the unchangeable string and userenters string not matching then exception throws 
		
		if(!passwd.equals(password))
		{
			//throwing the exception with parent class
			throw new IncorrectPasswordException("Incorrect password");
		}
		
		//if the user password matches with pre defined password below output printed.
		System.out.println(username + "login successfully!");
	}
	
}


	

