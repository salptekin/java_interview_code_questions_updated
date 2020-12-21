package javainterviewcodequestions;

public class InterviewQuestion09 {
	
	/*
	  From a given array find all pairs whose sum is a given number
	  {4, 6, 5, -10, 8, 5, 20} ==> 10
	  For example;	4+6=10, 5+5=10, -10+20=10 
	 */

	public static void main(String[] args) {
		findPairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
		
		System.out.println("===========");
		
		findPairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);

	}
	
	public static void findPairs(int arr[], int num) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]+arr[j]==num) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + num );
				}
				
			}
			
		}
		
	}

}
