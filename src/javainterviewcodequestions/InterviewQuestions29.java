package javainterviewcodequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterviewQuestions29 {

	public static void main(String[] args) {
		
		int a[] = {11, 6, 5, 2, 1};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<a.length; i++) {
			
			if(a[i]-a[i-1]!=1) {
				
				for(int k=1; k<a[i]-a[i-1]; k++) {
					list.add(a[i-1] + k);
				}
				
			}
		}
		
		System.out.println(list);

	}

}
