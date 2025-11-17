package Array;

import java.util.Scanner;

public class Insertelement {
	
	public static void main(String[] args) {
		
		int a[]=new int[20];
		int i,ele,pos,size;
		boolean present=false;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		size=s.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the element:");
		ele=s.nextInt();
		System.out.println("Enter the position:");
		pos=s.nextInt();
		
		  for (i = size; i > pos; i--) {
	            a[i] = a[i - 1];
	        }
		a[pos]=ele;
		size++;
		
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}
