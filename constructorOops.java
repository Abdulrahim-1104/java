class Student{
	String name;
	String std;
	int rollNo;
	int marks[] = new int[5];
	{
	marks[0]=56;
	marks[1]=87;
	marks[2]=78; 
	marks[3]=67;
	marks[4]=89;
	}
	 Student(String n,String s,int r) {

	name=n;  
	std=s;
	rollNo=r;
	} 
	void setValue(String n,String s,int r){
		name=n;
		std=s;
		rollNo=r;
		
		
	}
	int totalMarks(){
		int total = 0;
		for(int i=0;i<marks.length;i++) {
			
			total = total+marks[i];  
			 }
		return total;
		}
	
} 
public class constructorOops {
	public static void main(String args[])
	{
		Student  std1 = new Student("Rahim","12th",2001);  
		int t = std1.totalMarks();
		System.out.println(std1.name);
		System.out.println(std1.std);
		System.out.println(std1.rollNo);
		System.out.println("The Total Mark Of The Student Is "+t); 
		
		} 

}
