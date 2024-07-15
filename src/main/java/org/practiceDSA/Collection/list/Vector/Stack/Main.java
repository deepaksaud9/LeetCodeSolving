package org.practiceDSA.Collection.list.Vector.Stack;

public class Main {
    public static void main(String[] args) throws StackException {

//        CustomStack stack = new CustomStack(5);
//        CustomStack stack = new DynamicStack(5);
        DynamicStack stack = new DynamicStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
