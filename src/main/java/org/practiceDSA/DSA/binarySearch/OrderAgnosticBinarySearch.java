package org.practiceDSA.DSA.binarySearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
            int[] arrAsc = {1,2,3,4,5,6,7,8,9};
            int[] arrDes = {9,8,7,6,5,4,3,2,1};
            int target = 6;

        System.out.println(orderAgnosticBS(arrAsc, target));
        System.out.println("Descending: " + orderAgnosticBS(arrDes,target));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

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
