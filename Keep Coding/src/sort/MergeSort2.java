package sort;

import java.util.Arrays;

/**
 * Date: 02/08/2018
 * 
 * It is based on a divide and conquer strategy.
 * Divides the problem in sub-problems, and tries 
 * to solve smaller/easier problems.
 * 
 * Stage I: divide
 * - if the array has more than one elements, divide it
 * 
 * Stage II: conquer
 * - sort each subsequence recursively
 * 
 * Stage III: combine
 * - combine the two subsequences in a single sequence
 * which is sorted
 *  
 * Divide and conquer, recursive, stable, out-of-place
 * (left and right sub-arrays to merge, Theta(n)).
 * Time complexity: O(nlogn)
 * 
 * T(n) = 2T(n/2) + c'n
 *       = 2(2T(n/4) + c'(n/2)) + c'(n) = 4T(n/4) + c''n
 *       = 8T(n/8) + c'(n/4) + c''n = 8T(n/8) + c'''n  
 *       = 2^k*T(n/2^k) + k*c'*n
 *       = 2^(2logn base2) * T(n/ 2^(2logn base2)) + lognbase2*c'*n
 *       = n + T(1) + n*c'*logn
 * Theta(nlogn)
 * 
 * According to Java 7 API docs cited in this answer, Arrays#Sort() 
 * for object arrays now uses TimSort, which is a hybrid of MergeSort
 * and InsertionSort. On the other hand, Arrays#sort() for primitive
 * arrays now uses Dual-Pivot QuickSort
 *   
 * @author eduardolfalcao
 *
 */

public class MergeSort2 {
	
	public static void main(String[] args) {
		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void sort(int[] numbers){
		if(numbers.length==1)
			return;
			
		int mid = numbers.length/2;
		int[] left = new int[mid];
		for(int i = 0; i<mid; i++)
			left[i] = numbers[i];
		
		int[] right = new int[numbers.length-mid];
		for(int i = 0; i<right.length; i++)
			right[i] = numbers[i+mid];
		
		sort(left);
		sort(right);
		merge(numbers, left, right);
	}
	
	public static void merge(int [] numbers, int[] left, int[] right){
		
		int l = 0;
		int r = 0;
		int n = 0;
		while(l < left.length && r < right.length){
			if(left[l] <= right[r]){
				numbers[n] = left[l];
				l++;
			} else{
				numbers[n] = right[r];
				r++;
			}
			n++;
		}
		
		//may be lacking the rest of left or right
		while(l < left.length){
			numbers[n] = left[l];
			l++;
			n++;
		}
		
		while( r < right.length){
			numbers[n] = right[r];
			r++;
			n++;
		}
		
	}
	

}
