package controlpkg;

public class forloop {

	public static void main(String[] args)
	{
		for (int i=1;i<=10;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("i=" +i+ "j=" +j);  //this loop will be executed till j==5 and when j=6 then it will
				//terminate and then i will increase by 1 and then again j will execute till 5 and loop goes on till i=10
			}			
			System.out.println();			
		}

	}

}
