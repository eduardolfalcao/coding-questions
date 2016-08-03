package uri.list2;

import java.util.Scanner;

public class LaserScuplture {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int height, length;
		
		while(true){
			
			height = in.nextInt();
			length = in.nextInt();
			if(height==0 && length==0)
				break;
			
			int count = 0, current = in.nextShort(), last = 0;
			count += (height-current);
			for(int i = 1; i < length; i++){
				last = current;
				current = in.nextShort();
				if(last>current)
					count += (last-current);
			}
			 System.out.println(count);			
		}		
	}

}
