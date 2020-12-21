package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestion02 {

	//Write a Java Program to swap two numbers
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers to swap");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		
		System.out.println("Before swapping: " + n1 + " - " + n2);
		
		//1.Way: Use 3rd variable 
		double temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("After swapping: " + n1 + " - " + n2);
		
		//2.Way: Do not use 3rd variable
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("After swapping: " + n1 + " - " + n2);

	}

}
