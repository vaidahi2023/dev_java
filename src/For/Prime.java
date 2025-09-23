package For;

import java.util.Scanner;

//prime number 
//2 --1,2
//13 --1,13
public class Prime {

	public static void main(String[] args) {
		
		int n,i,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("it is prime number");
		}
		else 
		{
			System.out.println("it is not a prime number");
		}
		
	}
}
