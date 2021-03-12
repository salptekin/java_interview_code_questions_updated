package javainterviewcodequestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InterviewQuestions24 {
	
	/*
	 	We are organizing a horse race with horses having distinct strengths. 
	 	The strength of the horses is represented by an array of integers. 
	 	In order to make the race competitive, your program should find out the pair of horses with similar strengths:

         For example: {3, 67, 9, 46, 55, 48}

         Output: 46, 48
	*/

	public static void main(String[] args) {
		
		int arr[] = {3, 67, 9, 46, 55, 48};
		
		List<Integer> r = new ArrayList<>();
		List<String> s = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				r.add(Math.abs(arr[i] - arr[j]));
				s.add(i+""+j);
			}
		}
		
		Optional<Integer> small = r.stream().reduce((x,y)->x>y ? y : x);
		int idx = r.indexOf(Integer.valueOf(small.get()));
		
		String el = s.get(idx);
		
		int first = arr[Integer.valueOf(el.substring(0, 1))];
		int second = arr[Integer.valueOf(el.substring(1, 2))];

		System.out.println(first + " - " + second);

	}

}
