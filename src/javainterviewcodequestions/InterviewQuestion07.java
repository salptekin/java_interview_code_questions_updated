package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestion07 {
	
	/*
	 	A number is called an Armstrong number if it equals to the sum of the cube of its every digit.
	    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	    You need to write a program to check if the given number is Armstrong number or not.
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is Armstrong number or not");
		int n = scan.nextInt();
		
		int sumOfCubes = 0;
		int temp = n;
		int digit = 0; 
		
		while(n>0) {
			digit = n%10;
			sumOfCubes = sumOfCubes + digit*digit*digit;
			n = n/10;
		}
		
		if(temp==sumOfCubes) {
			System.out.println(temp + " is Armstrong number");
		}else {
			System.out.println(temp + " is not Armstrong number");
		}
		
		scan.close();

	}

}
