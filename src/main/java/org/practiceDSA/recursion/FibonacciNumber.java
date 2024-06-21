package org.practiceDSA.recursion;

public class FibonacciNumber {
    public static void main(String[] args) {

        int result = fibonacci(4);
        System.out.println(result);
    }

    static int fibonacci(int n){
        //base case
        if (n < 2){
            return n;
        }
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
