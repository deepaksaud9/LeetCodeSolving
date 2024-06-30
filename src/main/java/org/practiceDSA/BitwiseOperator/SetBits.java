package org.practiceDSA.BitwiseOperator;

public class SetBits {

    public static void main(String[] args) {
        int num = 700;
        System.out.println(findNoOfSetBit(num));
    }

    static int findNoOfSetBit(int n){

        int count = 0;
    while (n>0){
        if ((n & 1) == 1){
            count++;
        }
       n = n >> 1;
    }

    return count;
    }
}
