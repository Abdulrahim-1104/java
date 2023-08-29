package Bismillah;
class average{
	int sum;
	int count;
	
	int avg(int a,int b,int c) {
		return a+b+c/3;
	}
	int avg(int a,int b) {
		return a+b/2;
	}
	int avg(int a,int b,int c,int d) {
		return a+b+c+d/4;
	}
	
}

public class avergeMethod {
	public static void main(String []args) {
		average a1 = new average();
	System.out.println(a1.avg(3,4));
	System.out.println(a1.avg(2,4,6,8));
	System.out.println(a1.avg(1,4,7));
		
		 
	}

}
