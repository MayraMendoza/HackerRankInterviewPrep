package com.HackerRankInterviewPrep.Week3;

//o children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
//
//        Lily decides to share a contiguous segment of the bar selected such that:
//
//        The length of the segment matches Ron's birth month, and,
//        The sum of the integers on the squares is equal to his birth day.
//        Determine how many ways she can divide the chocolate.


import java.util.List;

public class SubarrayDivision2 {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        // System.out.println(d +"  " + m);
        // System.out.print(s.size());
        int DiffWaysToDivideBar= 0 ;
        int sum = 0;
        for( int i = 0; i< s.size()-m+1; i++){
            sum+= s.get(i);
            // System.out.println("i" +i);
            for(int j = i+1; j< i+m ; j++){
                sum += s.get(j);
                // System.out.print(" " + j + "");
            }
            if(sum == d){
                DiffWaysToDivideBar++;
                sum =0;
            } else{
                sum=0;
            }
        }
        return DiffWaysToDivideBar;

    }

}

