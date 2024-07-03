package org.practiceDSA.math;

public class Math {

    public static void main(String[] args) {

        System.out.println(isPrime(7));
    }
    static boolean isPrime(int n){

        if (n <= 1){
            return false;
        }

        for (int i = 2; i*i <= n; i++){

            if (n % i==0){
                return false;
            }
        }
        return true;
    }
}
