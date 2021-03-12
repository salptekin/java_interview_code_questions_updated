package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestion06 {
	
	/*
	 	Create a program checks if a String is palindrome or not.
	 	If a word, phrase, or sequence that reads the same backward as forward then it is called "Palindrome", 
	    For example, "madam" or "nurses run".
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to check if it is palindrome or not");
		String str = scan.nextLine().replace(" ","").toLowerCase();
		
		isPalindrome(str);
		
		scan.close();
	}
	
	public static void isPalindrome(String str) {
		
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		if(str.equals(revStr)) {
			System.out.println(str + " is palindrome");
		}else {
			System.out.println(str + " is not palindrome");
		}

	}

}
