package com.HackerRankInterviewPrep.week2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    /**
     * HackerLand University has the following grading policy:
     *
     * Every student receives a grade in the inclusive range 0 from 100 to .
     * Any  grade less than 40 is a failing grade.
     * Sam is a professor at the university and likes to round each student's  grade according to these rules:
     *
     * If the difference between the  grade and the next multiple of 5 is less than 3 , round grade  up to the next multiple of 5 .
     * If the value of grade  is less than  38, no rounding occurs as the result will still be a failing grade.
     * @param grades
     * @return
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        for(int i = 0 ; i<grades.size(); i++){
            int grade = grades.get(i);
            // System.out.println("o " + grade);
            if (grade >= 38){
                if((grade +1) % 5 == 0){
                    grades.set(i,grade+1 );
                    // System.out.println("2 " + grade);

                } else if ((grade+2) % 5 ==0 ){
                    grades.set(i, grade +2);
                    // System.out.println("3 " + grade);
                }

            }

        }
        return grades;
    }


    public static void main(String[] args) throws IOException {

        ArrayList<Integer> grades = new ArrayList<Integer >();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);



        System.out.println(gradingStudents(grades));


    }
}
