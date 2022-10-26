package com.HackerRankInterviewPrep.Week3;

import java.util.List;

public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        b.addAll(a);
        boolean isFactor= false;
        int numberOfFactors = 0 ;

        for(int i=a.get(a.size()-1); i<= b.get(0);i++){
            for(int j = 0; j<b.size(); j++){
                if (i> b.get(j)){
                    if(i%b.get(j)==0){
                        isFactor=true;
                    } else{
                        isFactor=false;
                        break;
                    }
                }else {
                    if(b.get(j)% i==0){
                        isFactor=true;
                    } else{
                        isFactor=false;
                        break;
                    }}
            }
            if(isFactor == true){
                numberOfFactors++;
                isFactor=false;
            }
        }
        return numberOfFactors;
    }
}
