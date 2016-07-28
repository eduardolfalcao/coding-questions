package uri.list1;

import java.util.Scanner;

public class DivisionOfNlogonia {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
        	int n = in.nextInt();
        	
        	if(n==0)	
        		break;
	        
	        int xDiv = in.nextInt();
	        int yDiv  = in.nextInt(); 	//divisa
	        
	        int x, y;
	        while(n>0){
	        	x = in.nextInt();
	        	y = in.nextInt();
	        	if(x == xDiv || y == yDiv)
	        		System.out.println("divisa");
	        	else if(x > xDiv && y > yDiv)
	        		System.out.println("NE");
	        	else if(x > xDiv && y < yDiv)
	        		System.out.println("SE");
	        	else if(x < xDiv && y > yDiv)
	        		System.out.println("NO");
	        	else if(x < xDiv && y < yDiv)
	        		System.out.println("SO");
	        	n--;
	        }		
        }
    }

}
