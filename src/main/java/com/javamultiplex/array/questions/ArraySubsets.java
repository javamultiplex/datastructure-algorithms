package com.javamultiplex.array.questions;

/**
 * @author Rohit Agarwal on 2019-07-24
 * <p>
 * https://www.geeksforgeeks.org/finding-all-subsets-of-a-given-set-in-java/
 */
public class ArraySubsets {


    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c'};
        // Output = {}, {a}, {b}, {c}, {a,b}, {a,c}, {b,c}, {a,b,c}
        printSubsets(arr);
    }

    /**
     * As per mathematics number of sets will be 2^n
     * where n = number of elements in an array, this sets are nothing but
     * binary representation.
     * <p>
     * if n=4 then number of sets 2^4=16
     * <p>
     * 0000
     * 0001
     * 0010
     * 0011
     * 0100
     * 0101
     * 0110
     * 0111
     * 1000
     * 1001
     * 1010
     * 1011
     * 1100
     * 1101
     * 1110
     * 1111
     *
     * @param arr
     */
    private static void printSubsets(char[] arr) {
        int n = arr.length;

        for (int i = 0; i < (1 << n); i++) {
            System.out.print("{ ");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println("}");
        }
    }

}
