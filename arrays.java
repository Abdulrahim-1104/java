import java.util.Scanner;
public class arrays {
	public static void main(String args[])
	{
		int a[] = new int[4];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any eight element");
		for(int i=0;i<a.length;i++) 
			a[i] = scn.nextInt();
			scn.close();
		
		for(int i=0;i<a.length;i++)
	 
			System.out.println(a[i]);
			
	
		
		
		
	}

}
