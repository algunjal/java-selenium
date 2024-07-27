package controlpkg;

public class tableusingforandwhile {

	public static void main(String[] args) 
	{
		int i=1; 
		for(i=1;i<=10;i++)
		{
		  int j=1;
		while(j<=10)
		{
			System.out.printf("%4d",i*j);
			j++;
		}
		System.out.println();
		}
	}

}
