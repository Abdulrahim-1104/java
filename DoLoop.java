import java.util.Scanner;
public class DoLoop {
	public static void main(String args[]) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Ënter a Number");
		int n = scn.nextInt();
		int i = 1;
		do {
			System.out.print(" $ ");
			i++;
		}while(i<=n);		
		scn.close();
		}
}
