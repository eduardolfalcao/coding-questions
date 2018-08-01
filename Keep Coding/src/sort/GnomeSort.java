package sort;

import java.util.Arrays;

/**
 * Date: 31/07/2018
 * @author eduardolfalcao
 * 
 * Story: here is how a garden gnome sorts a line of flower pots. 
 * Basically, he looks at the flower pot next to him and the previous one; 
 * if they are in the right order he steps one pot forward, otherwise he swaps 
 * them and steps one pot backwards. Boundary conditions: if there is no 
 * previous pot, he steps forwards; if there is no pot next to him, he is done.
 * 
 * Similar to insertion sort. Then you must keep two sets of elements:
 * the set from the left is sorted, and the set from the right unsorted.
 * The only difference is that when you put the chosen element from the right
 * set into the left set you must do it by swapping, like it is done in 
 * bubblesort. 
 * 
 * The simplest sort algorithm ever!!
 * 
 * Best case: O(n)
 * Average case: O(n^2)
 * Worst case: O(n^2)
 */

public class GnomeSort {
	
	public static void main(String[] args) {
		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	
	public static void sort(int[] numbers){
		int pos = 1;
		while(pos < numbers.length){
			if(pos>0 && numbers[pos]<numbers[pos-1]){
				swap(numbers,pos-1,pos);
				pos--;
			} else {
				pos++;
			}
		}
	}
	
	public static void swap(int[] numbers, int i, int j){
		int temp = numbers[j];
		numbers[j] = numbers[i];
		numbers[i] = temp;
	}
}
