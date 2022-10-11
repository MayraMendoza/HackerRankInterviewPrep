package com.HackerRankInterviewPrep.week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Quicksort usually has a running time of n x log(n), but is there an algorithm that can sort even faster? In general, this is not possible.
 * Most sorting algorithms are comparison sorts, i.e. they sort a list just by comparing the elements to one another.
 * A comparison sort algorithm cannot beat n x log(n) (worst-case) running time, since n x log(n) represents the minimum number of comparisons
 * needed to know where to place each element. For more details, you can see these notes (PDF).
 *
 * Alternative Sorting
 * Another sorting method, the counting sort, does not require comparison.
 * Instead, you create an integer array whose index range covers the entire range of values in your array to sort.
 * Each time a value occurs in the original array, you increment the counter at that index. At the end,
 * run through your counting array, printing the value of each non-zero valued index that number of times.
 */

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0 ; i<100; i++){
            if( map.get(i)== null ){
                map.put((i), 0);
            }
        }
        for(int i =0; i< arr.size();i++){
            Integer c = map.get(arr.get(i));
            if(true){
                map.put(arr.get(i), ++c);
            }
        }
        for (int i=0; i<100; i++){

            Integer mapValue = map.get(i);
            answer.add(mapValue);
        }

        return answer;

    }

}
