package org.practiceDSA.DSA.binarySearch;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {

        int[] arr = {5,7,7,7,7,8,8,9};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    static int[] searchRange(int[] arr, int target){

        int[] ans = {-1, -1};
        //check for first occurrence if target first.
       int start = search(arr, target, true);
       int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    //This function just return the index value of what we are target
    static int search(int[] arr, int target, boolean findStartIndex ){

        int ans = -1;
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
                //potential answer found
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
