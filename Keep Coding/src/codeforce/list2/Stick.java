package codeforce.list2;

import java.util.Scanner;

public class Stick {
	
	public static void main(String[] args) {
		//Akshat first move
		//Malvika moves later		
		//1<=n,m<=100
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int smaller = n<m?n:m;
		if(smaller%2==0)
			System.out.println("Malvika");
		else
			System.out.println("Akshat");
	}

}
