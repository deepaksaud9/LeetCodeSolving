package org.practiseDSA.DSA.linearSearch;

public class MaximumIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}

        };
        int result = max(arr);
        System.out.println(result);
    }

    static int max(int[][] arr){

        int maximum = 0;
        for (int row = 0; row < arr.length; row++){

            for (int col = 0; col < arr[row].length; col++){

                if (arr[row][col] > maximum){
                    maximum = arr[row][col];
                }

            }
        }
        return maximum;
    }

}

