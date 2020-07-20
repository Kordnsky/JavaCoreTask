package Homework;

import java.util.Arrays;

public class SecondHigh_7 {
	public static void main(String[] args) {
		int[] a = {2,5,89,23,12,45,36,41,6,77};
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
	}
}
