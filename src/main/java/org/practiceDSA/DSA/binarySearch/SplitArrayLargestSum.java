package org.practiceDSA.DSA.binarySearch;

/*
Given an array "nums" which consist of non-negative integers and an integers and an integer "m",
 you can split the array into "m" non-empty continuous array.
 write a algorithm to minimize the largest sum among these "m" subarrays.

 Example 1:
 Input : nums = [7,2,5,10,8], m = 2;
 output = 18;

 Explanation: there are four ways to split nums into two subarrays.
 the best way is to split it into [7,2,5] and [8,10].
 where the largest sum among the two sub array is only 18.
* */

public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] arr = {5,2,7,10,8};
        int m = 2;
        System.out.println(splitArray(arr, m ));
    }

    static int splitArray(int[] arr, int m){
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++){
            start = Math.max(start,arr[i]);  //in the end of the loop this will contain the max item from the array
            end = end + arr[i];
        }
        //binary search
        while (start < end){
            //try middle is my potential answer
            int mid = start + (end - start) / 2;

            //calculate how many pieces(sub array) we can divide this with max sum.
            int sum = 0;
            int pieces = 1;
            for (int num : arr){
                if (sum + num > mid){
                    //we cannot add more element in this sub array and make new array
                    //if we add this num in new sub array, then sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum = sum + num;
                }
            }
            if (pieces > m){
                start = mid + 1;
            }else {
                end = mid;
            }

        }
        return end;    //either return start or end because both are equal start == end;
    }
}
