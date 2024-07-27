package controlpkg;

public class reversespacestarpattern
{

	public static void main(String[] args) 
	{
		
		int totalrow=5;
		
//		for(int row=totalrow;row>=1;row--)
//		{
//			for(int sp=totalrow;sp>=row;sp--)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int st=1;st<=row;st++)
//			{
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}

	//above code is also correct
		
		
		for(int row=1;row<=totalrow;row++)
			{
				for(int sp=1;sp<=row-totalrow+4;sp++)
				{
					System.out.print(" ");
				}
				
				for(int st=1;st<=totalrow-row+1;st++)
				{
					System.out.print("*");
				}
				
				System.out.println();
			}	
		
	}

}

//totalrow=5

//row1:row-totalrow+4= 1-5+4= -4+4=0
//row2:row-totalrow+4= 2-5+4= -3+4=1
//row3:row-totalrow+4= 3-5+4= -2+4=2
//row4:row-totalrow+4= 4-5+4= -1+4=3
//row5:row-totalrow+4= 5-5+4= -0+4=4


//*****
// ****
//  ***
//   **
//    *


// st=row totalrow-row

//row	st	sp
//1		5	0	
//2		4	1
//3		3	2
//4		2	3	
//5		1	4


