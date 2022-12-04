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

//
//    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
//        // Write your code here
//
//        Collections.sort(arr);
//        System.out.print(arr);
//        Collections.sort(brr);
//        System.out.print(brr);
//
//
//        //find which elements in the second array are missing from the first array.
//        ArrayList<Integer> missingNum = new ArrayList<Integer>();
//        int count =0;
//        for (int i=0; i<arr.size(); i++){
//            int k =0;
//            for( int j=k+i ; j<brr.size(); j++){
//                if( (brr.get(i)).equals(arr.get(j)) ){
//                    System.out.println("mathced "+ i +" "+j);
//                    // k++;
//
//                    break;
//
//                }else{
//                    System.out.println("meow");
//                    System.out.println(j+ " no match");
//                    missingNum.add(brr.get(j));
//                    k++;
//                    System.out.print(k + "k");
//
//
//
//                }
//
//                break;
//            }
//
//        }
//        return missingNum;
//
//    }
