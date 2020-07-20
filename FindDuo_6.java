package Homework;

import java.util.HashMap;
import java.util.Map;

public class FindDuo_6 {

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
		for(String s: m.keySet()) {
			if(m.get(s)>1) {
				System.out.println("Duplicate Word is : "+s);
			}
		}
	}

}
