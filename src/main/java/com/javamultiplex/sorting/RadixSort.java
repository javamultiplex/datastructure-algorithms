package com.javamultiplex.sorting;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 2019-10-01
 * <p>
 * Time Complexity - O(d*(N+b))
 * Where d=number of digits in max number, d = logb(l) where l is max number example - log10(1000)=3
 * b=base, for binary numbers b=2, for decimal numbers b=10 etc
 * Space Complexity - O(b)
 */
public class RadixSort {
    private static void sort(int[] arr, int n) {
        int max = getMax(arr, n);

        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, n, place);
        }
    }

    private static void countSort(int[] arr, int n, int place) {
        int[] count = new int[11];
        int[] sorted = new int[n];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[(arr[i] / place) % 10]++;
        }

        for (int i = 1; i <= 10; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            sorted[--count[(arr[i] / place) % 10]] = arr[i];
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
        int[] arr = {432, 8, 530, 90, 88, 231, 11, 45, 677, 199};
        int n = arr.length;
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        sort(arr, n);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    }
}
