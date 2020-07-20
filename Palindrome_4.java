package Homework;

public class Palindrome_4 {
	public static Boolean ifPalin(String s) {
		int length = s.length();
		char[] c = s.toCharArray();
		int i  = 0;
		while(i<=(length -1)/2) {
			if(c[i] != c[length-1-i]) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		String a = "aba";
		System.out.println(ifPalin(a));
	}

}
