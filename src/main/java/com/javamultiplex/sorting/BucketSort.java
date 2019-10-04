package com.javamultiplex.sorting;

import java.util.Arrays;

/**
 * @author Rohit Agarwal on 2019-10-04
 */
public class BucketSort{


    private void sort(double[] arr, int n) {


    }

    public static void main(String[] args) {
        double[] arr={0.2,0.6,0.4,0.1,0.7,0.5};
        int n=arr.length;
        System.out.println("Before Sorting ...");
        System.out.println(Arrays.toString(arr));
        BucketSort bucketSort=new BucketSort();
        bucketSort.sort(arr,n);
        System.out.println("After Sorting ...");
        System.out.println(Arrays.toString(arr));

    }
}
