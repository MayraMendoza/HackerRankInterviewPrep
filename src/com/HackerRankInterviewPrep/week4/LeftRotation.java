package com.HackerRankInterviewPrep.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A left rotation operation on an array of size n shifts each of the array's elements  unit to 1 the left.
 * Given an integer, d, rotate the array that many steps left and return the result.
 */

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int arraySize= arr.size();

        ArrayList<Integer> Rotation = new ArrayList<>(Collections.nCopies(arraySize, 0));

        for(int i=0 ; i<arr.size(); i++){
            int number = arr.get(i);
            int moveToIndex = i-d;

            if(moveToIndex <0){
                moveToIndex = (moveToIndex + arr.size());
                Rotation.set(moveToIndex, number);
            }else{
                Rotation.set(moveToIndex, number);
            }
        }
        return Rotation;

    }

}
