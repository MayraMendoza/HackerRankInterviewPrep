package com.HackerRankInterviewPrep.Week3;

import java.util.Scanner;

/**
 * Given two strings consisting of digits 0 and 1 only, find the XOR of the two strings.
 * rint the string obtained by the XOR of the two input strings in a single line.
 */
public class XORString3 {
    public static String stringsXOR(String s, String t) {
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }

        return res;
    }

    public static void main(String[] args) {

        String s, t;
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        t = in.nextLine();
        System.out.println(stringsXOR(s, t));

    }


//    public static void main(String args[] ) throws Exception {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//        // create scanner to read the two given strings
//        // create for loop to loop around each individual char of string
//        // will need to convert char into a value capable of being XOR
//        // compare each value if true (1) if false(- it will remain unchanged )
//        Scanner scanner = new Scanner(System.in);
//        String firstString = scanner.nextLine();
//        String secondString = scanner.nextLine();
//
//        for(int i = 0 ; i< firstString.length(); i++){
//            char first = firstString.charAt(i);
//            secondString.charAt(i);
//            // int valueOfFirst = first.charValue();
//            if(firstString.charAt(i) == secondString.charAt(i) ){
//
//            }
//
//        }
//    }
}
