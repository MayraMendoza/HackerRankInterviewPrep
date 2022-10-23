package com.HackerRankInterviewPrep.week4;

import java.util.List;

/**
 * A left rotation operation on an array of size n shifts each of the array's elements  unit to 1 the left.
 * Given an integer, d, rotate the array that many steps left and return the result.
 */

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        // d the amount spaces needed to rotate to the left
        // arr the array

        // if negative then array lenght  (array size 5) d =5
        //  0-5 =-5
        // moved to index 1


        // array lenght =5  index =1 -5 (-4)
        // moved to index  2

        // arr lenght 5 index = 2 -5 (-3)
        // move to index 3
        // length 5 shift 4
        //
        // 0->1. // 5-4-0=1
        // 1->2. // 5-4 +1 =2
        // 2->3  // 5-4+2 = 3
        // 3->4. // 5-4+3 = 4
        // 4->0.  // 5-4+4




        // different array length 45
        // d =17

        // index 0 - 17 = -17
        // needs to be put in index (27)

        // index 17 --> index 0 ;
        // index 18 --> index 1 ;




    }

}
