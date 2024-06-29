package org.practiceDSA.BitwiseOperator;

//sum of nth row of pascal's triangle
public class PascalTriangle {
    public static void main(String[] args) {
        int n =4;

        System.out.println(pascals(n));
    }

    static int pascals(int n){

        return 1 << (n-1);
    }
}
