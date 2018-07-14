package sort.practice;

import java.util.Arrays;

/**
 * Date: 13/07/2018
 * @author eduardolfalcao
 *
 * worst case: O(n^2), (n-1) + (n-2) + ... + (n-(n-1)) - (n-n) = n^2 - Arithmetic Progression = n^2 - (n*(1+n))/2
 * = n^2 - (n+n^2)/2 = n^2 - n/2 - (n^2)/2 = (2n^2 - n^2 -n)/2 = (n^2 - n)/2 = n(n-1)/2
 * 
 * best case: O(n), no swap takes place
 * best case: ômega(n), lower bound value, the time will not be lower than n
 * average case: O(n^2)
 * 
 * space complexity: O(n) for the list and O(1) auxiliary
 * stable
 * 
 * Most of the other sorting algorithms has a substantially better worst case 
 * performance of O(nlogn). However, BubbleSort is good at detecting that the
 * list is already sorted, running in O(n), while other have to perform the 
 * whole complex O(nlogn) computation to verify it. In contrast, BubbleSort
 * average case is O(n^2).
 * It should be avoided in collections with high number of elements.
 */

public class BubblesortPractice1 {
	
	
	
	public static void main(String[] args) {
		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};		
		System.out.println(Arrays.toString(sort(numbers)));
	}

	
	public static int[] sort(int[] numbers){		
		for(int scan = 0; scan < numbers.length-1;scan++){//last element is already sorted
			boolean swap = false;
			for(int i = 0; i < numbers.length-1-scan; i++){//last element is not needed, scan is the number of sorted elements
				if(numbers[i]>numbers[i+1]){
					int temp = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = temp;
					swap = true;
				}
			}
			if(!swap){	//no swap means the array is sorted
				break;
			}
		}
		return numbers;		
	}

}
