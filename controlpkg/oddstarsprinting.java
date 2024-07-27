package controlpkg;

public class oddstarsprinting {

	public static void main(String[] args)
	{		
		int totalrow=4;
		int sp=totalrow-1;
		
		for(int j=1;j<=totalrow;j++)
		{
			for(int i=1;i<=sp;i++)
			{
				System.out.print(" ");
			}
			sp--;
			
			for(int i=1;i<=2*j-1;i++)
			{
				System.out.print("*");
			}
				System.out.println("");
		}	
			
		}
		
    } 
		
//		for(row=0; row<=t_row; row++)
//		{
//			System.out.print(" ");
//		}
//			for(int st=0; st<=row; st++)
//			{
//				System.out.print("* ");	
//			}
//			
//			System.out.println("");
//	}
				
//			
			
			
		
	



//		*
//	   ***
//	  *****
//	 *******
	

//st=row totalrow-row

//row	st	sp
//1		1	4	
//2		3	3
//3		5	2
//4		7	1	

