/*Given an integer n, generate a square matrix filled with elements 
 * from 1 to n^2 in spiral order. For example, given n = 4,

[
[1,   2,  3, 4], 
[12, 13, 14, 5], 
[11, 16, 15, 6], 
[10,  9,  8, 7]
]
		*/
public class SpiralMatrixII {
	public int[][] generateMatrix(int n) {
	    int[][] result = new int[n][n];
	 
	    int k=1; 
	    int top=0;
	    int bottom=n-1;
	    int left=0;
	    int right=n-1;
	 
	    while(k<=n*n){
	        for(int i=left; i<=right; i++){
	            result[top][i]=k;
	            k++;
	        }    
	        top++;
	 
	        for(int i=top; i<=bottom; i++){
	            result[i][right]=k;
	            k++;
	        }
	        right--;
	 
	        for(int i=right; i>=left; i--){
	            result[bottom][i]=k;
	            k++;
	        }
	        bottom--;
	 
	        for(int i=bottom; i>=top; i--){
	            result[i][left] = k;
	            k++;
	        }
	        left++;
	    }
	 
	    return result;
	}
	
	public static void main(String[] args) {
		SpiralMatrixII sp2 = new SpiralMatrixII();
		int[][] matrix= sp2.generateMatrix(4);
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
