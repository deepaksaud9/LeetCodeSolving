package org.practiceDSA.BitwiseOperator;

public class FindUniqueNumber {

    public static void main(String[] args) {

        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(duplicateNumber(arr));
    }

    static int duplicateNumber(int[] arr){

        int result = 0;
        for (int num : arr){
            result = result ^ num;
        }
        return result;
    }
}
