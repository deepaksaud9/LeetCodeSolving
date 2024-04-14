package org.practiceDSA.DSA;

import java.util.Scanner;

public class PrimeNumberByDefault {

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
    /*static boolean  isPrime(int num){
        if (num<=1){
            return false;
        }
        int count = 2;
        while (count < Math.sqrt(num)){
            if (num % count == 0 ){
                return false;
            }
            count++;
        }
        return true;
    }*/

    static boolean  isPrime(int num){
        if (num<=1){
            return false;
        }
        int count = 2;
        while (count < Math.sqrt(num)){
            if (num % count == 0 ){
                return false;
            }
            count++;
        }
        return true;
    }
}
