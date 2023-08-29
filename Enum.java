enum level{
	BOT("B"),NOOB("N"),PRO("P");
	private String abb;
	level(String a){
		abb=a;
	}
public String getabb() {
return abb;
}
}
public class Enum {
	public  static void main(String args[]) {
		level l1 = level.BOT;
		level l2 =level.NOOB;
		level l3 = level.PRO;
		level l4 = level.BOT;
		System.out.println(l1);
		System.out.println(l1.getabb());
		System.out.println(level.valueOf("BOT")); 
		System.out.println(l1.compareTo(l4));
		System.out.println(l2.compareTo(l3));
		System.out.println(l3.compareTo(l2)); 
	}
}

