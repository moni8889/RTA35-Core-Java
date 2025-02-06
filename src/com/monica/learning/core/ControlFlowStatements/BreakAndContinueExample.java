package com.monica.learning.core.ControlFlowStatements;

public class BreakAndContinueExample {
    public static void main(String[] args) {

        simpleContinueExample();
        simpleBreakExample();
        evenNumbersExample();

    }

    private static void simpleContinueExample(){
        for (int i = 0; i < 10; i++){
            if(i % 2 ==0){
                continue;
            }
            System.out.println("i: " + i);
        }
    }

    private static void simpleBreakExample(){
        for ( int i = 0; i < 10; i++){
            if(i == 5){
                break;
            }
            System.out.println(" i: " + i);
        }
    }
    private static void evenNumbersExample(){
        for (int i = 0; i <= 10; i++){
            if(i % 2 !=0){
                continue;
            }
            System.out.println("i: " + i);
        }
    }
}
