/*
 * Write an efficient algorithm that searches for a value in an 
 * m x n matrix. This matrix has properties:

1) Integers in each row are sorted from left to right. 2) The first 
integer of each row is greater than the last integer of the previous 
row.

For example, consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.
 */
public class Search2DI {
	public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) 
            return false;
 
        int m = matrix.length;
        int n = matrix[0].length;
 
        int start = 0;
        int end = m*n-1;
 
        while(start<=end){
            int mid=(start+end)/2;
            int midX=mid/n;
            int midY=mid%n;
 
            if(matrix[midX][midY]==target) 
                return true;
 
            if(matrix[midX][midY]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
 
        return false;
    }
	
	public static void main(String[] args) {
		int[][] matrix = {
				{0, 1, 2, 4},
				{5, 7, 10, 15},
				{17, 19, 30, 40},
				{43, 44, 58, 62}
		};
		int target = 44;
		Search2DI s1 = new Search2DI();
		System.out.println(s1.searchMatrix(matrix, target));
		System.out.println(s1.searchMatrix(matrix, 78));
	}

}
