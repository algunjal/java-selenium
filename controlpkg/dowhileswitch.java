package controlpkg;
import java.util.Scanner;

public class dowhileswitch {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		int ch=0;
		do
		{
		System.out.println("Enter choice=");
		 ch=sc.nextInt();
		
		}while(ch>4); //till user not entering right choice till it will execute and ask to enter choice
		
		int i=90, j=20;
		float c;
		
		switch(ch)
		{
		case 1:{
				c=i+j;
		System.out.println("Addition=" +c);
				break;
		}
		
		case 2:{
				c=i-j;
			System.out.println("Sub=" +c);
				break;
			}
		
		case 3:{
				c=i*j;
		System.out.println("Mul=" +c);
				break;
				}

		case 4:{
			c=i/j;
		System.out.println("Div=" +c);
			break;
		}
			
		default:
		{
			System.out.println("Enter valid choice");
		}	

	 }
	}
}

//dowhile execute at least once even when cond.fail
//while will not execute when condition fail.