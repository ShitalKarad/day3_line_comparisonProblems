package com.brigelabz;

import static java.lang.Math.sqrt;

public class LineComparison {
    static int x1 = 2;
    static int x2 = 5;
    static int y1 = 3;
    static int y2 = 5;
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");


       double LengthOfLine1 = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2);
        double LengthOfLine2 = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2);
        System.out.println("Length of line is "+LengthOfLine1 );
        System.out.println("Length of line is "+LengthOfLine1 );

        if (String.valueOf(LengthOfLine1).equals(String.valueOf(LengthOfLine2)) ){
            System.out.println("Two lines are equal");

        } else if (LengthOfLine1>LengthOfLine2) {
            System.out.println("LengthOfLine1 is greater than LengthOfLine2 " + LengthOfLine1);

        } else {
            System.out.println("LengthOfLine2 is greater than LengthOfLine1 "+ LengthOfLine2);
        }
    }

}
