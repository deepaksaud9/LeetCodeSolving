package org.practiceDSA.Collection.Queue.CircularQueue;

public class CircularMain {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        queue.display();
    }
}
