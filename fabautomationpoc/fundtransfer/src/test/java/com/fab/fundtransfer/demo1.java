package com.fab.fundtransfer;

import java.util.Arrays;

// Anagram means when two strings are having characters but in different order.

public class demo1 {

	public static boolean anagram(String str1, String str2) {
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);				
		return Arrays.equals(ch1, ch2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "java";
		String s2 = "aavj";
		System.out.println("Both string are anagram  ::  " + anagram(s1, s2));
	}

}
