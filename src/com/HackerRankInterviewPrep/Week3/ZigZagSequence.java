package com.HackerRankInterviewPrep.Week3;

import java.util.Arrays;

/**
 * Given an array of n distinct integers, transform the array into a zig zag sequence by permuting the array elements.
 * A sequence will be called a zig zag sequence if the first k elements in the sequence are in increasing order and the last  elements are in decreasing order,
 * where k=(n+1)/2 . You need to find the lexicographically smallest zig zag sequence of the given array.
 */

public class ZigZagSequence {
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n + 1)/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 1;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed + 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

}
