package com.HackerRankInterviewPrep.Week3;

import java.util.Collections;
import java.util.List;
/**
 * There are two n-element arrays of integers, A and B . Permute them into some A' and B' such that the relation A'[i] + B[i] >= k holds for all i where 0<=i<n .
 *
 * There will be  q queries consisting of A, B, K and . For each query, return YES if some permutation A' ,B'  satisfying the relation exists. Otherwise, return NO.
 */

public class PermutingTwoArrays {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        Collections.sort(A);
        Collections.sort(B);
        int newJ = 0;

        boolean isGreater =false;
        for(int i=0; i<A.size(); i++){
            for(int j =newJ; j<B.size(); j++){
                System.out.println("j"+j);

                System.out.println(A.get(i)+" "+B.get(i));
                if(A.get(i)+B.get(j)>= k){

                    isGreater =true;
                    newJ++;


                }

            }
            if(isGreater == false ){
                System.out.print("false");
                return "NO";
            } else {
                isGreater = false;
            }
        }
        return "YES";

    }
}

