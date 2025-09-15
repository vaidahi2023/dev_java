package For;

import java.util.*;
public class Table {

	public static void main(String[] args) {
		
		int i,num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		for(i=1;i<=10;i++)
		{
			//5 X 1=5
			System.out.println(num+"X"+i+"="+num*i);
		}
		
	}
}
