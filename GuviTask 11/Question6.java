package guvitaskjat11;

public class Question6 {

	public static void main(String[] args) 
	{
		//Creating the object to Instantiation for class
		InvalidPassword pass = new InvalidPassword();
		
		//Try - catch block
		try
		{
		//Passing the argument in the method	
		pass.login("Exception ", "UserPassword123");
		}
		catch(IncorrectPasswordException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
