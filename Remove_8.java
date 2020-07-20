package Homework;

public class Remove_8 {

	public static void main(String[] args) {
		String str = "abc def ghi klm";
		String result="";
		String[] tokens = str.split(" ");
		for(String token: tokens) {
			result+=token;
		}
	    System.out.println("String- " + result);
	}

}
