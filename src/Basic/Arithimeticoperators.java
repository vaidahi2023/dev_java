package Basic;

//1.arithimetic operators
//---- +,-,/,*,%,++,--
public class Arithimeticoperators {

	public static void main(String[] args) {
		
		int a=10,b=20,sum=0,sub=0,div=0,mul=0,mod=0;
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		mod=a%b;
		System.out.println("sum="+sum);
		System.out.println("sub="+sub);
		System.out.println("mul="+mul);
		System.out.println("div="+div);
		System.out.println("mod="+mod);
		System.out.println("a++="+a++);
		System.out.println("--a="+--a);
	}
}
