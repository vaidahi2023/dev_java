package whileloop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		int num,cube=0,sum=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		temp=num;
		while(num>0)
		{
			cube=num%10;
			sum=sum+cube*cube*cube;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("it is armstrong number");
		}
		else 
		{
			System.out.println("it is not a armstrong number");
		}
	}
}
