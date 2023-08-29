
public class NLoop {
	public static void main(String ags[])
	{ 
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				
				System.out.print(" ");
			}
			
			for(k=1;k<=i;k++)
			{ 
				if(k==i||i==5||i==1||k==1)
				System.out.print("*");
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
			}
			
		}
	} 

