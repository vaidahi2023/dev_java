package Array;

/*
 * 1 2 3 4 5 
 * 4
 * preset elemnts
 * 12
 * not present elements
 */
import java.util.Scanner;

public class Arraypresent {

	public static void main(String[] args) {
		
		int a[]=new int[20];
		int i,ele,size;
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
		for(i=0;i<size;i++)
		{
			if(a[i]==ele)
			{
				present=true;
				break;
			}
			
		}
		if(present)
		{
			System.out.println("element is present");
		}
		else 	
		{
			System.out.println("element is not present");
		}
		
	}
}
