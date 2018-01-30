package sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};
		mergeSort(numbers);
		
		System.out.println(Arrays.toString(numbers));
	}
	
	/**
	 * Description: it is based on divide and conquer approach.
	 * First, the array is divided into n sub-arrays, and then
	 * the sub-arrays are merged in a sorted fashion. This requi-
	 * res two functions: the merge (merges two arrays), and the
	 * mergesort (divides all the way up to n sub arrays, and then
	 * merge them).
	 */
	
	public static void mergeSort(int[]numbers){
		
		if(numbers.length<2){
			return;
		}

		int mid = numbers.length/2;

		//divide it into 2 arrays of same/similar size
		int[] left = new int[mid];
		int[] right = new int[numbers.length-mid];
			
		for(int i = 0; i < left.length; i++){
			left[i]=numbers[i];
		}
		for(int i = mid; i < numbers.length; i++){
			right[i-mid]=numbers[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left,right,numbers);	
	}
	
	
	public static void merge(int[]a, int[]b,int[]mainArray){
		int mainIndex = 0, aIndex = 0, bIndex = 0;
		while(aIndex < a.length && bIndex<b.length){
			if(a[aIndex]<=b[bIndex]){
				mainArray[mainIndex] = a[aIndex];
				aIndex++;
			}else{
				mainArray[mainIndex] = b[bIndex];
				bIndex++;
			}
			mainIndex++;
		}
		
		//it might have leftovers from a or b array
		while(aIndex < a.length){		
			mainArray[mainIndex] = a[aIndex];
			aIndex++;
			mainIndex++;
		}
		while(bIndex < b.length){
			mainArray[mainIndex] = b[bIndex];
			bIndex++;
			mainIndex++;
		}
	}
	
}
