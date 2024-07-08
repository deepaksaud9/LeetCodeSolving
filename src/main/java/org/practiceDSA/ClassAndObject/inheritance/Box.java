package org.practiceDSA.ClassAndObject.inheritance;

public class Box {
    int length;
    int breadth;
    int height;

    Box(){
        this.length = 100;
        this.breadth = 200;
        this.height = 300;
    }
    Box(int size){
        this.length = size;
        this.breadth = size;
        this.height = size;
    }
    Box(Box box){
        this.length = box.length;
        this.breadth = box.breadth;
        this.height = box.height;
    }
    Box(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void information(){
        System.out.println(" hello buddy, how are you?");
    }
}
