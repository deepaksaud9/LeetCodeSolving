package org.practiceDSA.ClassAndObject.staticKeyword;

public class Human {

    int age;
    String name;
    long salary;
    boolean marriage;
     int population;

    public Human(int age, String name, long salary, boolean marriage){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.marriage =marriage;
        this.population += 1;
    }
}
