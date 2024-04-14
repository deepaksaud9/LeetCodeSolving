package org.practiceDSA.DSA;

public class ArmStrongNumber {

    public static void main(String[] args) {

        //for checking is given number is Armstrong or not
/*        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number = input.nextInt();

        boolean result = isArmStrong(number);
        if (result == true){
            System.out.println(" this is a Armstrong number ");
        }else{
            System.out.println(" this is not a Armstrong number");
        }*/

        //for search armstrong number from 1 to 1000;
        for (int i = 0; i < 1000; i++){
            if (isArmStrong(i)){
                System.out.println(i + ",");
            }
        }

    }

    static Boolean isArmStrong(int num){
        //153
        int original = num;
        int sum = 0;

        while (num > 0){
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            num = num /10;
        }
        if (original == sum){
            return true;
        }
        return false;

    }
}
