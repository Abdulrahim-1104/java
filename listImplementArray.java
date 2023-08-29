package Bismillah;
import java.util.Scanner;
class dynamicArray{
	private static final int initialCapacity=4;
	private int arr[];
	private int size; 
	private int capacity;
	dynamicArray(){
		arr = new int[initialCapacity];
		size = 0;
		capacity = initialCapacity;
	}
	private void expandArray() {
		capacity*=2;
		arr=java.util.Arrays.copyOf(arr, capacity);
	}
	public void add(int val) {
		if(size==capacity)
			expandArray();
		arr[size++]=val;  
	} 
	public void display() {
		if(size==0)
			System.out.println("Element Is Empty Add Some Elements");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void insertAtPosition(int pos,int val) {
		if(size==capacity)
			expandArray();
		for(int i=size-1;i>=pos;i--) {
			 arr[i+1]=arr[i];
		 } 
		 arr[pos]=val;  
		 size++;
	}
	public void deleteAtPosition(int pos) {
		for(int i=pos+1;i<size;i++) {
			arr[i-1]=arr[i];  
			}
		size--;
	}
	public void deleteAtEnd() {
		arr[size-1]=arr[size]; 
		size--;
	}
	public void deleteAtBegning(int pos) {
		for(int i=pos+1;i<size;i++) { 
			arr[i-1]=arr[i];  
			} 
		size--;
			}
	public void insertAtBegning(int pos,int val) {
		if(size==capacity)
			expandArray();
		for(int i=size-1;i>=pos;i--) {
			 arr[i+1]=arr[i];
		 } 
		arr[pos]=val;
		 size++;  
	}
	public void getndex(int pos) {
		 System.out.println("The Index Of The Value is " + arr[pos]);
	}
	public void updateIndex(int index,int val) {
		if(size==capacity)
			expandArray();
		arr[index]=val;
		
	}
	public void search(int val) {  
		boolean found = false;
		for(int i=0;i<size;i++) {  
		   if (arr[i]==val) {
		    	found =true;
		   System.out.println("The Data Is Present In The array and The Index is " + i);
		   }
		}
		if(found==false) 
			System.out.println("The Data Not Present in The Array");   
 	}
	public boolean contain(int val) {
		for(int i=0;i<size;i++) { 
			if(arr[i]==val) 
			return true;
		}
		return false; 
		
	}
	public void clear() { 
		size=0;
	} 
} 
public class listImplementArray {
	public static void main(String args[]) {
		try (Scanner scan = new Scanner(System.in)) {
			dynamicArray list = new dynamicArray();		
			int val;
			int pos;
			int index;
			while(true) { 
			System.out.println("\n--------------List------------------\n");
			System.out.println(" 1 : Insert Element At End");
			System.out.println(" 2 : Display Elements");
			System.out.println(" 3 : Insert Element At Any Position");
			System.out.println(" 4 : Delete Element At Any Postion");
			System.out.println(" 5 : Exit");
			System.out.println("\n-----------------------------------");
			System.out.println("Enter Your Choice ");
			int choice = scan.nextInt();
			switch(choice) { 
			case 1 :
				System.out.println("Enter The Element");
				val = scan.nextInt();
				list.add(val);
				break;
			case 2 :
				System.out.println("The Elements In The List");
				list.display();
						break;
			case 3 :
				System.out.println("Enter The Position Start From 0 ");
				pos=scan.nextInt();
				System.out.println("Enter The Value");
				val = scan.nextInt(); 
				list.insertAtPosition(pos,val);
				break;
			case 4 :
				System.out.println("Enter The Position Start From 0 ");
				pos = scan.nextInt();;
				list.deleteAtPosition(pos);
				break;
			case 5 :
				System.out.println("Deleting Last Element");
				list.deleteAtEnd();
				break;
		case 6:
				System.out.println("delete From The Begning");
				list.deleteAtBegning(0);
				break;
		case 7 :
			System.out.println(".......Insert At Begning........");
			System.out.println("Enter The Data");
			val=scan.nextInt();
			list.insertAtBegning(pos=0,val);  
			break;
		case 8 :
			System.out.println("Enter The Index Number");
			pos = scan.nextInt();
			list.getndex(pos);
			break;
		case 9:
			
			System.out.println("Enter The Index");
			index=scan.nextInt();
			System.out.println("Enter The Value ");
			val=scan.nextInt();
			list.updateIndex(index,val);
			break;
		case 10 :
			System.out.println("Enter The Value");
			val  = scan.nextInt();
			list.search(val);
			break;
		case 11:
			
			list.clear();
			break;
		case 12 :
			System.out.println("Enter The Element ");
			val=scan.nextInt();
			System.out.println(list.contain(val));
			break; 
			case 13:
				System.exit(0);
				default: 
					System.out.println("Invalid Choice");
			}
			}
		}
	}
}