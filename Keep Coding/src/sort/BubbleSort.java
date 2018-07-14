package sort;

import java.util.Arrays;

/**
 * Date: 11/07/2018
 * 
 * The idea of Bubble sort is scanning the array several times
 * and on each scan the algorithm shifts the higher element value
 * to the end (right side) of the array.
 * 
 * On the worst case: O(n^2)
 * 	scan the array n times, and in each scan shift the lower element
 * 	to the end (right side) of the array; this will lead to 
 * 	n-1, n-2, ... 1 swaps, which is (n*(n+1))/2??
 * On the best case: O(n)
 * 	scan the array once, and when noticing that no swap took place, stops
 * 
 * @author eduardolfalcao
 *
 */

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};		
		System.out.println(Arrays.toString(sort(numbers)));
	}

	
	public static int[] sort(int[] numbers){		
		//we just need to scan the length of array-1 times
		//because the element with lower value will naturally
		//go to the first position 
		for(int scan = 0; scan < numbers.length-1; scan++){
			//numbers.length-1 because the last element is compared to the previous one
			//numbers.length-1-scan because the value of scan represents the amount of elements
			//that were already shifted to the right (and these values are already on the
			//correct place
			boolean swap = false;
			for(int i = 0; i < numbers.length-1; i++){
				if(numbers[i] > numbers[i+1]){
					int temp = numbers[i+1];
					numbers[i+1] = numbers[i];
					numbers[i] = temp;
					swap = true;
				}
			}
			//if no swap happened than the array is already sorted!
			if(!swap)
				break;
		}		
		return numbers;		
	}
	
}
