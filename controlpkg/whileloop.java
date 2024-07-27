package controlpkg;

public class whileloop {

	public static void main(String[] args) 
	{
		//no of iteration is known advance then for is used.
		//no of iteration is not known then while used.
		
		int number=5434555;
		int count=0;
		
		while(number>0)
		{
			count++;
			number=number/10;						
		}
		System.out.println(count);
	}

}
