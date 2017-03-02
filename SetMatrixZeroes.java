/*
 * Given a m * n matrix, if an element is 0, set its entire row and column to 0.
Do it in place.
 */
public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		boolean firstRowZero = false;
		boolean firstColumnZero = false;
		
		//Set first row or column zero or not
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][0] == 0) {
					firstColumnZero = true;
					break;
				}
			}
		}
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[0][j] == 0) {
					firstRowZero = true;
					break;
				}
			}
		}
		
		//Use marks on 1st row and column
		for(int i=1; i<matrix.length;i++) {
			for(int j=1; j<matrix[0].length;j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		//use mark to set elements
		for(int i=1; i<matrix.length; i++) {
			for(int j=1; j<matrix[0].length;j++) {
				if(matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		
		//set first column and row
		if(firstColumnZero == true) {
			for(int i=0; i<matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}
		
		if(firstRowZero == true) {
			for(int i=0; i<matrix[0].length; i++) {
				matrix[0][i] = 0;
			}
		}
	}
	public void printMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 0, 2, 4},
				{2, 4, 2, 1},
				{0, 1, 3, 0},
				{3, 4, 8, 2}
		};
		SetMatrixZeroes smz = new SetMatrixZeroes();
		smz.printMatrix(matrix);
		smz.setZeroes(matrix);
		smz.printMatrix(matrix);
	}

}
