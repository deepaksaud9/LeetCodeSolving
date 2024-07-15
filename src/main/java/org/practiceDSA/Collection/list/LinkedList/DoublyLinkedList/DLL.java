package org.practiceDSA.Collection.list.LinkedList.DoublyLinkedList;

public class DLL {
    private Node head;

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if (head != null){
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertLast(int val){
        Node newNode = new Node(val);
        Node last = head;

        newNode.next = null;

        if (head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void insertAfter(int after, int val){
        Node p = find(after);
        if (p == null){
            System.out.println("does not exist");
            return;
        }
        Node node  = new Node(val);
       node.next = p.next;
       node.prev = p;
       p.next = node;
       if (node.next.prev != null) {
           node.next.prev = node;
       }

    }

    public Node find(int val){
        Node node = head;
        while (node != null){
            if (node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.val+ " -> ");
            last = node;
            node = node.next;
        }
        System.out.println(" END");

        System.out.println("print in reverse order");
        while  (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println(" START ");
    }
    private class Node {
        int val;
        Node next;
        Node prev;

       public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
