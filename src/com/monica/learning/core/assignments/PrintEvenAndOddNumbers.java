package com.monica.learning.core.assignments;

import java.sql.SQLOutput;

public class PrintEvenAndOddNumbers {

    public static void main(String[] args) {

        System.out.println("Even numbers from 1 to 20 :");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println(" Odd numbers fro 1 to 20 :");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }


    }
}

