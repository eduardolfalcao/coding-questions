package uri.list2;

import java.util.Scanner;

public class Sudoku {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[][] sudoku = new int[9][9];

		for (int i = 0; i < n; i++) {
			for (int linha = 0; linha < 9; linha++) {
				for (int coluna = 0; coluna < 9; coluna++)
					sudoku[linha][coluna] = in.nextInt();
			}
			System.out.println("Instancia "+(i+1)+"\n"+(checkSudoku(sudoku)&&checkSquare(sudoku)?"SIM\n":"NAO\n"));
		}
	}
	
	static boolean checkSudoku(int[][] sudoku){
		
		boolean [] columns, lines;
		int countCols, countLines;
		
		for (int coluna = 0; coluna < 9; coluna++){
			countLines = countCols = 0;
			columns = new boolean []{false, false, false, false, false, false, false, false, false};
			lines = new boolean []{false, false, false, false, false, false, false, false, false};
			for (int linha = 0; linha < 9; linha++) {
				if(!columns[sudoku[linha][coluna]-1]){
					columns[sudoku[linha][coluna]-1] = true;
					countCols++;
				}
				if(!lines[sudoku[coluna][linha]-1]){
					lines[sudoku[coluna][linha]-1] = true;
					countLines++;
				}
			}
			if(countCols!=9 || countLines!=9 )
				return false;
		}
		
		return true;
		
	}
	
	static boolean checkSquare(int[][] sudoku){
		boolean [] squares;
		int countSquares;
		
		for (int linha = 1; linha < 9; linha+=3){			
			for (int coluna = 1; coluna < 9; coluna+=3){
				countSquares = 0;
				squares = new boolean []{false, false, false, false, false, false, false, false, false};
				for(int i = linha - 1; i <=linha+1; i++){
					for(int j = coluna - 1; j <=coluna+1; j++){
						if(!squares[sudoku[i][j]-1]){
							squares[sudoku[i][j]-1] = true;
							countSquares++;
						}
					}					
				}
				if(countSquares!=9)
					return false;
			}			
		}
		
		return true;
	}
}
