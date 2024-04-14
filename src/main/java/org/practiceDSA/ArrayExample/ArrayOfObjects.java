package org.practiseDSA.ArrayExample;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];

        for (int i = 0 ; i < str.length ; i++){
            System.out.println("enter array element");
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));


    }
}
