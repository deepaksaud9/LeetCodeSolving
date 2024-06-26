package org.practiceDSA.DSA.binarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(search(arr,6)));
    }

    //search in the row provided between columns provided
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while (colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;

            if (matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if (matrix[row][mid] < target){
                colStart = mid + 1;
            }else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 1){
            return binarySearch(matrix, 0, 0, col-1, target);
        }
        int rowStart = 0;
        int rowEnd = row - 1;
        int colMid = col / 2;

        //run the loop till 2 rows are remaining
        while (rowStart < (rowEnd - 1)){
            int mid = rowStart + (rowEnd - rowStart)/2;

            if (matrix[mid][colMid] == target){
                return new int[]{mid,colMid};
            }
            if (matrix[mid][colMid] < target){
                rowStart = mid;
            }else {
                rowEnd = mid;
            }
        }

        //now we have two rows
        //check whether target in col of two rows
        if (matrix[rowStart][colMid] == target){
            return new int[]{rowStart, colMid};
        }
        if (matrix[rowStart + 1][colMid] == target){
            return new int[]{rowStart + 1, colMid};
        }

        //search on 1st half
        if (target <= matrix[rowStart][colMid - 1]){
            return binarySearch(matrix, rowStart, 0, colMid - 1, target );
        }
        //search on 2nd half
        if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][col - 1]){
            return binarySearch(matrix, rowStart, colMid + 1, col - 1, target );
        }
        //search on 3rd half
        if (target <= matrix[rowStart + 1][colMid - 1]){
            return binarySearch(matrix, rowStart + 1, 0, colMid - 1, target );
        }
        //search on 4th half
        else{
            return binarySearch(matrix, rowStart + 1, colMid + 1, col - 1, target );

        }
    }
}

