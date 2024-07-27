package controlpkg;

public class reverseoddstarprint {

	public static void main(String[] args) {
		int totalrow=4;
		int sp=1;
		
		for(int j=1;j<=totalrow-1;j++)
		{
			for(int i=1;i<=sp;i++)
			{
				System.out.print(" ");
			}
			sp++;
			
			for(int i=1;i<=2*(totalrow-j)-1;i++)
			{
				System.out.print("*");
			} 
			System.out.println();
		}

		
	}

}


//*******
// *****
//  ***
//   *

//totalrow=4
//sp=3

//row  sp   st
//  1	0	7
//  2   1   5
//  3	2	3
//  4	3	1