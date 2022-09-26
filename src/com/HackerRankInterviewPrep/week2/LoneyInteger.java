package com.HackerRankInterviewPrep.week2;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Given an array of integers, where all elements but one occur twice, find the unique element.
public class LoneyInteger {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr =  new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);



        lonelyinteger(arr);

        int num = 3^7 ;
        System.out.println("it"+  num);


    }


    public static int lonelyinteger(List<Integer> a) {

        // Write your code here
        int singleNum = a.get(0);

        for (int i = 1; i< a.size(); i++){
            singleNum = singleNum ^ a.get(i);
            System.out.println("num" + singleNum);
        }

        System.out.print(singleNum);
        return singleNum;



    }
}
