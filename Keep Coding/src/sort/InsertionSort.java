package sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};
		
		System.out.println(Arrays.toString(sort2(numbers)));
	}
	
	/**
	 * Description: there will be  two subsets, the left one
	 * must be always sorted, and the right will be unsorted.
	 * The idea is to get one element from the right subset, and
	 * add it on the left subset (but keeping it sorted). When
	 * all elements have been moved from the right to the left,
	 * the array will be sorted
	 */
	
	public static int[] sort(int[] numbers){
		
		for(int i = 1; i < numbers.length; i++){
			int value = numbers[i];
			for(int j = i-1; j>=0; j--){
				if(value<numbers[j]){
					numbers[j+1] = numbers[j];
					numbers[j] = value;
				}
			}
		}
		return numbers;		
	}
	
	public static int[] sort2(int[] numbers){
		
		for(int i = 1; i < numbers.length; i++){
			int value = numbers[i];
			int hole = i;
			while(hole>0 && numbers[hole-1]>value){
				numbers[hole] = numbers[hole-1];
				hole--;
			}
			numbers[hole] = value;
		}
		return numbers;		
	}

}
