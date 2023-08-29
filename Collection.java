package Bismillah;
import java.util.*;
public class Collection {
	public static void main(String args[]) {
		LinkedList<Integer> i = new LinkedList<Integer>();
		i.add(2);
		i.pop();
		System.out.println(i.isEmpty());
		Queue<Integer> q = new LinkedList<>();
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(4);
		for(int t:q) {
			System.out.println(t);
		}
		System.out.println(q.size());
		HashSet<String> h = new HashSet<>();
		h.add("R");
		h.add("A");
		h.add("H");
		h.add("I");
		h.add("M");
		
		for(String s :h) {
			System.out.print(s);
		}
		
		
		
		
	}
}
 
