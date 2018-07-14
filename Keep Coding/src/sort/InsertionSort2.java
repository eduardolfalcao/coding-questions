package sort;

import java.util.Arrays;

/**
 * Date: 13/07/2018
 * @author eduardolfalcao
 * 
 * Similar to sorting a deck of cards.
 * Begin with all cards on the right hand.
 * Choose one card from the right hand and place it on the
 * correct position (ordered) on the left hand.
 * 
 * Worst case: 1 + 2 + 3 + ... + n = n(1+n)/2 = n^2/2 = O(n^2)
 * Best case: O(n), runs only the for-loop
 * 
 * stable
 * 
 * In place: space is O(n) for the list and O(1) for auxiliary variables
 * 
 * Efficient for lists with few elements.
 * Simple implementation.
 *
 */
public class InsertionSort2 {
	
	public static void main(String[] args) {
		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	
	public static void sort(int[] numbers){
		
		for(int rightHand = 1; rightHand < numbers.length; rightHand++){
			int value = numbers[rightHand];
			int correctPosition = rightHand-1;
			while(correctPosition>=0 && value<numbers[correctPosition]){
				numbers[correctPosition+1] = numbers[correctPosition];
				correctPosition--;
			}
			numbers[correctPosition+1] = value;
		}
		
	}

}
