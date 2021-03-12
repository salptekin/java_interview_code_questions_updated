package javainterviewcodequestions;

import java.util.Scanner;

public class InterviewQuestion03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many fibonacci number do you want to see?");
		int number = scan.nextInt();
		fibonacci(number);
        scan.close();
	}

	public static void fibonacci(int number) {
		int fibo1 = 1; 
		int fibo2 = 1; 
		int fibonacci = 0;
		System.out.print(fibo1 + " ");
		System.out.print(fibo2 + " ");
		
		for (int i = 1; i < number-1; i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
			System.out.print(fibonacci + " ");
		}

	}

}
