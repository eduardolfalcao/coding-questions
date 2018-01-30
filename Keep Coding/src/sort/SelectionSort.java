package sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};
		
		System.out.println(Arrays.toString(sort(numbers)));
	}
	
	/**
	 * Description: selects the smaller value, and replace with the first value.
	 * Only n-2 iterations is needed.
	 */
	
	public static int[] sort(int[] numbers){
		
		for(int i = 0; i < numbers.length-1; i++){	//i will tell where is sorted
			int indexMin = i;
			for(int j = i+1; j < numbers.length; j++){
				if(numbers[j] < numbers[indexMin]){
					indexMin = j;
				}				
			}
			int temp = numbers[i];
			numbers[i] = numbers[indexMin];
			numbers[indexMin] = temp;
		}
		
		return numbers;
	}

}
