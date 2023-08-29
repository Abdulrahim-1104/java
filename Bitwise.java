import java.util.Scanner;
public class Bitwise {
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Any Number for A ");
		int a = scn.nextInt();
		System.out.println("Enetr Any Number For B ");
		int b = scn.nextInt();
		System.out.println(" � & B " + (a&b)); 
		System.out.println(" A | B " +(a|b));
		System.out.println(" A ^ B " + (a^b));
		System.out.println(" ~A " +(~a));
		System.out.println(" ~B " + (~b));
		System.out.println(" A<< " + (a<<1));
		System.out.println(" A>> " + (a>>1));
		System.out.println(" A<<< " + (a>>>1));
		
		
		scn.close();
	}

}
