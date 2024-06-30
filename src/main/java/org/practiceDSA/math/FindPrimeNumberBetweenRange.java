package org.practiceDSA.math;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumberBetweenRange {

    public static void main( String[] args){

        int num = 40;
        List<Integer> result = listOfPrimeNumber(num);
        System.out.println(result);
    }

    static List<Integer> listOfPrimeNumber(int n){

        List<Integer> result = new ArrayList<>();
        boolean[] isPrime = new boolean[n];

        if (n <= 1){
            result.add(n);
            return result;
        }

        // Initialize all entries as true. A value in isPrime[i] will
        // finally be false if i is Not a prime, else true.
        for (int i = 2; i < n; i++){
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes

        for (int i = 2; i * i < n; i++){
            // If isPrime[p] is not changed, then it is a prime
            if (isPrime[i]){
                for (int j = i * 2; j < n; j += i ){
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++){
            if (isPrime[i]){
                result.add(i);
            }
        }

        return result;
    }
}
