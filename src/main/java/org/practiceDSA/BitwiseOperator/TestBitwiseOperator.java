package org.practiceDSA.BitwiseOperator;

public class TestBitwiseOperator {
    public static void main(String[] args) {
        int n = 125;
        System.out.println("this is shifted : "+shiftOperator(n));
        System.out.println("this is bit AND : " + bitAnd(n));
        System.out.println("this is bit OR : " + bitOr(n));
        System.out.println("this is bit XOR : " + bitXor(n));
    }

    static int shiftOperator(int n){
        return n >> 2;
    }

    static int bitAnd(int n){
        return n & n;
    }

    static int bitOr(int n){
        return n | n;
    }

    private static int bitXor(int n) {
        return n ^ n;
    }


}
