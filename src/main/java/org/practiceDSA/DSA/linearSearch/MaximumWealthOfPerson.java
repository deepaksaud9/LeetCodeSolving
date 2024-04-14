package org.practiceDSA.DSA.linearSearch;

public class MaximumWealthOfPerson {
    public static void main(String[] args) {

        int[][] persons = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 1, 2}
        };

        int[] maxWealthPerson = maximumWealth(persons);
        System.out.println("Person " + (maxWealthPerson[0] + 1) + " has the maximum wealth of " + maxWealthPerson[1]);
    }

    static int[] maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int personWithMaxWealth = 0;

        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account : accounts[person]) {
                sum += account;
            }
            if (sum > maxWealth) {
                maxWealth = sum;
                personWithMaxWealth = person;
            }
        }

        return new int[]{personWithMaxWealth, maxWealth};
    }
}
