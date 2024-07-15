package org.practiceDSA.Collection.Queue;

public class Main {

    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(5);
        queue.insert(1);
        queue.insert(2);

        queue.display();

        System.out.println(queue.remove() );
        queue.display();


    }
}
