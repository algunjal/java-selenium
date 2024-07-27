package controlpkg;

public class switchcases 
{
	public static void main(String[] args) 
	{
		int key=2;
		int a=20,b=50,c;
		
	switch(key)
	{
		case 1: 
		{
			c=a+b;
			System.out.println("Addition="+c);
			break;		
		}
		
		case 2: 
		{
			c=a-b;
			System.out.println("Substraction="+c);
			break;			
		}
		
		case 3: 
		{
			c=a*b;
			System.out.println("Multiplication="+c);
			break;		
		}
		
		case 4: 
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
