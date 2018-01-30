package sort;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
//		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};
		int[] numbers = new int[]{8,8,3,6,2};
		
		System.out.println(Arrays.toString(sort(numbers)));
	}
	
	/**
	 * Description: first discover the highest and lowest values
	 * of the array. Then, create a new array, the sumcount array
	 * with highest - lowest value size, and count the ocurrences
	 * of each entry on the original size, incrementing in O(1) 
	 * fashion the sumcount array. In this process, the values 
	 * for the 0 occurrences must be 0. Later, scan the sumcount array,
	 * from left to right, and sum cummulatively and store on the
	 * same array. Finally, create a new array, and scan the original
	 * array, using the value on sumcount array to discover its 
	 * position.  
	 */
	
	public static int[] sort(int[] numbers){
		
		int lowest = Integer.MAX_VALUE, highest = Integer.MIN_VALUE;
		for(int n : numbers){
			if(n<lowest){
				lowest = n;
			}
			if(n>highest){
				highest = n;
			}			
		}
		
		int [] sumcount = new int[highest-lowest+1];
		for(int n : numbers){
			sumcount[n-lowest]++;	//the remaining are 0
		}
		
		for(int i = 1; i < sumcount.length;i++){
			sumcount[i] += sumcount[i-1]; //cumulating
		}
		
		int[] sortedNumbers = new int [numbers.length];
		for(int i = 0; i < numbers.length; i++){
			int cumulativeCount = sumcount[numbers[i]-lowest];
			sortedNumbers[cumulativeCount-1] = numbers[i];
			sumcount[numbers[i]-lowest]--;
		}
		
		return sortedNumbers;
	}
	
}
