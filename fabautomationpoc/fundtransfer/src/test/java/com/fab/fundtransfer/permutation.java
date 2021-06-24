package com.fab.fundtransfer;

public class permutation {
	
public static void printPermutn(String str, String ans)
	{
	 // If string is empty 
    if (str.length() == 0) { 
        System.out.print(ans + " "); 
        return; 
    } 

    for (int i = 0; i < str.length(); i++) { 

        // ith character of str 
        char ch = str.charAt(i); //aSyso
			/*
			 * System.out.println("The value of ch is :: "+ch);
			 * System.out.println("Value of i is :: "+i);
			 * System.out.println(str.substring(0, i)); System.out.println(str.substring(i +
			 * 1));
			 */

        // Rest of the string after excluding  
        // the ith character 
        String ros = str.substring(0, i) +  
                     str.substring(i + 1); 
       // System.out.println(ros);

        // Recurvise call 
        printPermutn(ros, ans + ch); 
    } 
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "abc";
printPermutn(s, ""); 
		
		
	}
	


}
