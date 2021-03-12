package javainterviewcodequestions;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class InterviewQuestions26 {

	public static void main(String[] args) {
		
		Integer arr[] = {1, 2, 3, 4, 5};
		
		List<Integer> arrList = Arrays.asList(arr);
		
		Random rand = new Random();
		
		int randIdx1 = rand.nextInt(5);
		int randIdx2 = rand.nextInt(5);
		
		if(randIdx1==randIdx2) {
			randIdx2 = rand.nextInt(5);
		}

		System.out.println(arrList);
		
		int temp = arrList.get(randIdx1);
		arrList.set(randIdx1, arrList.get(randIdx2));
		arrList.set(randIdx2, temp);
		
		System.out.println(arrList);
		
		if(Math.abs(arrList.indexOf(arrList.get(randIdx1)) - arrList.indexOf(arrList.get(randIdx2)))==1){
			System.out.println("You can bribe");
		}else {
			System.out.println("You cannot bribe");
		}



	}

}
