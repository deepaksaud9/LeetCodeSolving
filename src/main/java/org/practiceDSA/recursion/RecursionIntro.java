package org.practiceDSA.recursion;

public class RecursionIntro {

    public static void main(String[] args) {

        message();
    }

    static void message(){
        System.out.println("hello solti");
        message2();
    }

    static void message2(){
        System.out.println("hello solti form message 2");
        message3();
    }
    static void message3(){
        System.out.println("helloe solti from message 3");
    }
}
