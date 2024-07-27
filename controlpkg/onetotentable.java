package controlpkg;

public class onetotentable {

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++) //i=1 ,2 
		{
			for(int j=1;j<=10;j++) //this for loop execute for 10 times till i=10
			{
				System.out.printf("%4d " ,i*j); //to format the tables in proper way 4d space is applied
			}
			System.out.println();
		}
		
		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i);
//		}
	}

}
