/*Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example, given the following matrix:

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
You should return [1,2,3,6,9,8,7,4,5].
*/
import java.util.*;
public class SpiralMatrixI {
	public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
 
        if(matrix == null || matrix.length == 0) return result;
 
        int m = matrix.length;
        int n = matrix[0].length;
 
        int x=0; 
        int y=0;
 
        while(m>0 && n>0){
 
            //if one row/column left, no circle can be formed
            if(m==1){
                for(int i=0; i<n; i++){
                    result.add(matrix[x][y++]);
                }
                break;
            }else if(n==1){
                for(int i=0; i<m; i++){
                    result.add(matrix[x++][y]);
                }
                break;
            }
 
            //below, process a circle
 
            //top - move right
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y++]);
            }
 
            //right - move down
            for(int i=0;i<m-1;i++){
                result.add(matrix[x++][y]);
            }
 
            //bottom - move left
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y--]);
            }
 
            //left - move up
            for(int i=0;i<m-1;i++){
                result.add(matrix[x--][y]);
            }
 
            x++;
            y++;
            m=m-2;
            n=n-2;
        }
        return result;
	}
	
	public static void main(String[] args) {
		SpiralMatrixI sp1 = new SpiralMatrixI();
		int[][] matrix = {
				{1, 0, 2, 4},
				{2, 4, 2, 1},
				{0, 1, 3, 0},
				{3, 4, 8, 2}
		};
		ArrayList<Integer> result = sp1.spiralOrder(matrix);
		for(int i : result) {
			System.out.print(i+" ");
		}
	}

}