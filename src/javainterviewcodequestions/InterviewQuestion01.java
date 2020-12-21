package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestion01 {
	
	//Write a Java Program to reverse a string

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String str = scan.nextLine();
		
		//1.Way: By using StringBuilder()
		StringBuilder strB = new StringBuilder();
		strB.append(str);
		System.out.println(strB.reverse());
		
		String revStr = "";
		//2.Way: By using String Class
		for(int i=str.length()-1; i>=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);
		
		//3.Way: Create a method then call the method from main method
		System.out.println(revStr(str));
	
	}
	
	public static String revStr(String str) {		
		String revStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			revStr = revStr + str.charAt(i);
		}
		return revStr;
	}
	
	
	
	
	
	
	
	
	
	
}
