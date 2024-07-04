package org.practiceDSA.ClassAndObject.staticKeyword;

public class Main {

    public static void main(String[] args) {
//        Human deep = new Human(22,"depp", 100000,true);
        Human roshan = new Human(32,"roshan", 120000, false);
        Human hari = new Human(12,"hari", 123000, false);

        System.out.println(roshan.population);
        System.out.println(hari.population);
//        System.out.println(Human.population);

        display();
        Main call =  new Main();
        call.non_static();
    }

 static void display(){
       Main main = new Main();    // to call non-static method in a static method new need to create a instance of class
       main.greeting1();          // with the help of reference we call the non-static methods
       greeting2();               // if we want to call static method over static method we don't need to create object we can directly.
                                    // but we can call static method in non-static method
 }

    void greeting1(){
        System.out.println("hello Kathmandu");
    }

     static void greeting2(){
        System.out.println("hello Pokhara");
    }

    void non_static(){
        System.out.println(" i am non-static method");
        iAmStatic();

    }

    static void iAmStatic(){
        System.out.println("i am static method");
    }

}
