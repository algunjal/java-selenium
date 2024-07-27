package controlpkg;

public class printingstarreverse {

	public static void main(String[] args)
	{
		int totalrow=5; 
		
		for(int row=1; row<=totalrow; row++) //this for loop is for iteration like 5 rows there so this loop execute for 5 time
		{
			for(int st=1; st<=totalrow-row+1; st++) // this to print how many star will print 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}


//******
//****
//***
//**
//*

//row=5 st
//1		5
//2		4
//3		3
//4		2
//5		1

//totalrow-row+1
//5-1+1=5
//5-2+1=4
//5-3+1=3
//5-4+1=2
//5-5+1=1