package controlpkg;

public class printingstar {

	public static void main(String[] args)
	{
		int totalrow=5;
		
		for(int row=1;row<=totalrow;row++)
		{
			for(int st=1;st<=row;st++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

//*
//**
//***
//****
//*****

//row=5 star=5
//1		//1  
//2		//2
//3		//3
//4		//4
//5		//5

//row=star