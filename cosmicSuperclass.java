class employee{
	private String name; 
	private int salary;
	private String date; 
	 
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int s) {
		salary=s;           
	}
	public String getDate() {
		return date;
	}
	public void setDtae(String d) {
		date=d;
	}
	
	employee(String n,int s,String d){
		name =n;
		salary=s;
		date =d;
	}
public  void displayInfo() {
		System.out.println(getName()+" "+getSalary()+" "+getDate()); 
	}
public int raiseSlaray(int percentage) {
	 return  salary+=salary*percentage/100; 
	}

	
} 
class manager extends employee{
	private int bonus;
	manager(String n,int s,String d,int b){ 
		super(n,s,d);
	    bonus=b; 
	} 
	   public  boolean equal(Object obj) {
	    if(this==obj) 
	    	return true; 
	    if(obj==null) 
	    	return false;
	    if(this.getClass()!=obj.getClass())
	    	return false;
	    	manager m = (manager) obj; 
	    	 return this.getName().equals(m.getName())&&this.getSalary()==m.getSalary()&&this.getDate()==m.getDate()&&this.bonus==m.bonus;                                                      
	}
	   
	}
public class cosmicSuperclass {
	public static void main(String args[]) {        
		manager m1 = new manager("RAHIM",5000,"11-11-2002",100);
		manager m2 = new manager("SHAN",20000,"08-09-1994",1000);
		manager m3 = new manager("MUGIL",15000,"27-07-1998",500);
		manager m4 = new manager("RAHIM",5000,"11-11-2002",100); 
		System.out.println(m1.equal(m4));
		System.out.println(m2.equal(m3));
		
		
		
	}

}
