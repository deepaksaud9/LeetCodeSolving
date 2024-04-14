package org.practiceDSA.DSA.linearSearch;

public class SearchCharFromArray {

    public static void main(String[] args) {
        String name = "deepak";
        char target = 's';
        System.out.println(search(name, target));
    }
//    static boolean search(String str, char target){
//
////        char[] name1 = str.toCharArray();
//
//        if(str.length() == 0){
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++){
//            if (target == str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }

    static boolean search(String str, char target){

        char[] name1 = str.toCharArray();

        if(name1.length == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (target == name1[i]){
                return true;
            }
        }
        return false;
    }
}
