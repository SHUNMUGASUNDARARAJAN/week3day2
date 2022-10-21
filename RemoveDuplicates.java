package week3day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input="paypal India";
       String lowercase =input.toLowerCase();
       
       char[] array=lowercase.toCharArray();
       
       Set<Character> charset = new LinkedHashSet<Character>();
       
       Set<Character> dubcharset =new LinkedHashSet<Character>();
       
       for(int i=0; i<input.length();i++) {
    	   if(!charset.add(array[i])) {
    		   dubcharset.add(array[i]);
    	   }
       }
       
       charset.removeAll(dubcharset);
       
       System.out.println(charset);
       System.out.println(dubcharset);
       
       List<Character> one=new ArrayList<Character>(charset);
       
       
       for(int i=0;i<one.size();i++) {
    	   if(one.get(i)!=' ') {
    		   System.out.println(one.get(i));
    	   }
       }
       
       
       
       
       
       
	}

}
