package whileloop;

import java.util.Scanner;

/*i=0;
 * while(i<num)
 * {
 * 	System.out.println(i);
 * }
 * 1
 * 2
 * 3
 * 4
 * 5
 * sum=15
 */
public class While1 {

	public static void main(String[] args) {
		
		int i,num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		i=1;
		while(i<=num)
		{
		 System.out.println(i);
		 i++;
		}
	}
}
