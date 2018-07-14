package sort;

import java.util.Arrays;

/**
 * Date: 13/07/2018
 * @author eduardolfalcao
 * 
 * Find the lower element on the list, swap it with the first element,
 * do the process again starting from the subsequent element.
 * 
 * 
 * Worst case: (n-1)+(n-2)+...+(n-(n-1) = n^2 - Arithmethic Progression
 * = n^2 - ((n*(1+n))/2) = n^2 - (n + n^2)/2 = n^2 - n/2 - (n^2)/2
 * = (2(n^2) - n^2 - n)/2 = (n^2 - n)/2 = n(n-1)/2
 * ==> The same of BubbleSort. 
 *   
 * Best case: O(n^2)
 * average case: O(n^2)
 * 
 * space complexity: O(n) for the list and O(1) auxiliary
 * stable
 *
 */
public class SelectionSort2 {
	
	public static void main(String[] args) {
		int[] numbers = new int[]{8,3,6,2,34,5,65,7,9,7,54,6,9};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	
	public static void sort(int[] numbers){		
		for(int begining = 0; begining < numbers.length-1; begining++){	//last element will have already be sorted
			int indexLowest = begining;
			for(int i = begining+1; i < numbers.length; i++){
				if(numbers[i]<numbers[indexLowest]){
					indexLowest = i;
				}
			}
			if(indexLowest!=begining){
				int temp = numbers[begining];
				numbers[begining] = numbers[indexLowest];
				numbers[indexLowest] = temp;
			}
		}		
	}

}
