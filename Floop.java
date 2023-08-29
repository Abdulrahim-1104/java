import java.util.Scanner;
public class Floop {
	public static void main(String aegs [])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int n = scn.nextInt();
		int i =1;
		for(;i<=n;i++)
		{
			System.out.print(" $ ");
			scn.close();
		}
		
		System.out.println(i);
		
	}
	
}
