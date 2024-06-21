package org.practiceDSA.recursion;

public class SumOfNaturalNumber {

    public static void main(String[] args) {

        int result = sum(10);
        System.out.println(result);
    }

    static int sum(int n){

       return  sum(n-1) +sum(n-2);
    }
}
