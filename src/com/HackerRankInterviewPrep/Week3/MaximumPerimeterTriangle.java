package com.HackerRankInterviewPrep.Week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an array of stick lengths, use 3 of them to construct a non-degenerate triangle with the maximum possible perimeter.
 * Return an array of the lengths of its sides as  3 integers in non-decreasing order.
 *
 * If there are several valid triangles having the maximum perimeter:
 *
 * Choose the one with the longest maximum side.
 * If more than one has that maximum, choose from them the one with the longest minimum side.
 * If more than one has that maximum as well, print any one them.
 * If no non-degenerate triangle exists, return [-1].
 */

public class MaximumPerimeterTriangle {
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        // Write your code here
        Collections.sort(sticks);
        int stickA= 0;
        int stickB=0;
        int stickC=0;
        int a= 0;
        int b=0;
        int c=0;

        for(int i=0; i<sticks.size()-2 ;i++){
            for(int j = i ; j < i+3; j++){
                a = sticks.get(i);
                b= sticks.get(i+1);
                c= sticks.get(i+2);
                System.out.println("oloop "+a  + " "+b +" "+c);
            }
            if( a+b >c && a+c>b && b+c>a){
                System.out.println(a  + " "+b +""+c);
                stickA=a;
                stickB=b;
                stickC=c;

            }


        }
        ArrayList<Integer> result = new ArrayList<>();
        if(stickA ==0){
            result.add(-1);
        }else{
            result.add(stickA);
            result.add(stickB);
            result.add(stickC);

        }
        return result;

    }

}
