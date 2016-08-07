package uri.list3;

import java.util.Scanner;

public class InsideOut {

	
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		String line = in.nextLine();
		for(int i = 0; i < n; i++){
			line = in.nextLine();
			if(line.length()<=2)
				System.out.println(line);
			else
				insideOut(line);
		}	
		
	}
	
	public static void insideOut(String line){		
		char temp = ' ';
		char[] c = line.toCharArray();
		if(c.length == 3){
			temp = c[1];
			c[1] = c[2];
			c[2] = temp;
		}
		else{
			for(int i = 0; i < c.length/4; i++){
				temp = c[i];
				c[i] = c[(c.length/2)-1-i];
				c[(c.length/2)-1-i] = temp;
				
				temp = c[i+(c.length/2)];
				c[i+(c.length/2)] = c[c.length-1-i];
				c[c.length-1-i] = temp;
			}
		}
		
		for(int i = 0; i < c.length; i++)
			System.out.print(c[i]);
		System.out.println();
	}
}
