package org.practiceDSA.ClassAndObject.garbageCollection;

public class GarbageCollectionExample {

    public static void main(String[] args) {

        GarbageCollectionExample obj = new GarbageCollectionExample();
        obj = null;

        System.gc();
        System.out.println(" garbage collection has been requested");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector Called ");
        System.out.println("Object garbage Collected : "+ this);
    }
}
