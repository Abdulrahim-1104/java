import java.util.Scanner;
public class forEach {
	public static void main(String args[])
	{
		Scanner scn = new Scanner(System.in);
		int sum =0;
		int s[] =  new int [6];
	System.out.println("Enter Any 1 To 6 Element");
	
	for(int i=0;i<s.length;i++)
	{
	  s[i] = scn.nextInt(); 
	  }
	scn.close();
		for(int a: s)   
		{
			sum=a+sum;     
			 
		}
		
		
		System.out.println(sum);
	   
	}

}
