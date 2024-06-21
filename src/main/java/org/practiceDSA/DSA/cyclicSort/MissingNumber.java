package org.practiceDSA.DSA.cyclicSort;

import java.util.Arrays;

public class MissingNumber {


    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        System.out.println("before sort:"+ Arrays.toString(arr));
    int missing = missingNumber(arr);
        System.out.println("After sort:"+Arrays.toString(arr));
        System.out.println("Missing number :"+missing);

    }

    static int missingNumber(int[] arr){                         //arr = {4,0,2,1}
        int i = 0;

        while (i < arr.length){                         //4
            int correct = arr[i];                       //
            if (arr[i] < arr.length && arr[i] != arr[correct]){                //
                swap(arr, i, correct);
            }else {
                i++;
            }
        }

        //search for missing number
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
