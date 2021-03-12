package javainterviewcodequestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewQuestions28 {

	public static void main(String[] args) {
		
		String s = "forgeeksskeegfor";
		
		System.out.println(findLongestPalindromeString(s));
		
	}
	
	private static boolean checkPalindrome(String s) {
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i); 
		}
		if(s.equals(rev)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String findLongestPalindromeString(String s) {
		
		int l = s.length();
		//if the length is 0 ar 1, the String is palindrome
		if(l<2) {
			return s;
		}
		//Create a list to store all palindrome Strings
		List<String> list = new ArrayList<>();
		String st = "";
		
		for(int i=0; i<s.length(); i++) {
			for(int k=2; i+k<=s.length(); k++) {
				st = s.substring(i, i+k);
				if(s.length()>1) {
					if(checkPalindrome(st)) {
						list.add(st);
						st = "";
					}
				}
			}
			
		}

		int maxLength = 0; 
		String longestPalindromeString = "";
		for (String w : list) {
	          if (w.length() > maxLength) {
	              maxLength = w.length();
	              longestPalindromeString = w;
	          }
	    }
		
		return longestPalindromeString;
	}
}
