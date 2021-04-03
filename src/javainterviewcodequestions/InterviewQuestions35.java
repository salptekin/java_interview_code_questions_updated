package javainterviewcodequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class InterviewQuestions35 {

	private String handAsString;

    public InterviewQuestions35(String hand) {
       handAsString = hand;
    }

    public Boolean isGreaterThan(InterviewQuestions35 hand1, InterviewQuestions35 hand2) {
    	
    	boolean wins = false;
        // How to get ranks and suits in hand2
    	String arr1[] = hand1.toString().split(",");
    	List<String> last1 = new ArrayList<>();
    	for(int i=0; i<arr1.length; i++) {
    		last1.add(arr1[i].substring(arr1[i].length()-1));
    	}
    	List<String> first1 = new ArrayList<>();
    	for(int i=0; i<arr1.length; i++) {
    		first1.add(arr1[i].substring(0,arr1[i].length()-1));
    	}
    	// How to get ranks and suits in hand2
    	String arr2[] = hand2.toString().split(",");
    	List<String> last2 = new ArrayList<>();
    	for(int i=0; i<arr2.length; i++) {
    		last2.add(arr2[i].substring(arr2[i].length()-1));
    	}
    	List<String> first2 = new ArrayList<>();
    	for(int i=0; i<arr2.length; i++) {
    		first2.add(arr2[i].substring(0,arr2[i].length()-1));
    	}
    	//How to check straight for hand1
    	boolean straight1 = false;
    	List<String> ranks = new ArrayList<>();//List.of("2","3","4","5","6","7","8","9","10","J","Q","K","A");
    	ranks.add("2");
    	ranks.add("3");
    	ranks.add("4");
    	ranks.add("5");
    	ranks.add("6");
    	ranks.add("7");
    	ranks.add("8");
    	ranks.add("9");
    	ranks.add("10");
    	ranks.add("J");
    	ranks.add("Q");
    	ranks.add("K");
    	ranks.add("A");
    	List<String> rankSubs1 = new ArrayList<>();
    	int k = 0;
    	do{
	    	for(int i=k; i<k+5; i++) {
	    		rankSubs1.add(ranks.get(i));
	    	}
	    	if(first1.equals(rankSubs1)) {
	    		straight1 = true;
	    		break;
    		}else {
    			rankSubs1.clear();
    			k = k+1;
    		}
    	}while(k<8);

    	//How to check straight for hand2
    	boolean straight2 = false;
    	List<String> rankSubs2 = new ArrayList<>();
    	int m = 0;
    	do{
	    	for(int i=m; i<m+5; i++) {
	    		rankSubs2.add(ranks.get(i));
	    	}
	    	if(first2.equals(rankSubs2)) {
	    		straight2 = true;
	    		break;
    		}else {
    			rankSubs2.clear();
    			k = k+1;
    		}
    	}while(k<8);
    	
    	//How to check flush for hand1
    	boolean flush1=true;
    	for (int x=1; x<5; x++) {
    		if (!last1.get(x-1).equals(last1.get(x)) ){
    			 flush1=false;
    		}
    	}
    	
    	//How to check flush for hand2
    	boolean flush2=true;
    	for (int x=1; x<5; x++) {
    		if (!last2.get(x-1).equals(last2.get(x)) ){
    			 flush2=false;
    		}
    	}
    	
    	//How to check straight-flush for hand1
    	boolean straightFlush1=false;
    	if(straight1==true && flush1==true) {
    		straightFlush1 = true;
    	}
    	
    	//How to check straight-flush for hand2
    	boolean straightFlush2=false;
    	if(straight2==true && flush2==true) {
    		straightFlush2 = true;
    	}
    	
    	//Create a map for hand1
    	Map<String, Integer> map1 = new HashMap<>();
    	for(int i=0; i<first1.size(); i++) {
    		if(!map1.containsKey(first1.get(i))) {
        		map1.put(first1.get(i), 1);
        	}else {
        		map1.put(first1.get(i), map1.get(first1.get(i))+1);
        	}
    	}
    	//Create a map for hand2
    	Map<String, Integer> map2 = new HashMap<>();
    	for(int i=0; i<first2.size(); i++) {
    		if(!map2.containsKey(first2.get(i))) {
        		map2.put(first2.get(i), 1);
        	}else {
        		map2.put(first2.get(i), map2.get(first2.get(i))+1);
        	}
    	}

    	//How to check four of a kind for hand1
    	boolean fourOfAKind1 = false;
    	if(map1.values().contains(4)) {
    		fourOfAKind1 = true;
    	}
    	
    	//How to check four of a kind for hand2
    	boolean fourOfAKind2 = false;
    	if(map2.values().contains(4)) {
    		fourOfAKind2 = true;
    	}
    	
    	//How to check three of a kind for hand1
    	boolean threeOfAKind1 = false;
    	if(map1.values().contains(3)) {
    		threeOfAKind1 = true;
    	}
    	
    	//How to check three of a kind for hand2
    	boolean threeOfAKind2 = false;
    	if(map2.values().contains(3)) {
    		threeOfAKind2 = true;
    	}
    	
    	//How to check two of a kind for hand1
    	boolean twoPair1 = false;
    	if(map1.values().contains(2) && map1.values().contains(1) && map1.values().size()==3) {
    		twoPair1 = true;
    	}
    	
    	//How to check two of a kind for hand2
    	boolean twoPair2 = false;
    	if(map2.values().contains(2) && map2.values().contains(1) && map2.values().size()==3) {
    		twoPair2 = true;
    	}
    	
    	//How to check full house for hand1
    	boolean fullHouse1 = false;
    	if(map1.values().contains(2) && map1.values().contains(3)) {
    		fullHouse1 = true;
    	}
    	
    	//How to check full house for hand2
    	boolean fullHouse2 = false;
    	if(map2.values().contains(2) && map2.values().contains(3)) {
    		fullHouse2 = true;
    	}
    	
    	//How to check one pair for hand1
    	boolean onePair1 = false;
    	List<Integer> l1 = new ArrayList<>();
    	l1.add(1);
    	l1.add(1);
    	l1.add(1);
    	l1.add(2);
    	
    	List<Integer> l2 = new ArrayList<>();
    	for(Integer w :map1.values()) {
    		l2.add(w);
    	}
    	Collections.sort(l2);
    	if(l2.equals(l1)) {
    		onePair1 = true;
    	}
    	
    	//How to check one pair for hand2
    	boolean onePair2 = false;
    	List<Integer> l3 = new ArrayList<>();
    	for(Integer w :map2.values()) {
    		l3.add(w);
    	}
    	Collections.sort(l3);
    	if(l3.equals(l1)) {
    		onePair2 = true;
    	}
    	
    	if(straightFlush1) {
    		wins = true;
    	}else if(fourOfAKind1 && !straightFlush2) {
    		wins = true;
    	}else if(fullHouse1 && !straightFlush2 && !fourOfAKind2) {
    		wins = true;
    	}else if(flush1 && !fullHouse2 && !straightFlush2 && !fourOfAKind2) {
    		wins = true;
    	}else if(straight1 && !flush2 && !fullHouse2 && !straightFlush2 && !fourOfAKind2) {
    		wins = true;
    	}else if(threeOfAKind1 && !straight2 && !flush2 && !fullHouse2 && !straightFlush2 && !fourOfAKind2) {
    		wins = true;
    	}else if(twoPair1 && !threeOfAKind2 && !straight2 && !flush2 && !fullHouse2 && !straightFlush2 && !fourOfAKind2) {
    		wins = true;
    	}else if(onePair1 && !twoPair2 && !threeOfAKind2 && !straight2 && !flush2 && !fullHouse2 && !straightFlush2 && !fourOfAKind2) {
    		wins = true;
    	}
       return wins;
    }

    @Override
    public String toString() {
       return handAsString;
    }


 public static void testHand1IsGreaterThanHand2(String hand1AsString,String hand2AsString,Boolean expectedResult) {
	 
    InterviewQuestions35 hand1 = new InterviewQuestions35(hand1AsString);
    InterviewQuestions35 hand2 = new InterviewQuestions35(hand2AsString);
    
    System.out.println("Hand1[" + hand1 + "] > Hand2[" + hand2 + "] \t-- " +
                       "expected: " + expectedResult + ", actual: " + hand1.isGreaterThan(hand1, hand2));
 }

 public static void main(String[] args) {
    testHand1IsGreaterThanHand2(
       "8C,9C,10C,JC,QC", // straight flush
       "6S,7H,8D,9H,10D",
       true);

    testHand1IsGreaterThanHand2(
       "4H,4D,4C,4S,JS", //four of a kind
       "6C,6S,KH,AS,AD",
       true);

    testHand1IsGreaterThanHand2(
       "6C,6D,6H,9C,KD",
       "5C,3C,10C,KC,7C", // flush
       false);

    testHand1IsGreaterThanHand2(
       "4H,4D,4C,KC,KD", // full house
       "9D,6S,KH,AS,AD",
       true);

    testHand1IsGreaterThanHand2(
       "6C,6D,6H,9C,KD",
       "2C,3C,4S,5S,6S", // straight
       false);

    testHand1IsGreaterThanHand2(
       "7C,7D,7S,3H,4D", // three of a kind
       "9S,6S,10D,AS,AD",
       true);

    testHand1IsGreaterThanHand2(
       "2S,2D,JH,7S,AC",
       "8C,8H,10S,KH,KS", // two pair
       false);

    testHand1IsGreaterThanHand2(
       "AC,AH,3C,QH,10C", // one pair
       "3S,2D,KH,JS,AD",
       true);
 }
}
