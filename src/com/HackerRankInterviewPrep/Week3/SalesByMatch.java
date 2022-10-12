package com.HackerRankInterviewPrep.Week3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SalesByMatch {
    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     *
     */

    /**
     * There is a large pile of socks that must be paired by color.
     * Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
     * @param n
     * @param ar
     * @return
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        // ideas make a hashset and go through each one % if =0 then go count how many divide by two.
        // devide by two if a whole number count. (round down?)
        Collections.sort(ar);
        HashMap<Integer,Integer> colorPairs = new HashMap<Integer, Integer>();
        for( int i =0; i<ar.size(); i++){
            Integer color = colorPairs.get(ar.get(i));
            // System.out.println(ar.get(i));
            if(colorPairs.get(ar.get(i)) == null){
                colorPairs.put(ar.get(i),1);

            }else {
                System.out.print("else");
                colorPairs.put(ar.get(i), color+1);
            }

        }
        System.out.print("hashmap");
        for(int i = 0 ; i< colorPairs.size(); i++){
            System.out.print(colorPairs.get(i));



        }
        System.out.print(colorPairs);
        return 0;

    }

}
