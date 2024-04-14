package org.practiseDSA.ArrayExample;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;

        System.out.println(arr[3]);

        for (int i = 0 ; i < arr.length ; i++){
            System.out.println("enter array element");
            arr[i] = in.nextInt();
        }
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

        for (int num : arr){
            System.out.println(num);
        }

            System.out.println(Arrays.toString(arr));



    }
}
