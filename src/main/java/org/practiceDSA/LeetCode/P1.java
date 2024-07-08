package org.practiceDSA.LeetCode;

import java.util.Arrays;


public class P1 {
    public static void main(String[] args) {
        int[] arr = {1,2,15,3,4,5,3};

        System.out.println(find(arr));

    }
    static int find(int[] arr){

        int[] mis = new int[arr.length];
        int maxSum = 0;
        for (int i=0;i<arr.length;i++){
            mis[i] = arr[i];
        }

        for (int i = 1; i < arr.length; i++){
            for (int j = 0; j < i ; j++){
                if (arr[i]>arr[j] && mis[i] < mis[j] +arr[i]){
                    mis[i] = mis[j] + arr[i];
                }
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (maxSum < mis[i]){
                maxSum = mis[i];
            }
        }

        return maxSum;
    }
}
