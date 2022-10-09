package com.HackerRankInterviewPrep.week2;

import java.util.List;

/**
 * a game involving a matrix where each cell of the matrix contains an integer.
 * He can reverse any of its rows or columns any number of times. The goal of the game is to maximize the sum of
 * the elements in the submatrix located in the upper-left quadrant of the matrix.
 * Given the initial configurations for matrices, help Sean reverse the rows and columns of each matrix in the
 *
 * best possible way so that the sum of the elements in the matrix's upper-left quadrant is maximal.
 */

public class FlippingTheMatrix {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
        int position = matrix.size() - 1;
        int overallMaxSum = 0;
        for (int i = 0; i < matrix.size() / 2; i++) {
            for (int j = 0; j < matrix.size() / 2; j++) {
                int max1 = Math.max(matrix.get(i).get(j), matrix.get(position -
                        i).get(position - j));
                int max2 = Math.max(matrix.get(position - i).get(j),
                        matrix.get(i).get(position - j));
                int overallMax = Math.max(max1, max2);
                overallMaxSum += overallMax;
            }
        }
        return overallMaxSum;
    }
}
