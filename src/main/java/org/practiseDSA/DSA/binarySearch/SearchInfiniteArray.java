package org.practiseDSA.DSA.binarySearch;

public class SearchInfiniteArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        int target = 4;

        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        //first find the range
        //first start with a box of size 2;

        int start = 0;
        int end = 1;

        //condition for the target to lies in the range
        while (target > arr[end]) {
            int tempStart = end +1;
            //double the box value
            end = end + (end - start + 1) * 2;
            start = tempStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            //find middle element
            //    int mid = (start + end)/2;   //might be possible (start + end) / 2 is exceeds then the value of integer; at that time ge got errors.
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //final answer
                return mid;
            }
        }
        return -1;
    }
}
