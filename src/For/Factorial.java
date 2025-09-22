package For;

import java.util.*;
//5
//5*4*3*2*1
public class Factorial {

	
	public static void main(String[] args) {
		
		int i,fact=1,num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=s.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number is "+fact);
	}
	
}
