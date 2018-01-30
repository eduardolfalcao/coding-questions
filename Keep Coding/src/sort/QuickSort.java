package sort;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};
		quicksort(numbers,0,numbers.length-1);
		
		System.out.println(Arrays.toString(numbers));
	}
	
	/**
	 * Description: you have to choose a pivot, and then
	 * place all the elements lower than the pivot on its
	 * left, and all the elements higher than the pivot
	 * on its right. Recursively, you should keep doing
	 * that till the subarray has length 1.
	 */
	
	public static void quicksort(int[]numbers, int start, int end){
		if(start<end){
			int pivot = partition(numbers,start,end);
			quicksort(numbers, start, pivot-1);
			quicksort(numbers, pivot+1, end);
		}		
	}
	
	
	public static int partition(int[]numbers,int start,int end){
		
		int pivot = numbers[end];
		int pIndex = start;
		
		for(int i = start; i < end; i++){
			if(numbers[i]<=pivot){
				//swap with the previous element
				int temp = numbers[i];
				numbers[i] = numbers[pIndex];
				numbers[pIndex] = temp;
				pIndex++;
			}
		}
		
		//swap the last element
		numbers[end] = numbers[pIndex];
		numbers[pIndex] = pivot;
		
		return pIndex;
	}

}
