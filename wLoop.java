import java.util.Scanner;
public class wLoop {
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("�nter a Number");
		int n = scn.nextInt();
		int i = 1;
		while(i<=n)
		{
			System.out.print(" $ ");
			i++;
		}
		scn.close();
		
		
	}

}
