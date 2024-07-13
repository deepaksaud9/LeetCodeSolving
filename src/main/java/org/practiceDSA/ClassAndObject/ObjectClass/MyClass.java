package org.practiceDSA.ClassAndObject.ObjectClass;

public class MyClass {

    int num = 10;
    int a = 1;
    int num2 = 20;
//    MyClass(int num){
//        this.num = num;
//    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        obj1.num = 1;
        obj2.num = 2;
        System.out.println(" --->  "+obj1.getClass()); // Output: class MyClass
        System.out.println(obj1.hashCode());
        System.out.println(obj1.getClass().getName());



        MyClass s1 = new MyClass();
        MyClass s2 = new MyClass();

        s1.a = s1.a + 1;

        System.out.println("object s1 : "+s1.a);
        System.out.println("objects2 : " + s2.a);

    }
}
