package Homework;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class RepeatedWord_10 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			String line;
			Map<String,Integer> m =new HashMap<>();
			while((line = br.readLine())!=null) {
				String[] tokens = line.split(" ");
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
			}
			 List<Integer> list = new ArrayList<Integer>();
			 for (Integer value : m.values()) { 
				 list.add(value);
			 }
			 Integer max = Collections.max(list);
			 for(String k : m.keySet()) {
				 if(m.get(k).equals(max)) {
					 System.out.println(k);
				 }
			 }
		}catch(IOException e) {
		}
	}
}
