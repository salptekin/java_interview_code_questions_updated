package javainterviewcodequestions;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion13 {
	
	/*
	  Ask user to enter 2 Strings.
	  If the characters and the numbers of characters of the Strings are same then print "Anagram" on the console.
	  Otherwise, print "Not Anagram" on the console. 
	  Ignore cases.
	  For example; "Mary" and "army" and "RAMY" are Anagrams.
	*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki String giriniz");
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		isAnagram(s1, s2);
		scan.close();
	}

	public static void isAnagram(String s1, String s2) {

		String a1[] = s1.toLowerCase().split("");
		Arrays.sort(a1);

		String a2[] = s2.toLowerCase().split("");
		Arrays.sort(a2);

		if (s1.length() != s2.length()) {
			System.out.println("Bu String'ler 'Anagram' degildir");
		} else if (s1.isEmpty() || s2.isEmpty()) {
			System.out.println("Bu String'ler 'Anagram' degildir");
		} else if (Arrays.equals(a1, a2)) {
			System.out.println("Bu String'ler 'Anagram'dir");
		} else {
			System.out.println("Bu String'ler 'Anagram' degildir");
		}
	}
}
