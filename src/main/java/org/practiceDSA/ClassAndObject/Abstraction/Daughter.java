package org.practiceDSA.ClassAndObject.Abstraction;

public class Daughter extends Parent{
    @Override
    void carer() {
        System.out.println("this is a daughter class extends parents");
    }

    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        daughter.carer();
    }
}
