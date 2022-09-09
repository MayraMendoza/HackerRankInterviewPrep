package com.HackerRankInterviewPrep.week1;

import javax.xml.transform.Result;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class PlusMinus {

    /*Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with 6 places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to (10^-4) are acceptable.
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus1(List<Integer> arr) {
        // Write your code here
        double positive =0;
        double negative =0;
        double zero = 0;

        for (int i = 0; i < arr.size(); i++){
            if(arr.get(i)<0){

                negative = negative + 1;

            } else if (arr.get(i)==0){
                zero = zero + 1;

            } else if( arr.get(i)>0){
                positive = positive + 1;
            }
        }
        double positiveTotal = positive / (arr.size());
        double negativeTotal = negative / (arr.size());
        double zeroTotal = zero / (arr.size());


        System.out.printf("%6f%n%6f%n%6f%n", positiveTotal,  negativeTotal, zeroTotal);



    }

}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        Result.(arr);
//
//        bufferedReader.close();
//    }
//}



