package spoj.list1;

import java.util.Arrays;
import java.util.Scanner;

public class Janela {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a[] = {in.nextInt(), in.nextInt(), in.nextInt()};
		Arrays.sort(a);
		int finais[] = {a[0]+200, a[1]+200, a[2]+200};
		
		
		int buraco = 0;
		
		buraco += a[0];
		buraco += Math.max(0, a[1]-finais[0]);
		buraco += Math.max(0, a[2]-finais[1]);
		buraco += Math.max(0, 600-finais[2]);
		
		buraco *= 100;
		
		System.out.println(buraco);
		
	}
}
