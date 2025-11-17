package Array;

/*
 * 5 2 8 1 4
 * 2 5 8 1 4
 * 2 5 1 8 4
 * 2 5 1 4 8
 * 2 1 4 5 8
 * 1 2 4 5 8
 * 
 */
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		int a[]=new int[20];
		int i,temp,j,size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		size=s.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}
}
