package controlpkg;

public class fibbonacci_series {

	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		int n3=0;
		
		 System.out.println(n1+"\n" +n2);//printing 0 and 1    
		// System.out.print("\n");
		for(int i=0;i<=4;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}

	}

}
// fibbonaccie means addition of previou nos like 0+ 1=1+ 1=2+1= 3  (0 1 1 2 3 5 )