package Basic;

import java.util.Scanner;

//conditional statement 
//if  
//if else 
//ladder if else
//nested if else
//switch
public class Ifelse {

	public static void main(String[] args) {
		
	int a,b;
	Scanner s=new Scanner(System.in); 
	System.out.println("Enter the number");
	a=s.nextInt();
	System.out.println("Enter the number");
	b=s.nextInt();
	if(a>b)
	{
		System.out.println(a+" is maximum number");
	}
	else 
	{
		System.out.println(b+" is maximum number");
	}
	}
}
