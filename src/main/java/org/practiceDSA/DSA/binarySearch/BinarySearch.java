package org.practiceDSA.DSA.binarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 9, 18, 36, 90, 101, 178, 200};
        int target = 101;

        System.out.println(binarySearch(arr, target));

    }

    //return the index if found
    //return -1 if does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            //find middle element
        //    int mid = (start + end)/2;   //might be possible (start + end) / 2 is exceeds then the value of integer; at that time ge got errors.
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;

            }else {
                //final answer
                return mid;
            }
        }
        return -1;
    }
}
