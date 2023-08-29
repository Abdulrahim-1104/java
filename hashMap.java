package Bismillah;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class hashMap {

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
    // Write your code here
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    List<Integer> result= new ArrayList<>();
  for(int i=0;i<orders.size();i++){
      int sum=orders.get(i).get(0)+orders.get(i).get(1);
      map.put(i+1,sum);
  }
  Set<Entry<Integer,Integer>> entrySet = map.entrySet();
  List<Entry<Integer,Integer>> list = new ArrayList<>(entrySet);
       Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        list.forEach(s->{
            result.add(s.getKey());
        });
  return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer,Integer> map = new HashMap();
     map.put(1,5);
     map.put(2,4);
     map.put(3,3);
     map.put(4,2);
     map.put(5,1);
      
	}

}
