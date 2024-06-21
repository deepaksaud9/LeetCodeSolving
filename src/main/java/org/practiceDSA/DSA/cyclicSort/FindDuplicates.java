package org.practiceDSA.DSA.cyclicSort;


import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> duplicates = duplicateNumbers(nums);
        System.out.println(duplicates);

    }

   static public List<Integer> duplicateNumbers(int[] arr){
        int i = 0;

        while (i < arr.length){
            if (arr[i] != i + 1){
                int correct = arr[i] - 1;
                if ( arr[i] != arr[correct]){                //
                    swap(arr, i, correct);
                }else {
                    i++;
                }
            }else{
                i++;
            }
        }
       List<Integer> duplicates = new ArrayList<>();
       for (int index = 0; index < arr.length; index++) {
           if (arr[index] != index + 1) {
               duplicates.add(arr[index]);
           }
       }
       return duplicates;
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
