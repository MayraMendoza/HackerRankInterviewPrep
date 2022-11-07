package com.HackerRankInterviewPrep.week4;

import java.util.Collections;
import java.util.List;

/**
 * Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1.
 */

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        // this will sort array
        Collections.sort(a);
        // now go through the array
        int countLongestSubarray = 0;
        int count =0;


        for(int i = 0; i < a.size();i++){
            count =0;
            if(i>1 && Math.abs(a.get(i-1)+ a.get(i))<=1){
                count = count+1;
            }
            for(int j = 0+i; j < a.size(); j++ ){
                System.out.print("this");
                System.out.println("i"+a.get(i));
                System.out.println("j" + a.get(j));
                if(Math.abs(a.get(i)- a.get(j))<=1) {
                    count++;
                    System.out.println(count);
                }
            }
            if(countLongestSubarray<count && count<= a.size()) {
                countLongestSubarray = count;
                count = 0;
            }
        }
        return countLongestSubarray;
    }
}


