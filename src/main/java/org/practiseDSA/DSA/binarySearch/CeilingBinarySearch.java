package org.practiseDSA.DSA.binarySearch;

public class CeilingBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int target = 10;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target){
        if (target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];


        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target > arr[mid]){
                    start = mid + 1;
                }else
                    end = mid - 1;
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else
                    start = mid + 1;
            }
        }
        return start ;
    }
}
