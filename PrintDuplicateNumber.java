package week3day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] data= {4,3,6,8,29,1,2,4,7,8};

    Set<Integer>duplicate=new TreeSet<Integer>();
    for(int i=0;i<data.length;i++) {
    
    if(!duplicate.add(data[i])) {
    	System.out.println(data[i]);
    }
	}
	}
}
