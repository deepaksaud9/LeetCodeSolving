package org.practiseDSA.DSA.binarySearch;

public class MountainArray {
    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5,4,3,2,1};

        System.out.println(peakIndexInMountainArray(arr));
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
}
