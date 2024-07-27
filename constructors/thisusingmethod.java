package constructors;

public class thisusingmethod {

	
	String name;
	int id;
	
	thisusingmethod(String nm,int ID)
	{
		this.name=nm;
		this.id=ID;
	}
	
	//static  void m1()
	void m1()
	{
		System.out.println("this is m1 method");
	}
	
	 void m2()
	{
		//call m1 here
		//System.out.println("This is m2 method and call shift to m1()");
		//thisusingmethod ts=new thisusingmethod("al",90);
		//thisusingmethod.m1();
		this.m1();//to call current class method
	}
	
	public static void main(String[] args) 
	{
		thisusingmethod ts=new thisusingmethod("alisha",90);
		ts.m2();
	}

	//this is example of this keyword.
	

}
