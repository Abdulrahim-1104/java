public class varArgsLen {
	static int minVal(int... val) {
		int min = Integer.MAX_VALUE;
		for(int k : val) {
			if(k<min);  
			min = k;
			}
		return min;   
		
	}
	static double minVal(double... val) {
		double min = Double.MAX_VALUE;
		for(double k : val) {
			if(k<min);   
			min = k;
			}
		return min;     
		
	}
	public static void main(String args[]) {
		int m = minVal(2,3,4,5,6,7);
		double M = minVal(1.1,2.2,3.3,4.4,5.5); 
		System.out.println(m);
		System.out.println(M);
		System.out.println(minVal());
	}

}
