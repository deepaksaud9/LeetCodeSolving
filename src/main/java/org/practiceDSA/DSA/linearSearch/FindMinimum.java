package org.practiceDSA.DSA.linearSearch;

public class FindMinimum {
     public static void main(String[] args) {
        int[] arr = {112, 76, 69, 17, 54, -2};

        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++){

            if (arr[i] <= minimum){
                minimum = arr[i];
            }

        }
        return minimum;
    }
}
