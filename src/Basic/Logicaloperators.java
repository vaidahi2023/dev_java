package Basic;

//logical operators
//-- &&,||,!
public class Logicaloperators {

	public static void main(String[] args) {
		
		int a=10,b=20;
		System.out.println("a>b && a<b="+(a>b && a<b));
		System.out.println("a==10 && a<b="+(a==10 && a<b));
		
		System.out.println("a>b || a<b="+(a>b || a<b));
		System.out.println("a==10 || a<b="+(a==10 || a<b));
		
		System.out.println("!a<b="+!(a<b));
		System.out.println("!a>b="+!(a>b));
	}
}
