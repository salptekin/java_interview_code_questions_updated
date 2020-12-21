package javainterviewcodequestions;

public class InterviewQuestion16 {
	
	/*
	  	Ask user to enter the number of lines of a inverted half pyramid.
	  	Type a program to create the inverted half pyramid.
	    For example if the number of lines is 5, the pyramid will be like;  * * * * *
																			* * * *
																			* * * 
																			* *
																			*
    */
	
	public static void main(String[] args) {
	    int rows = 5;

	    for (int i = rows; i >= 1; --i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
	}

}
