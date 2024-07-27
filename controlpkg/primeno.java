package controlpkg;

public class primeno {

	public static void main(String[] args)
	{
		int no=1; boolean flag=true;
		
		for(int i=2; i<no; i++)
		{
			if(no%i==0)
			{
				flag=false; //if remainder is 0 means its divisible by that no and need not to check further no. 
							//if we take no as 7 then we to check the divisibility till 2,3,4,5,6.
				break; //because we are no need to check further no break the loop
			}
			
		}	
			
			if(flag==false)
			{
				System.out.println("number is not prime");
			}
			else
			{
				System.out.println("number is prime");
			}
	}

}
//tip===use debugger to debug code.
