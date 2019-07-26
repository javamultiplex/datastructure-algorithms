package com.javamultiplex.array.questions;

/**
 * @author Rohit Agarwal on 2019-07-25
 * <p>
 * https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 */
public class ArraySearch_RotatedSortedAscendingOrder {


    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 1;
        final int index = pivotedBinarySearch(arr, 9, key);
        System.out.println(index);
    }

    private static int pivotedBinarySearch(int[] arr, int n, int key) {
        int p = findPivot(arr, 0, n - 1);
        System.out.println(p);
        if (p == -1)
            return binarySearch(arr, 0, n - 1, key);
        if (arr[p] == key)
            return p;
        if (key >= arr[0])
            return binarySearch(arr, 0, p - 1, key);
        return binarySearch(arr, p + 1, n - 1, key);

    }

    private static int findPivot(int[] arr, int low, int high) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (low < mid && arr[mid - 1] > arr[mid])
            return mid - 1;
        if (arr[low] > arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }


    private static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key)
            return mid;
        if (key < arr[mid])
            return binarySearch(arr, low, mid - 1, key);
        else
            return binarySearch(arr, mid + 1, high, key);


    }
}
