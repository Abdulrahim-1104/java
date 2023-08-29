package Bismillah;
public class fibbnocciSeries {
	static int fibbonic(int num) {
		if(num==0)
			return 0;
		if(num==1) 
		return 1; 
		
		
		return  fibbonic(num-1)+fibbonic(num-2);
		
	
		
	}
	public static void main(String args[]) {
	System.out.println(fibbonic(7)); 
	}

}
 