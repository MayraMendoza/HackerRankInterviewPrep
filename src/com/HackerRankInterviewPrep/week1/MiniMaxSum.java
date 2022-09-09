package com.HackerRankInterviewPrep.week1;

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

class MiniMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing
     *  exactly four of the five integers. Then print the respective minimum and maximum values as a single
     * line of two space-separated long integers.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        long minimum= 0;
        long maximum = 0;
        for(int i = 0 ; i<arr.size()-1; i++){
            minimum = minimum + arr.get(i);

        }
        for(int j =1; j< arr.size(); j++){
            maximum=maximum + arr.get(j);

        }
        // List<Long> result = new ArrayList<Long>();
        // result.add(minimum);
        // result.add(maximum);

        System.out.print(minimum+" "+maximum);



    }

}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        Result.miniMaxSum(arr);
//
//        bufferedReader.close();
//    }
//}