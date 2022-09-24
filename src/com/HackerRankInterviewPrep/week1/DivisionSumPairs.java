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

class DivisionSumPairs {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * 	Submissions	Leaderboard	Discussions	Editorial
     * Given an array of integers and a positive integer k, determine the number of (i,j)  pairs where i<j  and ar[i] + ar[j]  is divisible by k.
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * make sure  i< j.
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        int ii = 0;
        int jj =0;
        int isDivisable = 0;

        //(i,j)

        for(int i = 0 ; i< n; i++){
            // first index
            ii= ar.get(i);
            //  System.out.println("ii"+ii);

            for(int j = 0; j<n;j++){
                // only if j is more than i (index)
                if(j> i){
                    jj = ar.get(j);
                    // System.out.println("jj"+jj +""+j);
                    isDivisable = jj +ii;
                    // System.out.println(isDivisable);
                    if(isDivisable % k ==0){
                        count = count +1;
                    }


                }
            }

        }
        return count;

    }

}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        int k = Integer.parseInt(firstMultipleInput[1]);
//
//        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int result = Result.divisibleSumPairs(n, k, ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
