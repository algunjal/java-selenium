package constructors;

public class thisusingconstructor
{
//this is used to invoke current class method,variable,constructor
	thisusingconstructor()
	{
		this(10);//if i want to call one argument or other constructor in this constructor then we use this keyword
		System.out.println("This is 0 arg constructor");
		
	}
	
	thisusingconstructor(int a)
	{
		this(10,20);
		System.out.println("This is 1 arg constructor");
	}
	
	thisusingconstructor(int  a,int b)
	{
		this(10,20,30);
		System.out.println("This is 2 arg constructor");		
	}
	
	
	thisusingconstructor(int a,int b,int c)
	{
		System.out.println("This is 3 arg constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		thisusingconstructor tc=new thisusingconstructor();
		//tc.thisusingconstructor();
	}

}
