package com.HackerRankInterviewPrep.week4;

/**
 * Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter by a number of letters.
 * If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet.
 * In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
 */
public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        // pseudocode

        // move each letter in the alphabet by k example (3) once it gets to the end that will be w x y z --> z, a, b, c
        // can use a hashmap where you get index of that letter
        // since k can be 0-100  k can be divided by the number in the alphabet and that number can be rounded.
        // example move everything 27 (27/26 =1.0384 (take decimal and multiply by 26 will equal one. everything will just shift one. ))

        // updated  k (26-k = n ) when number is past n --> n will need to be subtracted. so example if k = 3
        // 26-3 = 23 if index surpasses 26 (will throw out of bound for hashset)
        // but if we subtract n  (26- 23= index will be 3 )
        // - dashes stay the same
        // will need to see how to keep capitalization intact.
        // if statement for dash
        // if only one capitalized letter maybe hold on to that index capatalize later in the end?
        //step 1:
        // make hash map with alphabet
        //
    }
}
