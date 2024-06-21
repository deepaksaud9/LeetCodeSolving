package org.practiceDSA.practice;

import java.util.ArrayList;
import java.util.List;

public class Performance {

    public static void main(String[] args) {

        List<Character> get = new ArrayList<>();
        for (int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
//            System.out.println(ch);
            get.add(ch);

        }
    }
}
