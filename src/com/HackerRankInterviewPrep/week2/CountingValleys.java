package com.HackerRankInterviewPrep.week2;

/**
 * An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly steps  steps, for every step it was noted if it was an uphill, u , or a downhill D ,  step. Hikes always start and end at sea level, and each step up or down represents a 1 unit change in altitude. We define the following terms:
 *
 * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
 * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
 * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
 */

public class CountingValleys {

//    public static int countingValleys(int steps, String path) {
//        return 0;
//
//        DDUUDDUDUUUD
      // where d is down and u is up\
    // mountain - consecutive steps above sea level. - starting with a step up from sea level and ending with a step  down to sea level

    // valley - consecutive steps below sea level, starting with a step down to sea level and ending with a step up to sea level
    //
    int position =0;
    // D = -1 , U = 1, sea level =0;

    //  if position = 0 , if u if u = valley -> count 1
    // now you are in the negative if you go to a positive/o then other valley.

    // CAN DO A BOOLEAN

//
//
//    }


}
