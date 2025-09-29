package For;

import java.util.Scanner;

/*
 * 153 -- 
 * 1*1*1=1
 * 5*5*5=125
 * 3*3*3=27
 * 1+125+27=153
 */
public class Armstrong {

	public static void main(String[] args) {
		
		int num,rem=0,sum=0,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		temp=num;
		for(;num>0;)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("it is armstrong number");
		}
		else 
		{
			System.out.println("it is ot an armstrong number");
		}
	}
}
