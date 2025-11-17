package Array;

import java.util.Scanner;

public class Twodarray {

	public static void main(String[] args) {
		
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		int i,j,sum=0,k;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the elements");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the elements of b");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{ sum=0;
				for(k=0;k<2;k++)
				{
					sum=a[i][k]+b[k][j];
				}
				c[i][j]=sum;
			}
		}
		System.out.println("sum of elements");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
