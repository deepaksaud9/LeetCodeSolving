package org.practiceDSA.LeetCode;

/*
    Maximum Sum Increasing Subsequence Problem
        Find a subsequence of a given sequence such that the subsequence sum is as high as possible and
        the subsequence’s elements are sorted in ascending order. This subsequence is not necessarily
        contiguous or unique.
        Please note that the problem specifically targets subsequences that need not be contiguous, i.e.,
        subsequences are not required to occupy consecutive positions within the original sequences.
        For example, consider the subsequences {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11}.
*/

public class MaxSumIncSubseqProblem {

    public static void main(String args[]) {
        int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11};
        int n = arr.length;
        System.out.println("Sum of maximum sum increasing subsequence is " + maxSumIS(arr, n));
    }

        public static int maxSumIS(int arr[], int n) {
            int msis[] = new int[n];
            int maxSum = 0;

            // Initialize msis values for all indexes
            for (int i = 0; i < n; i++) {
                msis[i] = arr[i];
            }

            // Compute maximum sum values in msis[]
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] > arr[j] && msis[i] < msis[j] + arr[i]) {
                        msis[i] = msis[j] + arr[i];
                    }
                }
            }

            // Find the maximum value in msis[]
            for (int i = 0; i < n; i++) {
                if (maxSum < msis[i]) {
                    maxSum = msis[i];
                }
            }

            return maxSum;
        }

}
