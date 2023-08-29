package practiceProglem;

import java.util.Arrays;
import java.util.Stack;

public class numberPlaindrome {
	public static boolean isPalindrome(int x) {
	    int val=x;
	    int reverse=0;
	        while(val>0){
	            int temp=val%10;
	            val/=10;
	            reverse*=10;
	            reverse+=temp;
	        }
	        if(x==reverse){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
    public static int getValue(char ch){
        int val=0;
        if(ch=='I'){
         val=1;
        }
        else if(ch=='V'){
            val=5;
        }
        else if(ch=='X'){
            val=10;
        }
        else if(ch=='L'){
            val=50;
        }
        else if(ch=='C'){
            val=100;
        }
        else if(ch=='D'){
            val=500;
        }
        else{
            val=1000;
        }
        return val;
    }
	 public static int romanToInt(String s) {
		 int sub=0;
	        int result=getValue(s.charAt(0));
	        for(int i=1;i<s.length();i++){
	            int val=i-1;
	             if(getValue(s.charAt(i))>getValue(s.charAt(val))){
	               sub+=2*(getValue(s.charAt(val)));   
	             }
	                 result+=getValue(s.charAt(i));
	        }
	        return result-sub;
	    }
	 public static  String longestCommonPrefix(String[] strs) {
		 boolean bool=true;
		 String result="";
	        for(int i=0;i<strs[0].length();i++) {
	        	for(int j=1;j<strs.length;j++) {
	        		if(strs[j].charAt(i)!=strs[0].charAt(i)) {
	        			bool=false;
	        			break;
	        		}
	        	}
	        	if(bool) {
	        		result+=strs[0].charAt(i);
	        	}
	        	else {
	        		break;
	        	}
	        }
	        return result;
	    }
	    public boolean isValid(String s) {
	        if(s.length()==1){
	            return false;
	        }
	        boolean bool=false;
	    for(int i=0;i<s.length()-1;i++){
	        if(s.charAt(i)=='('){
	            if(s.charAt(i+1)==')'){
	                bool=true;
	                i++;
	            }
	            else{
	                bool=false;
	                break;
	            }
	        }
	        else if(s.charAt(i)=='{'){
	            if(s.charAt(i+1)=='}'){
	                bool=true;
	                i++;
	            }
	            else{
	                bool=false;
	                break;
	            }
	        }
	        else{
	            if(s.charAt(i+1)=='['){
	                bool=true;
	                i++;
	            }
	            else{
	                bool=false;
	                break;
	            }
	        }
	    }
	    return bool;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		System.out.println(stack.isEmpty());
System.out.println(isPalindrome(121));	
System.out.println(romanToInt("III"));
String[] str= {"ab","a"};
Arrays.sort(str);
System.out.println(longestCommonPrefix(str));
	
	}


}
