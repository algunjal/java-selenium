package constructors;

public class thiskeyword
{
	//this keyword refers current class object.
	int id;// instance variable
	String name;
	
	//even you take diffrent names of the local and instance variable but to point out instance variable this is used	
	//when local var and instance var are same then use this keyword
					
					//sumit	//65
	thiskeyword(String name,int id)//this are local var
	{
		 this.name=name;//if we take name =name then it wont understand which one to take it will take local var.ie.default values so to remove ambuiguity we r using this
		 this.id=id;//when this is used it will use instance variable 
	 }
	
	void m()
	{
		System.out.println("Name="+name +" ID="+id);
	}
	
	public static void main(String[] args) 
	{
		thiskeyword tj=new thiskeyword("Sumit",65);
		
		tj.m();
			
	}
	 
}
