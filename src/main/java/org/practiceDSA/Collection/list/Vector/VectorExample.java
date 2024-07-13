package org.practiceDSA.Collection.list.Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

    private Vector vector;

    private String name;
    private int age;

    public VectorExample(){
        vector = new Vector();
    }



    public void addElement(String element){
        vector.addElement(element);
    }

    public List<String> getAllElements(){
        List<String > elements = vector.stream().toList();

        return elements;
    }

}
