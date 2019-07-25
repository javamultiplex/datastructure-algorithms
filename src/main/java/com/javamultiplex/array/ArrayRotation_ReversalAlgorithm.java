package com.javamultiplex.array;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 2019-07-24
 * <p>
 * https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
 */
public class ArrayRotation_ReversalAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;
        //Output = {3,4,5,6,1,2}
        rotateArray(arr, d);
    }

    private static void rotateArray(int[] arr, int d) {
        System.out.println("Before : ");
        print(arr);
        int n = arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        System.out.println("After : ");
        print(arr);
    }


    private static void reverse(int[] arr, int left, int right) {
        int temp = 0;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
