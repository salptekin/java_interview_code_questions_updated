package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestions31 {
	
	/*
	 	Print prime numbers which are less than the given number
	*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int n = scan.nextInt();
		
		printPrime(n);

	}
	
	private static boolean isPrime(int n){

		if (n <= 1) {
		    return false;
		}
		 
		for (int i = 2; i < n; i++) {
		    if (n % i == 0) {
		        return false;
		    }
		}
		 
		return true;
	}
	
	public static void printPrime(int n){
		for (int i = 2; i <= n; i++){
		    if(isPrime(i)) {
		        System.out.print(i + " ");
		    }
		}
	}

}
