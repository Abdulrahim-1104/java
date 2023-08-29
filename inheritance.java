class Employee{
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
	
	Employee(String n,int s,String d){
		name =n;
		salary=s;
		date =d;
	}
public  void displayInfo() {
		System.out.println(getName()+" "+getSalary()+" "+getDate()); 
	}
public int raiseSlaray(int percentage) {
	 return salary+=salary*percentage/100; 
	}

	
} 
class Manager extends Employee{
	private int bonus;
	Manager(String n,int s,String d,int b){
		super(n,s,d);
	    bonus=b; 
	   
	}
	 public void displayInfo() { 
			System.out.println(getName()+" "+getSalary()+" "+getDate()+" "+bonus);  
		}
	 public int getSalary() {
		 return super.getSalary()+bonus;
	 }
	
}
public class inheritance {
	public static void main(String args[]) {
		Employee e1 = new Employee("Rahim",5000,"11-11-2002");
		e1.displayInfo();
		System.out.println("Raising Salary is "+e1.raiseSlaray(10));
		Manager m1 = new Manager("Abdul",4000,"11-11-2002",1000);
		m1.displayInfo();
		System.out.println(m1.getSalary());
		System.out.println(m1.raiseSlaray(100));
		
	}

}
