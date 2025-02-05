package com.monica.learning.core.ControlFlowStatements;

public class ConditionalStatements {

    public static void main(String[] args) {

        System.out.println("Main method started");

        ifElseStatements();
        System.out.println("Main method ended");
    }

    private static void ifElseStatements() {
        System.out.println(" Entering ifElseStatements");
        int age = 15;
        String name = new String("Monica");

        if ( age >= 18 && name.equalsIgnoreCase("Monica")){
            System.out.println("Monica, you are an adult");
        } else if ( age >=21){
            System.out.println("You are an adult");
        } else if (!name.equalsIgnoreCase("Monica")) {
            System.out.println(" You are not monica");
        } else {
            System.out.println("you are Minor");
        }
        System.out.println(" Exiting ifElseStatements ");
    }
}
