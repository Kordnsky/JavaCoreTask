package Homework;

import java.util.*;

public class Hashiter_3 {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer,String>();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		Iterator<Map.Entry<Integer, String>> iter = m.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, String> entry = iter.next();
			System.out.println("Key: "+entry.getKey()+"   Value: "+entry.getValue());
		}
	}

}
