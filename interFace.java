package Bismillah;
interface vehicle{
	abstract void ride();
}
class car implements vehicle{ 
	public void ride() {
		System.out.println("Hello from car class");
	}
}
class bike implements vehicle{ 
   public  void ride() {
    System.out.println("Hello from bike class");
    }
}
class driver {
	public void ride(vehicle v ) {
	System.out.println("Checking");
	v.ride();
	} 
}
public class interFace {
	public static void main(String args[]) {
		car c = new car();
		bike b = new bike();
		driver d = new driver();
		d.ride(b);
		d.ride(c);
		
		
	}

}
