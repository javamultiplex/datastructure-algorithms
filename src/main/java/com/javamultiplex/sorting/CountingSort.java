package com.javamultiplex.sorting;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 2019-10-01
 *
 * Time complexity - O(N+K) where is K max element in an array
 * Space Complexity - O(K)
 */
public class CountingSort {

    public static void sort(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int k = max;

        int[] aux = new int[k + 1];
        int[] sorted = new int[n];
        for (int i = 0; i <= k; i++) {
            aux[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            aux[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i <= k; i++) {
            int temp = aux[i];
            while (temp != 0) {
                sorted[j] = i;
                temp--;
                j++;
            }
        }

        System.out.println(Arrays.toString(sorted));

    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 5, 2, 3, 5};
        int n=7;
        sort(arr,n);
    }
}
