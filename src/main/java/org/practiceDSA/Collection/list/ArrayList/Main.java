package org.practiceDSA.Collection.list.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //creating object of ArrayListExample
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.addElement("hero");
        arrayListExample.addElement("nikhil");
        arrayListExample.addElement("deepesh");
        arrayListExample.addElement("aakash");
        arrayListExample.addElement("umesh");

        System.out.println(arrayListExample.getSize());

        arrayListExample.displayElements();
        System.out.println(" ");

        arrayListExample.addElementAtIndex(1,"depp");
        System.out.println(" ");
        arrayListExample.displayElements();

        //creating object of Person class
        List<Person> people = Arrays.asList(
                new Person("hari",41),
                new Person("rupesh",40),
                new Person("dhurb",30),
                new Person("nabin",23)
        );

//print Array by sing Scope Resolution
        List<String> personList = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Names: " +personList);

        //filter
        List<Person> filtered = people.stream()
                .filter(person -> person.getAge() > 25)
                .collect(Collectors.toList());
        System.out.println("filtered" + filtered);

        //sorting
        List<Person> sorted = people.stream()
                .sorted((p1,p2) -> p1.getAge() - p2.getAge())
                .collect(Collectors.toList());


//        System.out.println("sorted by age: "+ sorted);
    sorted.forEach(System.out::println);
        System.out.println("scope resolution operator used");
    people.forEach(System.out::println);

    }
}
