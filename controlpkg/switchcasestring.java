package controlpkg;

public class switchcasestring {

	public static void main(String[] args)
	{
		String key="mult";
		int a=20,b=50,c;
		
	switch(key)
	{
		case "add": 
		{
			c=a+b;
			System.out.println("Addition="+c);
			break;		
		}
		
		case "sub": 
		{
			c=a-b;
			System.out.println("Substraction="+c);
			break;			
		}
		
		case "mult": 
		{
			c=a*b;
			System.out.println("Multiplication="+c);
			break;		
		}
		
		case "div": 
		{
			c=a/b;
			System.out.println("Division="+c);
			break;			
		}
		
		default:
		{
			System.out.println("Enter valid choice");
		}
	}	


	}

}
