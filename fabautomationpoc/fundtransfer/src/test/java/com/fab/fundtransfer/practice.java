package com.fab.fundtransfer;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		String str1 = s1.nextLine();
		Scanner s2 = new Scanner(System.in);
		String str2 = s2.nextLine();
		System.out.println(" Both Strings are anagram ::::  "+anagram(str1,str2));

	}
	
	
	public static boolean anagram( String str1,String str2)
	{
		
		char[] ch1= str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);				
		return Arrays.equals(ch1,ch2);
	}

}
