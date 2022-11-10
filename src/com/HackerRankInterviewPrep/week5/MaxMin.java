package com.HackerRankInterviewPrep.week5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * You will be given a list of integers, arr , and a single integer k . You must create an array of length k  from elements of arr  such that its unfairness is minimized. Call that array arr'. Unfairness of an array is calculated as
 *
 * Where: max(arr') - min (arr')
 * - max denotes the largest integer in
 * - min denotes the smallest integer in
 */

public class MaxMin {
    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int unfairness = 0;
        ArrayList<Integer> listnum = new ArrayList<>();
        for(int i=0; i<k ; i++){
            listnum.add(arr.get(i));

        }

        unfairness = listnum.get(k-1) - listnum.get(0);


        return unfairness;
    }
}
