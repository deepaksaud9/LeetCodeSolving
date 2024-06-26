package org.practiceDSA.DSA.binarySearch;

public class RotatedBinarySearch  {

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        int target = 6;
        System.out.println(search(arr, target));

    }

    static  int search(int[] nums, int target){
        int pivot  = findPivot(nums);
        //if we did not find the pivot, it means the array is not rotated
        if (pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        //if pivot is found, we have to found 2 asc sorted array
        if (nums[pivot] == target){
            return pivot;
        } if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivotWithDuplicates (int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;

//            we use case 4 over here
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }else if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }if (arr[mid] <= arr[start]){
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;

//            we use case 4 over here
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }if (mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            //if elements are at middle, start, end are equal then just skip the duplicates

            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates

                //check if start is pivot
                if (arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;
                //check if start is pivot
                if (arr[end] < arr[end-1])
                {
                    return end -1;
                }
                end--;
            }
            //left side is sorted, or pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){

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
