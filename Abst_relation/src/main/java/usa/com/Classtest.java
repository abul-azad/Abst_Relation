package usa.com;

public class Classtest extends MyInterface
{//start from here
	
	
	@Override
	public void get_userId() 
	{
		
	System.out.println("I need my user id");	
	}

	@Override
	public void get_Password() 
	{
		
	System.out.println("I need my password for the login");	
	}

	@Override
	public void get_Browser() 
	{
		
	System.out.println("I want open my browser");	
	}
	
	
	public static void main(String[] args) 
	{
     MyInterface.get_lion();	
     Classtest obj= new Classtest();
     obj.get_userId();
     obj.get_Browser();
     obj.get_Password();
     
	}

	
	
}//End is here
