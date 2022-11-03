package com.HackerRankInterviewPrep.week4;

import java.util.ArrayList;

/**
 * A numeric string, s , is beautiful if it can be split into a sequence of two or more positive integers,a[1], a[2]..a[n] , satisfying the following conditions:
 *
 *
 * 1. a[i]- a[i-1]=1  for any 1<i<= n (i.e., each element in the sequence is 1 more than the previous element).
 * 2. No a[i]  contains a leading zero. For example, we can split s= 10203 into the sequence {1, 02,03 }, but it is not beautiful because  02 and 03 have leading zeroes.
 * The contents of the sequence cannot be rearranged. For example, we can split s= 312 into the sequence {3,2,1}, but it is not beautiful because it breaks our first constraint (i.e., 1-3 != 1 ).
 * The diagram below depicts some beautiful strings:
 *
 *
 * Perform q queries where each query consists of some integer string s . For each query, print whether or not the
 * string is beautiful on a new line. If it is beautiful, print YES x, where x is the first number of the increasing sequence. If there are multiple such values of x , choose the smallest. Otherwise, print NO.
 */

public class SeparateTheNumbers {
    public static void separateNumbers(String s) {
        // Write your code here
        int initialNumber = 0;
        String news= "";
        ArrayList<String> newString = new ArrayList<>();

        for(int i= 0 ; i<s.length()-1; i++){

            if(Character.valueOf(s.charAt(0))>Character.valueOf(s.charAt(0))){
                System.out.print("test");
            }





        }
        System.out.print(news);


    }
}
