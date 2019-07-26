package com.javamultiplex.array.questions;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 2019-07-26
 *
 * https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
 *
 */
public class ArraySeach_Pair_GivenSum_1 {


    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        int sum = 16;
        printPair(arr, arr.length, sum);
    }

    /**
     *
     * Time complexity - O(n*log(n))
     * Space Complexity - O(n)
     *
     * @param arr
     * @param n
     * @param sum
     */
    private static void printPair(int[] arr, int n, int sum) {
        Arrays.sort(arr);
        int low = 0;
        int high = n - 1;
        while (low < high) {
            if (arr[low] + arr[high] == sum) {
                System.out.println("Pairs : [" + arr[low] + "," + arr[high] + "]");
                break;
            }else if(arr[low]+arr[high]<sum){
                low++;
            }else{
                high--;
            }
        }
    }

}
