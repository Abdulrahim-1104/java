class Std{
	String name;
	int rollNo;
	int marks[] = new int[5]; 
	{
     marks[0] = 98;
     marks[1] = 76;
     marks[2] = 89;
     marks[3] = 54;
     marks[4] = 67;
	}    		
	
	int markTotal(){
		 
		int totalMarks = 0;
		for(int i=0;i<marks.length;i++)
		{
		  totalMarks +=  marks[i];
			
		}
		return totalMarks;
	}	
	
} 
public class studentsMethodinvoke {
	public static void main(String args[])
	{
		Std std1= new Std();
		
		System.out.println(std1.name="Rahim"); 
		
		System.out.println(std1.rollNo = 12001);
		 
		int total=std1.markTotal();//method invoking
		System.out.println("The Total Mark Is "+total);
	}

}
