package org.practiceDSA.practice;

public class DotEqualVsEqualOperator {

    public static void main(String[] args) {
        String a = "deep";
        String b = "deep";
        String name1 = new String("deep");
        String name2 = new String("deep");

        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a==name1);
        System.out.println(a.equals(name1));
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.length());
        System.out.println(name1.charAt(0));
        System.out.println(name1.charAt(1));
        System.out.println('a'+'b');
    }
}
