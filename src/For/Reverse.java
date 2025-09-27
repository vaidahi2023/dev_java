package For;

import java.util.Scanner;

/*
 * 
 * rev=rem
 * 121
 * 121
 */
public class Reverse {

	public static void main(String[] args) {
		
		int rem=0,rev=0,num,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		temp=num;
		for(;num>0;) //123>0 12>0 1>0 0>0
		{
			rem=num%10; //123%10=3  12%10=2 1%10=1
			rev=rev*10+rem; //rev=0*10+3=3 3*10+2=32 32*10+1=321
			num=num/10; //num=123/10=12 num=12/10=1 1/10=0
		}
		if(temp==rev)
		{
			System.out.println("it is palindrome number");
		}
		else 
		{
			System.out.println("it is not palindrome number");
		}
		
	}
}
