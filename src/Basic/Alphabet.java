package Basic;

public class Alphabet {

	public static void main(String[] args) {
		
		char ch='*';
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("it is alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("it is digit");
		}
		else
		{
			System.out.println("it is a special chracter");
		}
		
	}
}
