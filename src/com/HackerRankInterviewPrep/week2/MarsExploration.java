package com.HackerRankInterviewPrep.week2;


/**
 * A space explorer's ship crashed on Mars! They send a series of SOS messages to Earth for help.
 *
 * NASA_Mars_Rover.jpg
 *
 * Letters in some of the SOS messages are altered by cosmic radiation during transmission.
 * Given the signal received by Earth as a string, s , determine how many letters of the SOS message have been changed by radiation.
 */

public class MarsExploration {
    public static int marsExploration(String s) {
        // Write your code here
        // lenght/ 3 (find sos)
        // compare if they are not the same add one.
        // loop will go on for x amount of times (s/3=x).
        for(int i = 0 ; i<s.length()-3; i=+3){
            // 0,1,2 -- 3,4,5, 6,7,8
            for(int j = 0+i ; j<3+i; j++){
                System.out.print(j);

            }

        }



        return 0;

    }
}
