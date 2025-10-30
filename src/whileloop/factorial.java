package whileloop;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		int num,fact=1,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of number is "+fact);
		
	}
}