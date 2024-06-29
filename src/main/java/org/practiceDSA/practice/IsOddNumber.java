package org.practiceDSA.practice;

import java.util.ArrayList;
import java.util.List;

public class IsOddNumber {

    public static void main(String[] args) {
        int num = 90;
        int[] arr = {2,3,2,3,6,2};
        System.out.println(isOdd(num));

        System.out.println(bitwiseAnd());

        System.out.println(bitwiseXOR(arr));

    }

    private static boolean isOdd(int num) {

        return (num & 1) == 1;
    }

    static int bitwiseAnd(){

        return (0 | 1);
    }

    static int bitwiseXOR(int[] arr){

        int result = 0;
        for( int num : arr){
             result =  result ^ num;
        }


        return result;
    }
}
