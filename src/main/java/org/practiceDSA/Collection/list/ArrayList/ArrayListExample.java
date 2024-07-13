package org.practiceDSA.Collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    private ArrayList<String> arrayList = new ArrayList<>();

    //constructor
    public ArrayListExample (){
        arrayList = new ArrayList<>();
    }

    //method to add an element
    public void addElement(String element){
        arrayList.add(element);
    }

    //method to add an element at a specific index
    public void addElementAtIndex(int index, String element){
        arrayList.add(index,element);
    }

    //method to get an element
    public String getElement(int index){
        return arrayList.get(index);
    }

    //method to set an element
    public void setElement(int index,String element){
        arrayList.set(index,element);
    }

    // Method to remove an element by value
    public void removeElement(String element) {
        arrayList.remove(element);
    }

    // Method to remove an element by index
    public void removeElementAtIndex(int index) {
        arrayList.remove(index);
    }

    // Method to display all elements
    public void displayElements() {
        System.out.println("ArrayList elements:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }

    // Method to display elements using an iterator
    public void displayElementsUsingIterator() {
        Iterator<String> iterator = arrayList.iterator();
        System.out.println("ArrayList elements using iterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Method to get the size of the ArrayList
    public int getSize() {
        return arrayList.size();
    }

    // Method to clear the ArrayList
    public void clearElements() {
        arrayList.clear();
    }

}
