package org.practiceDSA.recursion;

public class Example1 {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        if (n == 1000){
            return;
        }
        System.out.println(n);
        print(n+1);

    }
}
