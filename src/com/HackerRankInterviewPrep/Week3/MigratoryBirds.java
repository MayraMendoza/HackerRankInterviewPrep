package com.HackerRankInterviewPrep.Week3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type.
 * If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
 * arr= [1,1,2,2,3]
 * There are two each of types 1 and 2, and one sighting of type 3 . Pick the lower of the two types  seen twice: type 1.
 */

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> birdAppearanceById = new HashMap<Integer, Integer>();

        for( int i = 0 ; i< arr.size(); i++){
            Integer idCount = birdAppearanceById.get(arr.get(i));
            // System.out.println(idCount);
            if(birdAppearanceById.get(arr.get(i)) == null ){
                birdAppearanceById.put(arr.get(i),1);

            }else{

                System.out.print(arr.get(i));
                birdAppearanceById.put(arr.get(i),idCount+1);
            }
        }

        //comparingByKey()
         //Returns a comparator that compares Map.Entry in natural order on key.

        int maxSighting = Collections.max(birdAppearanceById.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.print(birdAppearanceById.entrySet());
        System.out.print(Map.Entry.comparingByValue());

        return maxSighting;
    }
}
