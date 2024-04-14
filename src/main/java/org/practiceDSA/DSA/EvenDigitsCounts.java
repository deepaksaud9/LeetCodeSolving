package org.practiceDSA.DSA;

public class EvenDigitsCounts {
    public static void main(String[] args) {

        int[] arr = {12, 69, 897, 90, 29, 100};
        System.out.println(findNumber(arr));

    }

    static int findNumber(int[] nums){
        int count = 0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;

    }

    //function to check whether given number is even or not
    private static boolean even(int num) {

        int numberOfDigit = digit2(num);
        if (numberOfDigit % 2 == 0){
            return true;
        }
        return false;
    }

    //counts the number of digits in a number
    private static int digit2(int num){
        if(num < 0) {
            num = num * -1;
        }

        return (int) (Math.log10(num))+1;
    }

    private static int digit(int num){
        int count = 0;
        while (num > 0){

            num = num / 10;
            count++;
        }
        return count;
    }
}
