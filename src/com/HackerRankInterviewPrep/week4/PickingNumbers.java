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
        System.out.println(a);
        // now go through the array
        int countLongestSubarray = 0;
        int count =0;

        for(int i=0; i< a.size()-1; i++){
            //System.out.println(a.get(i)+" "+ a.get(i+1));
            //System.out.println( Math.abs(a.get(i+1)- a.get(i)));
            if(Math.abs(a.get(i)- a.get(i+1))<=1){
                //System.out.print("this");
                count++;
                //System.out.println("Count =" +count);

            }else{
                System.out.print("else");
                if(countLongestSubarray<count){

                    countLongestSubarray =count;
                    //System.out.println("Count longest sub"+countLongestSubarray);
                    count = 0;
                }
            }
            countLongestSubarray =count;

        }



        return countLongestSubarray;
    }
}


