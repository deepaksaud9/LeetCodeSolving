package org.practiseDSA.DSA.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {23,45, 67, 12, 9, 80};
        int target = 32;
        int result = linSearch(nums,target);

        System.out.println(result);

    }

    static int linSearch(int[] arr, int target){

        int search = target;
        if (arr.length == 0){
            return -1;
        }

        //run a loop
        for (int i = 0; i < arr.length; i++){

            if (arr[i] == search){
                return arr[i];
            }
        }
        return -1;
    }
}
