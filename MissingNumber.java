package week3day2;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] num= {5,2,8,4,5,1,8,7,3,6,10,5,7,12};
         
         Set<Integer> x=new TreeSet<Integer>();
         
         for(int i=0;i<num.length;i++) {
        	 x.add(num[i]);
        	 
         }
         System.out.println("set is in a ascending order "+x);
         
         for(int j=1;j<Collections.max(x);j++){
        	 if(!x.contains(j)) {
        		 System.out.println("Missing number is " +(j));
        	 }
         }
	}

}
