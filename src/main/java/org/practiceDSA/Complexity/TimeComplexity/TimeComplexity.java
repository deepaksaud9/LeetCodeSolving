package org.practiceDSA.Complexity.TimeComplexity;

public class TimeComplexity {

    public static void main(String[] args) {
        int n = 50;
        int k = 20;


        for (int i = 1; i < n; ){

            for (int j = 1; j< k; j++){

                System.out.print(j);
                System.out.print(", ");
            }
            i = i+k;
            System.out.println("");
            System.out.println( i);
        }
    }
}
