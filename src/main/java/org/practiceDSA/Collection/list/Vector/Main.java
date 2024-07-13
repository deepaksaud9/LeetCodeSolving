package org.practiceDSA.Collection.list.Vector;

import org.practiceDSA.Collection.list.ArrayList.ArrayListExample;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        VectorExample example = new VectorExample();
        example.addElement("ram");
        example.addElement("hari");
        example.addElement("krishna");
        example.addElement(null);


        List<String> elements = example.getAllElements();


        System.out.println(elements);


    }

}
