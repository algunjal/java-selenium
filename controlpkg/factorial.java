package controlpkg;

public class factorial 
{

	public static void main(String[] args)
	{
		factorial f1=new factorial(); //object created as  main() is static so static needs static variable else we need to create object to access nonstatc methods
		int result=f1.factorials(4);//method call
		System.out.println("factorial of number is=" + result);
	}
		//below code is without using method but correct
//		int no=5;
//		int fact=1;
//		for(int i=1;i<=no;i++)
//		{
//			fact*=i;//here fact=1 so 1*1, then i=2 so 1*2=2, i=3 then 2*3=6 then i=4 then fact=6 and 6*4=24 then i=5 fact=24 so 24*5=120.
//		}
//		System.out.println("factorial of " + no + " is= " + fact);
		
		
		int factorials(int f)
		{
			int fact=1;
			
			for(int i=1;i<=f;i++)
			{
				fact=fact*i;
			}
			
			return fact;
		}
	}


