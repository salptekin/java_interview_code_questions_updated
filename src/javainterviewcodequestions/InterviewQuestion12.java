package javainterviewcodequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewQuestion12 {

	/*
	 * 15 Minutes Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to
	 * the maximum value, decreasing constantly after the maximum value
	 * 
	 * Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to
	 * the maximum value, decreasing and increasing after the maximum value
	 * 
	 * Create a method to check if it is Mountain Array or not. Use as possible as
	 * Functional Programming
	 * 
	 */
	public static void main(String[] args) {
		
		int a[] = { 0, 2, 5, 3, 1 };
		List<Integer> list = new ArrayList<>();
		Arrays.stream(a).forEach(t -> list.add(t));

		int max = list.stream().reduce(Integer.MIN_VALUE, Integer::max);

		int idxOfMax = list.indexOf(max);

		List<Integer> part1 = new ArrayList<>();
		list.stream().filter(t -> list.indexOf(t) <= idxOfMax).forEach(t -> part1.add(t));

		List<Integer> sortedPart1 = new ArrayList<>();
		part1.stream().forEach(t -> sortedPart1.add(t));
		Collections.sort(sortedPart1);

		List<Integer> part2 = new ArrayList<>();
		list.stream().filter(t -> list.indexOf(t) >= idxOfMax).forEach(t -> part2.add(t));

		List<Integer> reverseSortedPart2 = new ArrayList<>();
		part2.stream().forEach(t -> reverseSortedPart2.add(t));
		Collections.sort(reverseSortedPart2);
		Collections.reverse(reverseSortedPart2);

		if (part1.equals(sortedPart1) && part2.equals(reverseSortedPart2)) {
			System.out.println(list + " is Mountain Array");
		} else {
			System.out.println(list + " is not Mountain Array");
		}
	}

}
