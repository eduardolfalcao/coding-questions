package uri.list3;

import java.util.Arrays;
import java.util.Scanner;

public class PrantAndTheIndecision {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int favLettersSize = in.nextInt();
		int dogLettersSize = in.nextInt();
		
		int switches = in.nextInt();
		
		char [] favLetters = in.next().toCharArray();
		char [] dogLetters = in.next().toCharArray();
		
		char [] bestName = null;
		
		int currentFavLetters = 0;
		for(int i = 0; i < favLetters.length; i++){
			for(int j = 0; j < dogLetters.length; j++){
				if(dogLetters[j]==favLetters[i])
					currentFavLetters++;				
			}
		}
		
		char old = ' ', newOne = ' ';
		int counter = 0;
		for(int i = 0; i < switches; i++){
			old = in.next().charAt(0);
			newOne = in.next().charAt(0);
			counter = 0;
			for(int j = 0; j < dogLetters.length; j++){
				if(dogLetters[j]==old){
					dogLetters[j] = newOne;
					counter++;
					//need to account the fav letters
				}
			}
			if(counter>currentFavLetters){
				currentFavLetters = counter;
				bestName = Arrays.copyOf(dogLetters, dogLetters.length);
			}
		}
		
		System.out.println(currentFavLetters+"\n"+String.valueOf(bestName));
	}
	

}
