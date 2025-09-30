package For;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		
		int num,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		for(;num>0;)
		{
			count++;
			num=num/10;
		}
		System.out.println("no of digits is "+count);
		
	}
}
