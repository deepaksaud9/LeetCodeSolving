package org.practiseDSA.ArrayExample;

import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][2];


        for (int row = 0; row < arr.length ; row++){

            for (int col = 0; col < arr[row].length; col++){
                System.out.println("enter array element");
                arr[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < arr.length ; row++){

            for (int col = 0; col < arr[row].length; col++){

                System.out.print(arr[row][col]+ " ");
            }
            System.out.print("\n");
        }
    }
}
