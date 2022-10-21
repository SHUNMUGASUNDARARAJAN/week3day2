package week3day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {3,2,11,4,6,7};
int[] b = {1,2,8,4,9,7};

  List<Integer> one =new ArrayList<Integer>();
  List<Integer> two =new ArrayList<Integer>();
	
  for(int i=0; i<a.length;i++) {
	  one.add(a[i]);
  }
  for(int j=0; j<b.length;j++) {
      two.add(b[j]);
      
  }
  
  System.out.println("Intersection number ");
  
   for(int i=0;i<one.size();i++) {
	for(int j=0;j<two.size();j++) {
		
		if(one.get(i).equals(two.get(j))) {
			
			System.out.println(two.get(j));
			
		}
	}
   }
      
      
  
  
	}
	

}
