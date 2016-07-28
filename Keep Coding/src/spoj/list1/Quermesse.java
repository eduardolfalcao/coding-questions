package spoj.list1;

import java.util.Scanner;

public class Quermesse {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int contador = 0, n, cur, i;
        while(true){
        	n = in.nextInt();
        	contador++;
        	
        	if(n==0)	
        		break;
        	else
        		System.out.println("Teste "+contador);
	        
        	for(i=1; i<=n ;i++){
        		cur = in.nextInt();
        		if(cur==i)
        			System.out.println(i+"\n");
        	}	        
        }
    }
}
