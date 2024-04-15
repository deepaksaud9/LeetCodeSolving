package org.practiceDSA.DSA.binarySearch;

public class CountRotation {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr){

        int pivot = findPivot(arr);

        return pivot + 1;

    }
    //use this for duplicates
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

    // use this for not duplicates
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
}
