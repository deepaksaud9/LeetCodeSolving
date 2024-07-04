package org.practiceDSA.ClassAndObject.toString;

import java.util.Arrays;

public class ToString {

    public static void main(String[] args) {

        Student depp = new Student();
        depp.name="depp";
        depp.address = "mahendranagar";
        System.out.println(depp);

        Car g_wagon = new Car();
        g_wagon.name = "G wagon";
        g_wagon.model = "G-class";
        g_wagon.year = 2023;

        System.out.println(g_wagon);
        System.out.println();


    }


}
class Student{
    String name;
    String address;

    public String toString(){

        return (
                "name: "+ name +
                        ", address: "+ address
        );

    }
}

class Car{
    String model;
    String name;
    int year;


}
