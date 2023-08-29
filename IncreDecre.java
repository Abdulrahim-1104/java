import java.util.Scanner;
public class IncreDecre {
	public static void main(String args[])
	{
	Scanner scn = new Scanner(System.in);
		System.out.println("Enetr a Value for A");
		         int a = scn.nextInt();
		               System.out.println("Enter a Value for B");
		int b = scn.nextInt();
System.out.println("The Value Of Pre Increment "+ (++a));
	System.out.println("The Value Of Post Increment "+ (a++));
	System.out.println("The Value Of Pre Increment "+ (++a));
		 System.out.println("The Value Of Pre Decrement "+(--b));
		           System.out.println("The Value Of Post Decrement "+(b--));
		           System.out.println("Tricky Question "+(( ++a + a++) ));
		           scn.close();
		
		
	}

}
