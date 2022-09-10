package com.HackerRankInterviewPrep.week1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        NumberFormat usa = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaa = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaa = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat francee = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = usa.format(payment);
        String india = indiaa.format(payment);
        String china = chinaa.format(payment);
        String france = francee.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
