package com.monica.learning.core.assignments;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args) {
       /* int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for( int i = 0;i < numbers.length; i++) {
            sum = sum + numbers[i];
         }
        System.out.println(sum); */

        sum();
        sumAndCheckEvenOrOdd();
    }
        public static void sum() {

            int N = 10;
            int sum = (N * (N + 1)) / 2;

            System.out.println("Sum Of First "  +  N  +  "Natural Numbers :" + sum);
        }

        public static void sumAndCheckEvenOrOdd() {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number N :");
            int N = scanner.nextInt();
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += i;
            }
            System.out.println("Sum of First "  +  N  +  " natural numbers:" +sum);

            //check if sum is even or odd
            if ( sum % 2 == 0) {

                System.out.println(" The sum is Even.");
            } else {
                System.out.println(" The sum is Odd.");
            }
            scanner.close();
        }



    }

