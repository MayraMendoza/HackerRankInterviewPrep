package com.HackerRankInterviewPrep.Week3;


/**
 * A teacher asks the class to open their books to a page number. A student can either start turning pages from the front of the book or from the back of the book.
 * They always turn pages one at a time. When they open the book, page  is always on the right side:
 *
 * When they flip page 1 , they see pages 2 and 3. Each page except the last page will always be printed on both sides.
 * The last page may only be printed on the front, given the length of the book. If the book is n pages long,
 * and a student wants to turn to page p , what is the minimum number of pages to turn? They can start at the beginning or the end of the book.
 *
 * Given n and p, find and print the minimum number of pages that must be turned in order to arrive at page p.
 */
public class DrawingBook {
    public static int pageCount(int n, int p) {
        // Write your code here
        // n = total page
        // P = desired page

        int frontToBack =0;
        int backToFront= 0;
        boolean oddOrEven;
        if( p % 2 ==0 ){
            oddOrEven = true;
        }else {
            oddOrEven =false;
        }

        // n=5 p=4
        //front to back check
        if (oddOrEven== true){
            frontToBack = p /2;
            backToFront= (n-p)/2;
            // System.out.print ("even" + frontToBack + " " +backToFront);
        } else {
            frontToBack = (p-1)/2;
            backToFront = (int) Math.ceil((double
                    )(n-p)/2);
            // System.out.print ("odd" + frontToBack + " " +backToFront);
        }

        return Math.min(frontToBack, backToFront);


    }


    public static void main(String[] args) {
        System.out.print((int) Math.ceil((double)(1)/2));
    }
}
