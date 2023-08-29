package practiceProglem;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scan.nextInt();
		int inc=(n*2)-1;
		int odd=1;
		int even=n*2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j%2==0) {
					System.out.print(odd+" ");
					odd+=(n*2);
				}
				else{
					System.out.print(even+" ");
					even+=(n*2); 
				}
			}
			inc=inc-2;
			odd=i+2;
			even=odd+inc;
			System.out.println("");
		}
	}
}

