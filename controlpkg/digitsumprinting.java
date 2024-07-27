package controlpkg;

public class digitsumprinting {

	public static void main(String[] args) 
	{
		int no=8979;
		int sum=0;
		
		//for(int i=1;no>=0;i++)
		while(no>0)
		{
			int p=no%10;
			 sum=sum+p;
			 no=no/10;
			 
		}
		

		System.out.println("Sum of digits are="+sum);
	}

}
