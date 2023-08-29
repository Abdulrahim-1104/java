import java.util.Scanner;
public class If {
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any Number ");
		int num = scn.nextInt();
		if(num>0)
		{
			System.out.println(num +" Is Positive ");
		}
		else if(num==0)
		{
			System.out.println(num + " Is Nuetral ");
		}
		else
		{
			System.out.println(num + " Is Negative ");
		}
		scn.close();
		}
}
