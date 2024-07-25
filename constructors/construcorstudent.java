package constructors;

public class construcorstudent
{
	 String name;//instance variable
	 int id;
	
	construcorstudent(String nm, int stud_id)
	{
		name=nm;// when obj created then values will assign to instance variables
		id=stud_id;
	}
	
	void info()
	{
		System.out.println("Name="+name + " ID="+id);
	}

	public static void main(String[] args)
	{
		construcorstudent cs=new construcorstudent("Alisha",101);
		cs.info();
	}

}
