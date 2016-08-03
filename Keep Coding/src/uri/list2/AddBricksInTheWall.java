package uri.list2;

import java.util.Scanner;

public class AddBricksInTheWall {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int [][] bricks = new int[9][9]; 
		
		for(int i = 0; i < n; i++){
			for(int line = 0; line < 9; line+=2){
				for(int col = 0; col < line+1; col+=2)
					bricks[line][col] = in.nextInt();
			}
			
			fillFirstLine(bricks);
			fillRemainingLines(bricks);
			print(bricks);
						
		}
		
	}
	
	public static void fillFirstLine(int [][] bricks){
		for(int col = 7; col > 0; col-=2)
			bricks[8][col] = (bricks[6][col-1]-bricks[8][col+1]-bricks[8][col-1])/2;
	}
	
	public static void fillRemainingLines(int [][] bricks){
		for(int line = 7; line > 0; line--){
			for(int col = 0; col <= line; col++)
				bricks[line][col] = bricks[line+1][col] + bricks[line+1][col+1]; 
		}
	}
	
	public static void print(int [][] bricks){
		for(int line = 0; line < 9; line++){
			for(int col = 0; col <= line; col++)
				System.out.print(bricks[line][col]+(col!=line?" ":""));
			System.out.println();
		}
	}

}
