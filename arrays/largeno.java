package arrays;

public class largeno {

	public static void main(String[] args) {
		int p[]= {20,80,90,10,1202};
		int large=p[0];
		for(int i=0;i<p.length;i++)
		{
			if(p[i]>large)
			{
				large=p[i];
			}
			
		}
		System.out.println("large no="+large);
	}

}
