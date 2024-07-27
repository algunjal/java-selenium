package controlpkg;

public class spacestarpattern {

	public static void main(String[] args)
	{
		
		int totalrow=5;
		
		for(int row=1;row<=totalrow;row++)
		{
			for(int sp=1;sp<=totalrow-row;sp++)
			{
				System.out.print(" ");
			}
			
			for(int st=1;st<=row;st++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}

//totalrow=5
//row1:totalrow-row=5-1=4
//row2:totalrow-row=5-2=3
//row3:totalrow-row=5-3=2
//row4:totalrow-row=5-4=1
//row5:totalrow-row=5-5=0




//	  *
//	 **
//  ***
// ****
//*****

// st=row totalrow-row

//row	st	sp
//1		1	4	
//2		2	3
//3		3	2
//4		4	1	
//5		5	0

