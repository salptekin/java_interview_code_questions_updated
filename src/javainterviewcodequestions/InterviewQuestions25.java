package javainterviewcodequestions;
import java.util.Arrays;

public class InterviewQuestions25 {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		
		int a = 0;

		for(int k=0; k<7; k++) {
			
			a = arr[0];
			for(int i=0; i<arr.length-1; i++) {
				arr[i] = arr[i+1];	
			}
			arr[arr.length-1] = a;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
