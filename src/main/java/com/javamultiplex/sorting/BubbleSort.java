package com.javamultiplex.sorting;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 2019-09-30
 * <p>
 * Time complexity -> Worst Case = O(n^2), Best Case = O(k*n)
 * where k is number of iterations
 */
public class BubbleSort implements Sort {

    @Override
    public void sort(int[] arr, int n) {
        int swapped;
        for (int i = 0; i < n; i++) {
            swapped = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = 1;
                }
            }
            if (swapped == 0) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 40};
        int n = 5;
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.sort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
