package com.javamultiplex.array;

/**
 * @author Rohit Agarwal on 2019-07-25
 * <p>
 * https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 */
public class ArraySearch_RotatedSortedAscendingOrder_2 {


    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;
        int n = 9;
        final int index = search(arr, 0, n - 1, key);
        System.out.println(index);
    }

    private static int search(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[low] <= arr[mid]) {
            if (key >= arr[low] && key <= arr[mid])
                return search(arr, low, mid - 1, key);
            return search(arr, mid + 1, high, key);
        }
        if (key >= arr[mid] && key <= arr[high]) {
            return search(arr, mid + 1, high, key);
        }
        return search(arr, low, mid - 1, key);
    }


}
