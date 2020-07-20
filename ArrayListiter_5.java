package Homework;

import java.util.ArrayList;

public class ArrayListiter_5 {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
	    arrlist.add(1);
	    arrlist.add(2);
	    arrlist.add(3);
	    arrlist.add(4);

//For loop
	    System.out.println("For loop: ");
	    for (int count = 0; count < arrlist.size(); count++) { 		      
	        System.out.println(arrlist.get(count)); 		
	    }   		
//Advance For loop	
	    System.out.println("Advanced For loop: "); 		
	    for (Integer num : arrlist) { 		      
	         System.out.println(num); 		
	    }
//While loop	
	    System.out.println("While loop: "); 		
	    int count = 0; 		
	    while (arrlist.size() > count) {
	    	System.out.println(arrlist.get(count));
	        count++;
	    }
	}
}

