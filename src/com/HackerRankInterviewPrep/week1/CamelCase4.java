package com.HackerRankInterviewPrep.week1;

import java.io.*;
import java.util.*;

public class CamelCase4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        String spliteOrCombine= "";
        String classVariableOrMethod = "";

        while(scanner.hasNext()){
            String newString = scanner.nextLine();
            // System.out.println(newString);
            // System.out.println("hello");
            spliteOrCombine = newString.substring(0,1);
            classVariableOrMethod = newString.substring(2,3);
            // System.out.println(spliteOrCombine +" "+ classVariableOrMethod);

            // newString.replaceAll("[A-Za-z]+","");
            String onlyAlphabet = newString.replaceAll("[^A-Za-z]+","");
            onlyAlphabet = onlyAlphabet.substring(2);
            System.out.println(onlyAlphabet);
            if(spliteOrCombine.equals("S")){

                System.out.println("S-hello");
                if(classVariableOrMethod.equals("M")){
                    System.out.println("M");

                }else if (classVariableOrMethod.equals("C")){
                    System.out.println("C");


                } else if( classVariableOrMethod.equals("V")){
                    System.out.println("V");

                }

            }

            if(spliteOrCombine.equals("C")){
                System.out.println("C");
                if(classVariableOrMethod.equals("M")){
                    System.out.println("M");

                }else if (classVariableOrMethod.equals("C")){
                    System.out.println("C");


                } else if( classVariableOrMethod.equals("V")){
                    System.out.println("V");

                }

            }
            // if s (splite)
            // if c (combine)

            // if M method = lowercase
            // if C class = capatalize
            // if v variable = lowercase all



            // System.out.println(newString);

        }


    }
}
