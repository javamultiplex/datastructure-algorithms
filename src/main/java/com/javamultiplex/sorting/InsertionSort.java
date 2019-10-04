package com.javamultiplex.sorting;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 2019-10-04
 *
 * Worst case time complexity - O(N^2)
 * Best case time complexity - O(N)
 * Space complexity - O(1)
 */
public class InsertionSort {

    private static void sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 3, 4, 2, 0, 1, 5, 7, 8};
        int n = arr.length;
        System.out.println("Before sorting ...");
        System.out.println(Arrays.toString(arr));
        sort(arr,n);
        System.out.println("After sorting ...");
        System.out.println(Arrays.toString(arr));
    }
}
