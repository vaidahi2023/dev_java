package Array;

import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {
		
		int a[]=new int[10];
		int b[]=new int[10];
		int size,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		size=s.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Elements of a:");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		for(i=0;i<size;i++)
		{
			b[i]=a[i];
		}
		System.out.println("Elemets of b:");
		for(i=0;i<size;i++)
		{
			System.out.println(b[i]);
		}
		
		
		
	}
}
