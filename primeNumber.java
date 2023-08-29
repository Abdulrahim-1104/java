import java.util.Scanner;  
public class primeNumber {
	public static void main(String args[])
	
	{
		int n,i;
		boolean prime = true;
		Scanner scn = new Scanner(System.in);
		 
		System.out.println("Enter Any Number");
		n = scn.nextInt();
		scn.close(); 
		
		for(i=2;i<n;i++)
		{ 
			if(n%i==0)
			{ 
				System.out.println(n + " It not is prime ");
		prime= false;
				break;
				
			}
			
		}
		if(prime==true)
		{
			System.out.println(n+ " It is prime");
		}
			
	}

}
