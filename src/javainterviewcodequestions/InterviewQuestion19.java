package javainterviewcodequestions;

public class InterviewQuestion19 {
	/*
	  	Ask user to enter the number of lines of an inverted pyramid.
	  	Type a program to create the inverted pyramid.
  	    For example; if the number of lines is 5, the pyramid will be like; * * * * * * * * *
																			  * * * * * * *
																			    * * * * *
																			      * * *
																			        *
    */
	
	public static void main(String[] args) {
		
	    int rows = 5;

	    for(int i = rows; i > 0; --i) {
	    	
	      for(int space = 0; space < rows - i; space++) {
	        System.out.print("  ");
	      }

	      for(int j=0; j < 2 * i - 1; j++) {
	        System.out.print("* ");
	      }

	      System.out.println();
	    }
	  }

}
