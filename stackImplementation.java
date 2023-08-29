class stack{
	int s[] = new int [5];
	int stop; 
	
stack(){
		stop = -1;
}
void push(int num) {
	if(stop<s.length) {
		System.out.println("Stack is full");
		}
	else
	s[++stop]=num; 
	
}

int pop() {
	if(stop==-1) {
	System.out.println("Stack is empty");
	}
	else {
	return s[stop--]; 
	}
	return -1; //if stack is -1 means stack is empty
}
}
public class stackImplementation {
	public static void main(String args[])             
	{
		stack s1 = new stack();
	       s1.push(2); 
	       s1.push(4);
	       s1.push(5);
	       s1.push(8);
	       s1.push(9);
	       System.out.println("The top of the stack "+s1.pop());
	       System.out.println("The top of the stack "+s1.pop());
	       System.out.println("The top of the stack "+s1.pop());
	       System.out.println("The top of the stack "+s1.pop());
	       System.out.println("The top of the stack "+s1.pop());
	       
	}

}
