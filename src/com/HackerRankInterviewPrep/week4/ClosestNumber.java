package com.HackerRankInterviewPrep.week4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting is useful as the first step in many different tasks. The most common task is to make finding things easier, but there are other uses as well.
 * In this case, it will make it easier to determine which pair or pairs of elements have the smallest absolute difference between them.
 */
public class ClosestNumber {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        ArrayList<Integer> allInts = new ArrayList<>();
        arr.sort(Comparator.naturalOrder());
        int smallestDiff = 10000000;
        int small=0;
        for(int i=0; i<arr.size()-1; i++){
            small = arr.get(i+1) - arr.get(i);
            // System.out.println(small);
            if(small < smallestDiff){
                smallestDiff=small;
            }

        }
        System.out.print(smallestDiff);
        for(int j =0; j<arr.size()-1; j++){
            if(arr.get(j+1)- arr.get(j)== smallestDiff){
                allInts.add(arr.get(j));
                allInts.add(arr.get(j+1));
            }

        }
        return allInts;


    }

}
