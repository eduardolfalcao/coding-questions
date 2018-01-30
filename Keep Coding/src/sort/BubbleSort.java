package sort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};
		
		System.out.println(Arrays.toString(sort(numbers)));
	}
	
	/**
	 * Description: from left to right, we have to compare two values
	 * and swap them if the left value is higher than the right value.
	 * This keeps two subsets in the array, the left is the (probably) 
	 * unsorted set, and the right is the sorted set. 
	 */
	
	public static int[] sort(int[] numbers){
		
		for(int i = 0; i < numbers.length-1; i++){
			boolean swap = false;
			for(int j = 0; j < numbers.length-1; j++){				
				if(numbers[j]>numbers[j+1]){
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					swap = true;
				}
			}
			
			if(!swap)
				break;
		}
		
		return numbers;		
	}

}
