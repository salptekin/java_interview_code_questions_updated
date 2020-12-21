package javainterviewcodequestions;

public class InterviewQuestion17 {
	
	/*
	  	Ask user to enter the number of lines of a inverted half pyramid by using numbers.
	  	Type a program to create the inverted half pyramid.
	    For example if the number of lines is 5, the pyramid will be like;  1 2 3 4 5
																			1 2 3 4 
																			1 2 3
																			1 2
																			1
    */
	
	public static void main(String[] args) {
	    int rows = 5;

	    for (int i = rows; i >= 1; --i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }
	  }
}
