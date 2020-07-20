package Homework;

import java.util.HashMap;
import java.util.Map;

public class MissingInt_9 {
	public static boolean ifContains(int[] arr,int a) {
		Map<Integer,Integer> m =new HashMap<>();
		for(int i : arr) {
			if(m.containsKey(i)) {
				int count = m.get(i);
				m.put(i, count+1);
			}
			else {
				m.put(i, 1);
			}
		}
		if(m.containsKey(a)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {1,1,2,2,4,4,4,5,6,7,8,9,9};
		System.out.println("Contains 3?  "+ifContains(a,3));
		System.out.println("Contains 4?  "+ifContains(a,4));
	}

}
