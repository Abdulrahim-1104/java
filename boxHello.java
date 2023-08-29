

public class boxHello {
	
	static void message()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{  
				if(i==1||j==1||i==5||j==5) {
				System.out.print(" * ");
				}
				else {
					if(i==3&&j<=4)
					{
						
						
						System.out.print("  Allah");
						break;
					}
					if(i==3&&j==5)
						{
						System.out.print("*");
						break;
						
						}
						
					else {
					System.out.print("   ");
					}
					
				}
				
			}
			System.out.println("");
		}
		
		
}
	public static void main(String args[])
	{
		message();
		
	}
	

}
