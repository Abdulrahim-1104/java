import java.util.Scanner;
public class SwitchEx {
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Any Alphabet Number");
		char ch = scn.next().charAt(0);
		switch(ch)
	 	{
		case 'a':
			System.out.println(" a is a voweles ");
			break;
		case 'e':
			System.out.println(" e is a voweles ");
			break;
		case 'i':
			System.out.println(" i is a voweles ");
			break;
		case 'o':
			System.out.println(" o is a voweles ");
			break;
		case 'u':
			System.out.println(" u is a voweles ");
			break;
			default:
				System.out.println(ch+" Not a voweles ");
		}
		scn.close();
		
	}

}
