package org.practiceDSA.pattern;

public class Type1 {

    public static void main(String[] args) {

//        pattern1(5);
//        pattern2(5);
//        patternRightAngleTriangle(5 );
//        patternTriangle(5);

//        patternInvertedTriangle(5);

        pattern4(5);
    }


    static void pattern1(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern2(int n){


        for (int i = 1; i <= n; i++){

            for (int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    static void patternRightAngleTriangle(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void patternTriangle(int n){

        for (int i = 1; i < n; i++){
            for (int j = 1; j < n - i; j++ ){
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++ ){
                System.out.print("*");
            }
            /*for (int j = 0; j < i; j++ ){
                System.out.print(" ");
            }*/
            System.out.println(" ");
        }

    }

    static void patternInvertedTriangle(int n){

        for (int i = 1; i <= n; i++){

            for (int j = 0; j < n-i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern4(int n){

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

}
