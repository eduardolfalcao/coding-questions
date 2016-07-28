package codeforce.list2;

import java.util.Scanner;

public class Stripe {
	
	public static void main(String[] args) {
		
		
//		input
//		9
//		1 5 -6 7 9 -16 0 -2 2
//		output
//		3
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ar[] = new int[n];
		int side1 = 0, side2 = 0;
		for(int i = 0; i < n; i++){
			ar[i] = in.nextInt();
			side2 += ar[i];
		}
		side1 = ar[0];
		side2 -= ar[0];
		
				
		int counter = 0;		
		for(int split = 1; split <= n-1; split++){
			if(side1==side2)
				counter++;
			side1 += ar[split];
			side2 -= ar[split];
		}
		
		System.out.println(counter);	
		
	}

}
