package com.HackerRankInterviewPrep.week1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     * Given a time in -hour AM/PM format, convert it to military (24-hour) time.

      Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
      - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String amOrPm = s.substring(8);
        int hour = Integer.parseInt(s.substring(0,2));
        String minutes = s.substring(3,5);
        String seconds = s.substring(6,8);
        String hourString= "";

        if( amOrPm.equals("AM")&& hour == 12){
            hour= 00;

        }
        if ( amOrPm.equals("PM")&& hour != 12){
            hour = hour+12;
        }

        if (hour<10){

            hourString= "0"+ Integer.toString(hour);
        } else {
            hourString = Integer.toString(hour);
        }

        return(hourString+":" + minutes + ":" + seconds
        );

    }

}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String result = Result.timeConversion(s);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
