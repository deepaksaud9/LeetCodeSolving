package org.practiceDSA.BitwiseOperator;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 32;
        boolean result = (n & (n-1))==0;
        System.out.println(result);
    }
}
