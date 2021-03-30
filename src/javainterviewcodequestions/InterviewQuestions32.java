package javainterviewcodequestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class InterviewQuestions32 {
	/*
	 	Print just non-repeated elements from an array
	*/

	public static void main(String[] args) {
		
		int arr[] = { 10, 2, 5, 4, 6, 8, 9, 2, 1, 4, 5, 8, 9 };
		
		findNonRepeated1(arr);
		
		System.out.println("================");
		
		
		findNonRepeated2(arr);

	}
	
	public static void findNonRepeated1(int arr[]) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int w : arr) {
			if (!map.containsKey(w)) {
				map.put(w, 1);
			} else {
				map.put(w, map.get(w) + 1);
			}
		}
		
		for (Entry<Integer, Integer> w : map.entrySet()) {
			if (w.getValue() == 1) {
				System.out.println(w.getKey());
			}
		}

	}
	
	public static void findNonRepeated2(int arr[]) {
		
		int flag = 0;
		
		for(int i=0;i<arr.length;i++){   
			
			flag = 0;
			
	        for(int j=0;j<arr.length;j++){
	            
	        	if(i!=j){
	        		
	                if(arr[i]==arr[j]) {
	                    flag=1; //it is repeated number
	                    break; //break the loop as we already found a repetition of this number
	                }

	            }
	        }
	        
	        if(flag==0) {
	            System.out.println(arr[i]+" "); //here is your non-repeated number
	        }
	    }
	}

}
