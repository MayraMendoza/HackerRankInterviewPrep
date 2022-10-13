package com.HackerRankInterviewPrep.week2;

import java.util.HashSet;

/**
 * A pangram is a string that contains every letter of the alphabet.
 * Given a sentence determine whether it is a pangram in the English alphabet.
 * Ignore case. Return either pangram or not pangram as appropriate.
 */

 // create hashset to hold letters
    // convert all letters in string to lowercase
    // loop around the string and add letter to the hashset a-z lowercase
    // lenght of hashset determins if its pangrams or not

public class Pangrams {
    public static String pangrams(String s) {
        HashSet<Character> isPangrams = new HashSet<Character>();
        String lowercase = s.toLowerCase();


        for(int i= 0 ; i<s.length(); i++){
            if( lowercase.charAt(i)>= 'a' && lowercase.charAt(i)<= 'z'){
                // System.out.print(lowercase.charAt(i));
                isPangrams.add(lowercase.charAt(i));

            }

        }
        if(isPangrams.size() == 26){
            return "pangram";
        }

        return "not pangram";


    }
}
