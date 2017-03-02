

public class InplaceRotation {

	public void rotate(int[][] matrix, int n){
		for(int i=0; i<n/2; i++){
			for(int j=0; j<n/2; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matrix = { 
				{1, 2, 3, 4},
				{4, 5, 6, 7}, 
				{7, 8, 9, 0},
				{1, 5, 3, 4}};
		int n = matrix.length;
		InplaceRotation ir = new InplaceRotation();
		ir.rotate(matrix, n);
	}
}
		
		
	


