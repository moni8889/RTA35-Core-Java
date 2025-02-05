package com.monica.learning.core.operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 100;

        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isSmaller = a < b;
        boolean isGreaterOrEqual = a >= b;
        boolean isSmallerOrEqual = a <= b;

        System.out.println(" IsEqual ::" + isEqual);
        System.out.println(" IsNotEqual ::" + isNotEqual);
        System.out.println(" isGreater ::" + isGreater);
        System.out.println(" isSmaller ::" + isSmaller);
        System.out.println(" isGreaterOrEqual::" + isGreaterOrEqual);
        System.out.println("  isSmallerOrEqual ::" +  isSmallerOrEqual);



        if (a==b){

            System.out.println(a * b);
        } else if (a > b){
            System.out.println( " a is greater than b");
        }

        if ( a != b) {

            System.out.println( "a != b");
        }

        if (a <= b){
            System.out.println("a <= b");
        }
    }
}
