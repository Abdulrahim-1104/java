import java.util.Scanner;
public class Scan {
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scn.nextLine();
		System.out.println("Hello "+name);
		System.out.println("Ënter Your Age");
		int age = scn.nextInt();
		if(age>=18)
		{
			System.out.println(age);
		}
		else
		{
			System.out.println("Your Not Eligble To This Content");
		}
		
		scn.close();
	}
	

}
