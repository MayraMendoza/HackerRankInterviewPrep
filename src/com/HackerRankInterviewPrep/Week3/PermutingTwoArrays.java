package com.HackerRankInterviewPrep.Week3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * There are two n-element arrays of integers, A and B . Permute them into some A' and B' such that the relation A'[i] + B[i] >= k holds for all i where 0<=i<n .
 *
 * There will be  q queries consisting of A, B, K and . For each query, return YES if some permutation A' ,B'  satisfying the relation exists. Otherwise, return NO.
 */

public class PermutingTwoArrays {

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        // sort natural order ascending

        A.sort(Comparator.naturalOrder());
        // System.out.print(A);
        // sort reverse order. comparator
        // if Collections.reverse() will reverse index not order of numbers.
        B.sort(Comparator.reverseOrder());
        // System.out.print(B);


        for (int i = 0; i < A.size(); i++){
            if (A.get(i) + B.get(i) >= k){
                //continue

            }else{
                return "NO";
            }


        }


        return "YES";
    }
}


