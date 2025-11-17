package Function;

import java.util.Scanner;

/*
* types of function
* 1.without argument without return
* 2.without argument with return
* 3.with argument with return
* 4.with argument without return
* syntax:
* datatype function_name()
* {
* 	//statement
* }
*/
public class Function {

	//1.without argument without return
//	void sum()
//	{
//		int a,b,sum=0;
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the number:");
//		a=s.nextInt();
//		System.out.println("Enter the number:");
//		b=s.nextInt();
//		sum=a+b;
//		System.out.println("sum="+sum);
//	}
//	
//	//without argument with return
//	int sum1()
//	{
//		int a,b,sum=0;
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the number:");
//		a=s.nextInt();
//		System.out.println("Enter the number:");
//		b=s.nextInt();
//		sum=a+b;
//		return sum;
//	}
	
	//with argument without return
	void sum(int a,int b)
	{
		int sum=0;
		sum=a+b;
		System.out.println("sum="+sum);
	}
	public static void main(String[] args) {
		
		Function f=new Function();
		//f.sum();
		//sum();
//		int result=0;
//		result=f.sum1();
//		System.out.println("sum="+result);
		int a,b,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=s.nextInt();
		System.out.println("Enter the number:");
		b=s.nextInt();
		f.sum(a,b);
		
		
		
		
	}
}
