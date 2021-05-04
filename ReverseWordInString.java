/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	
	public static String ReverseWord(String s){
	    int i = s.length() - 1;
        String ans = "";
        //System.out.print(" Strinf value is  :  " + i);
	    while(i >= 0){
            //System.out.print(" inside the while loop");
	        while(i >=0 && s.charAt(i) == ' ') i--;
                
                int j = i;
                
	            if(i < 0) break;
	            while(i >=0 && s.charAt(i)!= ' ') i--;
	            if(ans.isEmpty()){
	                ans = ans.concat(s.substring(i+1, j+1));
	            }else {
	                ans = ans.concat(" " +s.substring(i+1, j+1));
	            }
	        }
	        return ans;
	}
	    
	
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        for (int i = 0 ; i< size; i++){
            String countries [] = new String[size-1];
    
        }

        //String str = "i like this program very much";
        //String val = ReverseWord(str);
        System.out.println(val);
	}
}