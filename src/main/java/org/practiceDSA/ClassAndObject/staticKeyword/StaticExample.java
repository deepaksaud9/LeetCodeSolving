package org.practiceDSA.ClassAndObject.staticKeyword;

public class StaticExample {
    static int staticVariable = 10;

    public static void main(String[] args) {

        System.out.println("the static variable : "+ StaticExample.staticVariable);

        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
       obj1.staticVariable = 20;

        System.out.println("staticVariable at last: " + StaticExample.staticVariable );
    }
}
