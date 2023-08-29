import java.util.Scanner;
public class Ex1 {
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Any Single Number");
		int num = scn.nextInt(); 
		System.out.println("          "+num);
		System.out.println("         "+num+" "+num);
		System.out.println("        "+num+" "+num+" "+num);
		System.out.println("       "+num+" "+num+" "+num+" "+num); 
		scn.close();
		  
	}

}
