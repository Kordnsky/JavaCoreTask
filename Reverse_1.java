package Homework;

public class Reverse_1 {
	public static String reverse(String s) {
		int length = s.length();
		char[] c = s.toCharArray();
		for(int i=0; i<(length-1)/2;i++) {
			char temp = c[i];
			c[i] = c[length-1-i];
			c[length-1-i]=temp;
		}
		return new String(c);
	}
	public static void main(String[] args) {
		String a = "abcdefg";
		System.out.println(reverse(a));
	}

}
