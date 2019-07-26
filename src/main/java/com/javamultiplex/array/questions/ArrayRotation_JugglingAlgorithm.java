package com.javamultiplex.array.questions;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 2019-07-24
 *
 * https://www.youtube.com/watch?v=utE_1ppU5DY
 *
 */
public class ArrayRotation_JugglingAlgorithm {
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
        int sets = gcd(n, d);
        int j, temp, k;
        for (int i = 0; i < sets; i++) {
            j = i;
            temp = arr[i];
            while (true) {
                k = (j + d) % n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        System.out.println("After : ");
        print(arr);
    }


    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
