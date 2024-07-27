package arrays;

public class smallestno {

	public static void main(String[] args) {
		
		int a[]= {10,40,70,8};
		int small=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
				small=a[i];
		}
		
		System.out.println("smallest no="+small);
		
	}
}
