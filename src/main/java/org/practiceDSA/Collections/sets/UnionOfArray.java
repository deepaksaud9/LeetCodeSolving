package org.practiceDSA.Collections.sets;


import java.util.*;

//find a union of two sets
public class UnionOfArray {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {3,5,6,7,8,9};

        int[] union = union(arr1,arr2);
        System.out.println(Arrays.toString(union));



    }

     static int[] union( int[] array1, int[] array2){

         Set<Integer> set = new HashSet<>();

         for (int num : array1){
             set.add(num);
         }

         for (int num : array2){
             set.add(num);
         }

         int[] arrayAsSet = new int[set.size()];
         int index = 0;

         for (int num : set){
                arrayAsSet[index++]  = num;
         }

         return arrayAsSet;
     }




}
