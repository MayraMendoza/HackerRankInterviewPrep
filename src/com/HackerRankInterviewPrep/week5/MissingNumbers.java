package com.HackerRankInterviewPrep.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given two arrays of integers, find which elements in the second array are missing from the first array.
 */

public class MissingNumbers {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here

        Collections.sort(arr);
        System.out.print(arr);
        Collections.sort(brr);
        System.out.print(brr);

        //find which elements in the second array are missing from the first array.
        ArrayList<Integer> missingNum = new ArrayList<Integer>();
        int count =0;
        for (int i=0; i<brr.size(); i++){
            // System.out.println(brr.get(i) + " brr");
            // count ++;
            for(int j=0+i; j<arr.size(); j++){
                System.out.println(arr.get(i) + " arr");
                System.out.println(brr.get(i) + " brr");
                if( brr.get(i)== arr.get(j)){
                    j++;

                    break;

                }else{
                    System.out.println("meow");
                    missingNum.add(brr.get(j));

                }
            }

        }
        return missingNum;

    }

}
