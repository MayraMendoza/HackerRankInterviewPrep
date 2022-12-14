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
        ArrayList<Character> firstHalf = new ArrayList<>();
        ArrayList<Character> secondHalf = new ArrayList<>();
        int count =0;
        int jj=0;
        int halfSize = s.length()/2;
        if( s.length()%2==0){
            String fHalf = s.substring(0,halfSize);
            String sHalf = s.substring(halfSize);
            for (int i= 0; i<halfSize; i++){
                firstHalf.add(fHalf.charAt(i));
                secondHalf.add(sHalf.charAt(i));
            }
            Collections.sort(firstHalf);
            Collections.sort(secondHalf);

            // i search for this letter
            // once its found loop will now continue in index that it was found in

            for(int i=0; i<halfSize; i++){
                for(int j=jj; j<halfSize; j++){
                    if(firstHalf.get(i)== secondHalf.get(j)){
                        jj=j+1;
                        // System.out.println(jj);
                        count ++;
                        break;
                    }

                }
            }



        }else {
            return -1;
        }
        return halfSize- count ;
    }
    }




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

// here we can make two for loops comparing each array
//        for(int i=0; i<stringSize/2;i++){
//            //when i = index 0
//            for(int j=0+i; j<stringSize/2; j++){
//                // check if any of these are present
//                // since both arrays are sorted once j is checked it will go to the next letter.
//                // break
//                // if array doesn't break than add to a counter.
// the counter should return the numbers of letters that will have to be switched.
//
//
//        }
//        }



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
