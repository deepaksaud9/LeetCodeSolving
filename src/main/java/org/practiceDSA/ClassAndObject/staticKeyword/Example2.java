package org.practiceDSA.ClassAndObject.staticKeyword;

public class Example2 {

    static int repeat;
    int questionNo ;

    public Example2(int questionNo){
        this.questionNo = questionNo;
        this.repeat += 1;
    }

    //inner class (it is always static class)
    public static class Cat {
        static String name;
        static int population;
        //constructor
        Cat(String name){
            this.name = name;
            Cat.population += 1;
        }
    }

    public class Dog {
        static String name;
        static int population;
        //constructor
        Dog(String name){
            this.name = name;
            Cat.population += 1;
        }
    }


    public static void main(String[] args) {

        Cat kaley = new Cat("kaley");
        Cat rito = new Cat("rito");
        Cat simba = new Cat("simba");
        System.out.println(kaley.name);
        System.out.println(rito.name);
        System.out.println(Cat.population);


        Example2 example2 = new Example2(1);
        Example2 question2 = new Example2(2);
        System.out.println(example2.repeat);



    }

}
