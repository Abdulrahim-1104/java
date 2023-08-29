package Bismillah;
public class multiThreading {  
	public static void main(String args[]) {
		
Runnable d = ()->{ 

	for(int i=1;i<=5;i++) {
	System.out.println("Updating DataBase");
	try {Thread.sleep(4000);}catch (InterruptedException e) {e.printStackTrace();
	} 
	}
};
Runnable n =()->{
	for(int i=1;i<=5;i++) {
		System.out.println(i);
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();} 
	}
};
Thread t1 = new Thread(d);
Thread t2= new Thread(n);
t1.start();
t2.start();
	}
}
