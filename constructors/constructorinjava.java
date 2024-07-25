package constructors;

public class constructorinjava {
	
	constructorinjava()//same name as class name with no returntype
	//default constructor
	{
		System.out.println("This is inside constructor");
	}
	
	constructorinjava(int a)
	{
		System.out.println("This is one arg constructor");
	}
	
	constructorinjava(float a)
	{
		System.out.println("This is one arg float constructor");
	}
	
	constructorinjava(double a)
	{
		System.out.println("This is one arg double constructor");
	}

	constructorinjava(int a,int c)//parameterised constructor
	{
		System.out.println("This is two arg constructor");
	}

	public static void main(String[] args)
	{
		//System.out.println("start");
		constructorinjava cj=new constructorinjava(10,20);
		//constructorinjava pj=new constructorinjava();//when obj get created constructor get called
		//If we don’t define explicitly, we get an implicit default constructor.
		//System.out.println("end");
	}

}
//use--->if u r hvng business requirement that asap obj. is created then that business logic should get executed /code should be called when obj is created that time constructor is used