package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestion22 {
	
	/*
	 				Ebay Interview Questions
	 	Get a String and a character from user 
	 	Count the number of characters between the first occurence and the last occurence of the given character in the String
	 	Do not count the space characters
	 	If the character which user selected is displayed just once in the String return -1
	 	If the character which user selected does not exist in the String return -1
	 	For example; "Java is easy" - 'a' ==> 5
	 	             "Java is easy" - 'w' ==> -1
	 	             "Java is easy" - 'e' ==> -1
	 */

	public static void main(String[] args) {
		
		System.out.println(getNumOfChars());	

	}
	
	public static int getNumOfChars() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String...");
		String s = scan.nextLine();
		
		System.out.println("Enter a character...");
		char ch = scan.next().charAt(0);
		
		int firstOccIdx = s.indexOf(ch);
		int lastOccIdx = s.lastIndexOf(ch);
		int counter = 0;
		
		if(firstOccIdx == lastOccIdx) {
			return -1;
		}else {
			
			for(int i=firstOccIdx+1; i<lastOccIdx; i++) {
				
				if(s.charAt(i)!=' '){
					counter++;
				}
				
			}
			
			return counter;
		}	

	}

}
