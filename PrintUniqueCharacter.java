package week3day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input ="babu";
        System.out.println("Original String " +input);
        
        char[] name = input.toCharArray();
        
        Set<Character> unique =new HashSet<Character>();
        char start=0;
        for(int i=0;i<name.length;i++) {
        	if(!unique.add(name[i])) {
        		start=name[i];
        		System.out.println("Duplicate character  "+name[i]);
        		unique.remove(start);			
        	}
        }
        System.out.println("unique character  "+unique);
	}

}
