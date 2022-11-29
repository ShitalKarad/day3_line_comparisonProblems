package com.brigelabz;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LineComparisonMain {
    public static void main(String[] args) {
        LineComaparisonImpl lineComapar = new LineComaparisonImpl();
        LineComparison lineComparison = lineComapar.setCompareValues();
        lineComapar.geometryCalculation(lineComparison);
        lineComapar.compareOrEqual();

         }


}
