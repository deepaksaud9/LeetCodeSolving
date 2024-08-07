package org.practiceDSA.Collection.list.LinkedList.CircularLinkedList;

public class CircularLL {

    private Node head;
    private Node tail;

    CircularLL(){
        this.head = null;
        this.tail = null;
    }

    public void insertAtTail(int val){
        Node node =new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;

    }

    public void display(){
        Node node = head;
        if( head != null){
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            }while (node != head);
        }
        System.out.println(" END ");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
