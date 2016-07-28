package codeforce.list2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BallsGame {
	
	static int count = 0;
	
	public static void main(String[] args) {
		
		
//		1 1 2 2 1 1
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int nColors = in.nextInt();
		int colorBomb = in.nextInt();
		
		List<Integer> l = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++)
			l.add(in.nextInt());
		
		if(n==1)
			System.out.println(0);
		
		int ref = -1;
		int count = 0;
		for(int i = 0; i < l.size(); i++){
			if(ref!=l.get(i)){
				ref = l.get(i);
				count = 1;				
			}			
			else{
				count++;
				if(ref==colorBomb){
					l.add(i+1);
					explode(l);
				}					
			}
		}
		
		System.out.println(count);
		
		
	}
	
	static void explode(List<Integer> l){
		boolean exploded = false;
		int ref = -1;
		int count = 0;
		
		int last = -1, end = -1;
		
		for(int i = 0; i < l.size(); i++){
			if(ref!=l.get(i)){
				ref = l.get(i);
				count = 1;				
			}
			else{
				count++;
				if(count)
			}
		}
	}
	
	
	
	

}