package com.HackerRankInterviewPrep.week4;

/**
 * Two players are playing a game of Tower Breakers! Player 1 always moves first, and both players always play optimally.The rules of the game are as follows:
 *
 * Initially there are n towers.
 * Each tower is of height m.
 * The players move in alternating turns.
 * In each turn, a player can choose a tower of height x and reduce its height to y, where 1<= y<x and y evenly divides x .
 * If the current player is unable to make a move, they lose the game.
 * Given the values of n and m , determine which player will win. If the first player wins, return 1 . Otherwise, return 2 .
 * constraints :
 * 1 <= t< 100
 * 1 <= n, m< 10^6
 *
 * example original n=2 m=6
 * tower 1
 * 6--> 3 (6%3==0)
 * 3-->1 ( 3-2=1 )  x=3  y=1  3%1==0
 *
 *
 *
 * tower 2
 * 6--> 3 (6%3==0)
 *
 */
public class TowerBreakers {
    public static int towerBreakers(int n, int m) {
        // Write your code here
        // if n is an odd number than 1 will win --> 1(1 will win) 2 doesn't have moves. 3 = 2 will run out of moves faster
        // test m (height) - if its even or odd - how would that impact outcome .
        // would m ever be odd?

        // **move 5 and leaves 1** 1 is divisible by future remove  ???
        //



    }
}

//if( n% 2!= 0){
//        return 1;
//    }
//    else{
//        return 2;
//    }
