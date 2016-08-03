package codeforce.list2;

import java.util.Scanner;

public class Elephant {
	
	public static void main(String[] args) {
		//elephant is in x=0
		//In one step the elephant can move 1, 2, 3, 4 or 5
		int [] stepArray = new int[] {5,4,3,2,1};
		Scanner in = new Scanner(System.in);
		int dist = in.nextInt();
		
		int steps = 0;
		for(int i = 0; i < stepArray.length || dist > 0; i++){
			steps += dist/stepArray[i];
			dist = dist%stepArray[i];			
		}
		
		System.out.println(steps);
	}

}
