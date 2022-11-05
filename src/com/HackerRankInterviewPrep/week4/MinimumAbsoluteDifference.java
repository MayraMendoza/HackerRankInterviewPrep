package com.HackerRankInterviewPrep.week4;

import java.util.List;

/**
 * The absolute difference is the positive difference between two values a and b , is written |a-b| or |b-a| and they are equal.
 * If a=3   and b=2 ,|3-2|=|2-3|=1  . Given an array of integers, find the minimum absolute difference between any two elements in the array.
 *
 */

public class MinimumAbsoluteDifference {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        int minAbsoluteDiff=1000000000;
        int absoluteDiff =0;

        for(int i= 0; i<arr.size()-1; i++){

            for(int j = 1+i ; j<arr.size(); j++){
                // System.out.println("i "
                // + arr.get(i));
                // System.out.println("j "+arr.get(j));

                absoluteDiff= Math.abs(arr.get(i)- arr.get(j));
                //    System.out.println(absoluteDiff);

                if(absoluteDiff<minAbsoluteDiff){
                    minAbsoluteDiff = absoluteDiff;

                }
            }
            System.out.print(minAbsoluteDiff);
        } return minAbsoluteDiff;

    }
}
