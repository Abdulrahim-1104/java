 package Bismillah;
class box{
	int length;
	int breath;
	int height;
	box(int l,int b,int h ){
		length=l;
		breath=b;
		height=h;
	}
		boolean isEqual(box b) {
			if(length==b.length&&breath==b.breath&&height==b.height)  
				return true;
	return false;
		}
	
}
public class demo {
	public static void main(String args[]) {
		box b1 = new box(2,4,5);
		box b2 = new box(2,4,6);
		box b3 = new box(2,4,5);
		box b4 = new box(2,4,6);
		System.out.println(b1.isEqual(b2));
		System.out.println(b2.isEqual(b4));
		System.out.println(b3.isEqual(b1));
		System.out.println(b4.isEqual(b1));
	}

}
