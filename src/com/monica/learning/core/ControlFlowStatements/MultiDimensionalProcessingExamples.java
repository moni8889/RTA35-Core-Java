package com.monica.learning.core.ControlFlowStatements;

public class MultiDimensionalProcessingExamples {

    public static void main(String[] args) {
        loopInsideLoop();
        twoDimensionalArrayProcessing();
        starPattern();
    }

        private static void starPattern(){
        int rows = 5;
        for( int i = 1; i <= rows; i++){
            for( int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        }


    private static void twoDimensionalArrayProcessing(){

        int [][] numbers = {{1,2,3,77}, {4,5,6}, {7,8,9,50,90}};

        for( int row = 0; row < numbers.length ; row++){
            for (int column = 0; column < numbers[row].length; column++){
                System.out.print(numbers[row][column]+ " ");
            }
            System.out.println();
        }
    }


    private static void loopInsideLoop(){

        for (int i = 0;i <=5; i++){
            for (int j = 0; j <= 5; j++){
                System.out.println("i: "+ i + ",j:" + j);
            }
            System.out.println();
        }
    }
}
