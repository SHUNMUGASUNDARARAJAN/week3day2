package week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[] num= {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> x=new TreeSet<Integer>();
		
		for(int i=0;i<num.length;i++) {
			x.add(num[i]);
		}
		
		List<Integer> large=new ArrayList<Integer>(x);
		System.out.println(large);
		int size= large.size();
		System.out.println("second largest is " +large.get(size-2));
	}

}
