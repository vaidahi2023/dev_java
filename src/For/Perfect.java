package For;

import java.util.Scanner;

/*
 * perfect 
 * 6 -- 1,2,3,6
 *  1+2+3=6
 *  
 * 8 --1,2,4,
 * 1+2+4=7
 */
public class Perfect {

	public static void main(String[] args) {
		
		int i,num,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println("it is perfect number");
		}
		else
		{
			System.out.println("it is not a perfect number");
		}
	}
}
