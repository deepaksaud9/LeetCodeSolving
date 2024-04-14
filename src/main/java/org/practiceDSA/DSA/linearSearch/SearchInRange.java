package org.practiceDSA.DSA.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {12, 76, 69, 17, 54};
        int target = 69;
        int start = 2;
        int end = 4;

        int result = linSearch(arr,target,start,end);
        System.out.println(result);



    }

    static int linSearch(int[] arr, int target, int start, int end){

        int search = target;
        if (arr.length == 0){
            return -1;
        }

        //run a loop
        for (int index = start; index <= end; index++){

            if (arr[index] == search){
                return arr[index];
            }
        }
        return -1;
    }
}
