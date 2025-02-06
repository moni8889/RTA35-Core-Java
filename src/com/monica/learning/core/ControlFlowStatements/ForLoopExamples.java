package com.monica.learning.core.ControlFlowStatements;

public class ForLoopExamples {

    public static void main(String[] args) {
        multipleVariableOnForLoop();
        infiniteLoop();
        greaterThanOrEqualTo();
        example2();

    }

    private static void multipleVariableOnForLoop() {

        for (int i = 0, j = 10; i <= 10 && j >= 0; i++, j--) {
            System.out.println("i:: " + i +  "j:: " + j);

        }

    }

   private static void infiniteLoop() {
       for (; true; ) {
           System.out.println("Executing for loop");
      }
    }

    private static void greaterThanOrEqualTo() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(" Value of I: " + i);
        }

    }

    private static void example2() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(" Iteration:" + i);
        }

    }
}
