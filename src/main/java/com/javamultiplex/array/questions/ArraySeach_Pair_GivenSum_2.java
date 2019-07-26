package com.javamultiplex.array.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Rohit Agarwal on 2019-07-26
 *
 * https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
 *
 */
public class ArraySeach_Pair_GivenSum_2 {


    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        int sum = 10;
        printPair(arr, arr.length, sum);
    }

    /**
     *
     * Time Complexity - O(n)
     * Space Complexity - O(n)
     *
     * @param arr
     * @param n
     * @param sum
     */
    private static void printPair(int[] arr, int n, int sum) {
        Set<Integer> set = new HashSet<>();
        int temp=0;
        for(int i=0;i<n;i++){
            temp=sum-arr[i];
            if(set.contains(temp)){
                System.out.println("Pairs : [" + arr[i] + "," + temp + "]");
                break;
            }
            set.add(arr[i]);
        }
    }

}
