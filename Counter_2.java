package Homework;

import java.util.*;
import java.util.Map.Entry;

public class Counter_2 {
	public static void main(String[] args) {
		String a ="abc def ghi klm def ";
		Map<String,Integer> m =new HashMap<>();
		String[] tokens = a.split(" ");
		for(String token: tokens) {
			String word = token.toLowerCase();
			if(m.containsKey(word)) {
				int count = m.get(word);
				m.put(word, count+1);
			}
			else {
				m.put(word, 1);
			}
		}
		Iterator<Entry<String, Integer>> iter = m.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> entry = iter.next();
			System.out.println("Key: "+entry.getKey()+"   Value: "+entry.getValue());
		}
	}

}
