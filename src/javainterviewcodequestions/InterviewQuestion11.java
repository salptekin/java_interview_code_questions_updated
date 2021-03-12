package javainterviewcodequestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
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
		
		for (Entry<String, Integer> w : map.entrySet()) {
			if (w.getValue() > 1) {
				System.out.println(w.getKey() + " = " + w.getValue());
			}
		}

	}
}
