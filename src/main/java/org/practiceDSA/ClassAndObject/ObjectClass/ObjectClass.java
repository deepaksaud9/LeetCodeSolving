package org.practiceDSA.ClassAndObject.ObjectClass;

public class ObjectClass {
    int a;
    public ObjectClass(int a) {
        this.a = a;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectClass myClass = (ObjectClass) obj;
        return a == myClass.a;
    }

    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass(10);
        ObjectClass obj2 = new ObjectClass(10);
        System.out.println(obj1.equals(obj2)); // Output: true
    }
}
