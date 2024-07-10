package org.practiceDSA.practise;

import java.util.Arrays;

public class Swap {

        public static void main(String[] args) {
            int a = 5;
            int b = 10;

            System.out.println("Before swap: a = " + a + ", b = " + b);

            swap(a,b);
            System.out.println("After swap: a = " + a + ", b = " + b);

        }

        static void swap(int a, int b){

            // Swap using a temporary variable
            int temp = a;
            a = b;
            b = temp;

//            System.out.println("After swap: a = " + a + ", b = " + b);
        }
}
