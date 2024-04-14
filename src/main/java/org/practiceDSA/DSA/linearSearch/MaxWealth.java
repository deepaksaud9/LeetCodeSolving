package org.practiceDSA.DSA.linearSearch;

public class MaxWealth {
    public static void main(String[] args) {

        int[][] persons = {
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };

        System.out.println(maximumWealth(persons));
    }

   static int maximumWealth(int[][] accounts){
        //person == row
        //account == column
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++){
            //when you start a new col, takes a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++){
                sum = sum + accounts[person][account];
            }
            //now we have sum of accounts of persons.
            // check with overall answer
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
