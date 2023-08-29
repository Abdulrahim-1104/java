
public class diamondNloop {
public static void main(String args[])
{
	int i,j,k,l,m,n,o,p;
	for(i=1;i<5;i++)
	{
		for(j=i;j<=5;j++)
		{
			System.out.print(" ");
			}
		for(k=1;k<i;k++)
		{
			if(k==5||k==1) {
			System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		for(l=1;l<=i;l++)
		{
			if(i==l) {
			System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		
		System.out.println("");
	}
	for(m=1;m<=5;m++)
	{
		for(n=1;n<=m;n++)
		{
			System.out.print(" ");
		}
		for(o=m;o<5;o++)
			if(o==m){
		{
			System.out.print("*");
		}
			}
			else {
				System.out.print(" ");
			}
		for(p=m;p<=5;p++)
		{
			if(p==5) {
			System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
	
	
}
}
