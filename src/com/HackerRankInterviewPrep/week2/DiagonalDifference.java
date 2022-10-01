package com.HackerRankInterviewPrep.week2;

import java.util.List;

public class DiagonalDifference {
//    Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//
//    For example, the square matrix arr  is shown below:
//
//            1 2 3
//            4 5 6
//            9 8 9
//    The left-to-right diagonal = 1+5 +9 =15. The right to left diagonal = 3+5+9=17 . Their absolute difference is |15-17|=2 .
// may be simplified with a while loop.
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here\
        int LtoRDiagonal = 0;
        int addLtoRD =0;
        int rToLDiagonal = 0;
        int addRtoL = 0;


        for(int i =0 ; i< arr.size(); i++){
            for(int j = 0 ; j<arr.get(i).size(); j++){
                // used j == i to make sure i am in a different row.
                if(j== LtoRDiagonal && j ==i){
                    LtoRDiagonal++;
                    addLtoRD += arr.get(i).get(j);

                }
            }
        }

        for(int i =arr.size()-1 ; i>=0 ; i--){
            for(int j = arr.get(i).size()-1 ; j>=0; j--){
                if(j == rToLDiagonal ){
                    rToLDiagonal++;
                    addRtoL += arr.get(i).get(j);
                }
            }
        }
        int diff =  addLtoRD - addRtoL;
        int absoluteDiff =  Math.abs(diff);
        return absoluteDiff;
    }
}
