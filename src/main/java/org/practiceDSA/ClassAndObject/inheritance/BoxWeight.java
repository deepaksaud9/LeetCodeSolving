package org.practiceDSA.ClassAndObject.inheritance;

public class BoxWeight extends Box{
    int weight;

    BoxWeight(){
        this.weight = 20;
    }

    BoxWeight(int length, int breadth, int height,int weight){
        super(length,breadth,height);
        this.weight = weight;
    }

}
