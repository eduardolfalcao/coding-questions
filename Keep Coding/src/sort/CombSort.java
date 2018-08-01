package sort;

import java.util.Arrays;

/**
 * Date: 31/07/2018
 * 
 * The Comb sort is an enhancement on BubbleSort.
 * One of the performance problems of BubbleSort is that elements
 * with lower values on the end of the list may need too much swaps
 * to get to its right place. The Comb sort deals with this issue
 * by employing a higher gap on the swap. On the BubbleSort this gap
 * is 1. On the CombSort this gap starts with the size of the list,
 * and as long as the algorithm runs it is reduced by some factor
 * (1.25, for instance).
 * 
 * With this optimization, the Comb sort may be considered as good
 * as algorithms such as quicksort.
 * 
 * Worst case: O(n^2), but very unlikely
 * Best case: O(n), also very unlikely
 * Average case: O(nlogn), due to the factor of changing the gap
 * 
 * 
 * @author eduardolfalcao
 *
 */

public class CombSort {
	
	public static void main(String[] args) {
		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};
		sort(numbers,1.25);
		System.out.println(Arrays.toString(numbers));
	}

	
	public static void sort(int[] numbers, double factor){
		int gap =  numbers.length-1;
		int scan = 0;
		while(gap > 0 && scan < numbers.length-1){
			for(int i = 0; i+gap < numbers.length; i++){
				if(numbers[i+gap]<numbers[i]){
					swap(numbers,i,i+gap);
				}
			}

			gap = (int) (gap / factor);
					
		}
	}
	
	public static void swap(int[] numbers, int i, int j){
		int temp = numbers[j];
		numbers[j] = numbers[i];
		numbers[i] = temp;
	}

}
