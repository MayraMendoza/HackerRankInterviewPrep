package com.HackerRankInterviewPrep.week4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Two words are anagrams of one another if their letters can be rearranged to form the other word.
 *
 * Given a string, split it into two contiguous substrings of equal length. Determine the minimum number of characters to change to make the two substrings into anagrams of one another.
 */
public class Anagrams {
    public static int anagram(String s) {
        // Write your code here
        // if string is an odd number return -1
        // 2 - compare each letter see how many are different (subtract
//        difference from lenght = how many will need to be changed so string a will be
//        the same as string b).
        ArrayList<Character> firstHalf = new ArrayList<>();
        ArrayList<Character> secondHalf = new ArrayList<>();
        String fHalf = "";
        String sHalf= "";
        int stringSize = s.length();
        int halfString =0;
        System.out.println(s);
        int difference =0;
        if( stringSize %2 == 0){
            halfString = stringSize /2;
            fHalf = s.substring(0, halfString);
            sHalf = s.substring(halfString);
            System.out.println(fHalf + " " + sHalf);
            for(int i =0; i<fHalf.length(); i++){
                firstHalf.add(fHalf.charAt(i));
                secondHalf.add(sHalf.charAt(i));
            }
            Collections.sort(firstHalf);
            Collections.sort(secondHalf);
            for(int j =0; j<fHalf.length();j++ ){
                if(firstHalf.get(j)!= secondHalf.get(j)){
                    difference++;
                }
            }
        } else{
            return -1;
        }
        //  System.out.print(firstHalf);
        //  System.out.print(secondHalf);
        return difference;
    } }




//
//
//
//
////     ArrayList<Character> firstHalf = new ArrayList<>();
//        // ArrayList<Character> secondHalf = new ArrayList<>();
//
//
//        Map<Character, Integer> firstHalfM = new HashMap<>();
//        Map<Character, Integer> secondHalfM = new HashMap<>();
//        String fHalf = "";
//        String sHalf= "";
//        int stringSize = s.length();
//        int halfString =s.length()/2;
//        System.out.println(s);
//        int difference =0;
//
//        if(stringSize %2== 0){
//        fHalf = s.substring(0, halfString);
//        sHalf = s.substring(halfString);
//        //  System.out.println(fHalf);
//        //  System.out.println(sHalf);
//        for(int i=0; i<stringSize/2;i++){
//
//        if(firstHalfM.containsKey(fHalf.charAt(i))){
//        int n = firstHalfM.get(fHalf.charAt(i))+1;
//        firstHalfM.put(fHalf.charAt(i),n);
//
//        } else{
//        firstHalfM.put(fHalf.charAt(i), 1);
//        }
//
//
//
//
//        }
//
//        for(int i=0; i<stringSize/2;i++){
//
//        if(secondHalfM.containsKey(sHalf.charAt(i))){
//        int n = secondHalfM.get(sHalf.charAt(i))+1;
//        secondHalfM.put(sHalf.charAt(i),n);
//
//        } else{
//        secondHalfM.put(sHalf.charAt(i), 1);
//        }
//
//
//
//
//        }
//
//
//        }
//
//
////      if( stringSize %2 == 0){
////          halfString = stringSize /2;
//
////          System.out.println(fHalf + " " + sHalf);
////          for(int i =0; i<fHalf.length(); i++){
////              firstHalf.add(fHalf.charAt(i));
////              secondHalf.add(sHalf.charAt(i));
////          }
////          Collections.sort(firstHalf);
////          Collections.sort(secondHalf);
////          for(int j =0; j<fHalf.length();j++ ){
////              if(firstHalf.get(j)!= secondHalf.get(j)){
////                  difference++;
////              }
//// }
//        //  } else{
//        //      return -1;
//// }
//        //  System.out.print(firstHalf);
//        //  System.out.print(secondHalf);
//
//        System.out.println(secondHalfM);
//        System.out.println(firstHalfM);
//
//        return difference;
//        }
//
//        // Write your code here
//
//        }
