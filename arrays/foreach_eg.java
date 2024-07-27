package arrays;

public class foreach_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//below code is correct
//		String b[]= {"alisha", "gunjal","sumit"};
//		for(String ele:b)		//syntax of foreach .. ele is variable name and b is an array	
//		{
//			System.out.println(ele);
//		}
//		
//		int a[]= {30,50,20,10};
//		for(int element:a)
//			
//		{
//			System.out.println(element);
//		}
//		
		int c[]=new int[4];
		System.out.println(c.length);
		
		c[0]=10;
		c[1]=30;
		c[2]=40;
		c[3]=50;
		//c[4]=90; //exception will occur as size is 4
		for(int elements:c) //we dont have assign values so elements will be 0.
			
		{
			System.out.println(elements);
		}
	}

}
