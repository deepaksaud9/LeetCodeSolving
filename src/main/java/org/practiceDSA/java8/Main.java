package org.practiceDSA.java8;

public class Main{
    public static void main(String[] args) {
/*
        LambdaExpression expression = () -> System.out.println("hello solti");
        expression.show();
*/

        LambdaExpression expression2 = (message) -> System.out.println(message);
        expression2.show1("hello object 2");
    }
}
