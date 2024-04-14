package org.practiceDSA.DSA;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you want to check either prime or not");
        int num = input.nextInt();
         boolean result = isPrime(num);
         if (result == true){
             System.out.println("this is a prime number");
         }else {
             System.out.println(" this is a not a prime number");
         }
    }
    static Boolean isPrime(int number){
        if (number <=1){
            return false;
        }
        int count = 2;
        while (count * count < number){
            if (number % count == 0){
                return false;
            }
            count++;
        }
        return count * count > number;

    }
}

