package org.practiceDSA.BitwiseOperator;

public class FindUniqueFromIntegers {

    public static void main(String[] args) {

        int[] arr = {-1,-4,3,1,4};

        System.out.println(unique(arr));
    }

    static int unique(int[] arr){

        int result = 0;
        for(int num : arr){
                result = result + num;
        }

        return result;
    }
}
