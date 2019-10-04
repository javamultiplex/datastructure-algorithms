package com.javamultiplex.sorting;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 2019-10-01
 * <p>
 * Time complexity - O(N+K) where is K max element in an array
 * Space Complexity - O(K)
 */
public class CountingSort implements Sort {

    @Override
    public void sort(int[] arr, int n) {
        int k = getMax(arr, n);

        int[] count = new int[k + 1];

        int[] sorted = new int[n];

        Arrays.fill(count, 0);

        //O(N)
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        //O(K)
        for (int i = 1; i <= k; i++) {
            count[i] += count[i - 1];
        }

        //O(N)
        for (int i = n - 1; i >= 0; i--) {
            sorted[--count[arr[i]]] = arr[i];
        }

        System.arraycopy(sorted, 0, arr, 0, n);
    }

    private static int getMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 5, 2, 3, 5};
        int n = 7;
        System.out.println("Before Sorting ...");
        System.out.println(Arrays.toString(arr));
        CountingSort countingSort = new CountingSort();
        countingSort.sort(arr, n);
        System.out.println("After Sorting ...");
        System.out.println(Arrays.toString(arr));
    }
}
