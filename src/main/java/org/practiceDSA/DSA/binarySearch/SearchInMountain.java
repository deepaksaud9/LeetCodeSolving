package org.practiceDSA.DSA.binarySearch;

import java.util.Arrays;

public class SearchInMountain {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,4,3,2};
        int target = 3;

        System.out.println(search(arr, target));
    }

        static int search(int[] arr, int target){

        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if (firstTry != -1){
            return firstTry;
        }
        //try to search in second half
            return orderAgnosticBS(arr, target, peak+1, arr.length-1);

        }

        static int peakIndexInMountainArray(int[] arr){

            int start = 0;
            int end = arr.length-1;

            while (start < end){

                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid+1]){
                    //we are in the des. part of array
                    //this may be the answer, but we have to look at left may find another possible answer;
                    //this is why end != mid-1;
                    end = mid;
                }else {
                    //we are in the ascending part of array
                    start = mid + 1;
                }
            }

            //in the end start == end and pointing to the largest number because of the two checks.
            //start and end are always tries to find max element in above two checks
            //hence, when they are pointing to just one element, that is just the max one because that is what the checks say.
            // more elaboration: at every point of time for start and end, they have the best possible answer till that time.
            //and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans.

            return start;
        }

    static int orderAgnosticBS(int[] arr, int target, int start, int end ){
        /*int start = 0;
        int end = arr.length-1;*/

        //find whether array is sorted ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            //find middle element
            //    int mid = (start + end)/2;   //might be possible (start + end) / 2 is exceeds then the value of integer; at that time ge got errors.
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
