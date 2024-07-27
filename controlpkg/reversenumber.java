package controlpkg;

public class reversenumber {

	public static void main(String[] args) 
	{
		int  number=123;
		int rev=0;
		//int revno=0;
		for(;number>0;)
		{
			rev=number%10;
			System.out.print(rev);  
			//println prints number on next line so use print
		//	revno=rev;
			number/=10;			
		}
		
	}

}
