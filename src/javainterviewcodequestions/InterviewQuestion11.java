package javainterviewcodequestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class InterviewQuestion11 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to see repeated characters");
		String s = scan.nextLine();
		findRepeated(s);
		scan.close();

	}

	public static void findRepeated(String s) {
		String arr[] = s.split("");
		Map<String, Integer> map = new HashMap<>();
		for (String w : arr) {
			if (!map.containsKey(w)) {
				map.put(w, 1);
			} else {
				map.put(w, map.get(w) + 1);
			}
		}
		Set<String> set = new HashSet<>();
		for (String w : arr) {
			if (map.get(w) > 1) {
				set.add(w + "=" + map.get(w));
			}
		}
		System.out.println(set);
	}
}
