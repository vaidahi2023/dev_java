package whileloop;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		int num,i,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		i=1;
		while(i<=num)
		{
			if(num%i==0)
			{
				count++;
			}
			i++;
		}

		if(count==2)
		{
			System.out.println("it is prime number");
		}
		else
		{
			System.out.println("it is not prime number");
		}
	}
}
