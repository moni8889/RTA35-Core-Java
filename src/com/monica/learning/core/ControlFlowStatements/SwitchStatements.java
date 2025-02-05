package com.monica.learning.core.ControlFlowStatements;

import java.util.Scanner;

public class SwitchStatements {


    public static void main(String[] args) {
        System.out.println(" Main Method started");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name of application");
        String name = scan.nextLine();

        switchStatement(name);

        System.out.println("Enter the Age");
        int age = scan.nextInt();

        ifSwitchStatements(age);

        System.out.println("Main Method ended");

        SwitchStatements object3 = new SwitchStatements();

    }

    private static void switchStatement(String name) {

        System.out.println(" Entering switch statements method");

        switch(name) {

            case "straw":
                System.out.println("berry");
                break;
            case "Blue":
                System.out.println("Berry");
                break;
            case "Pine":
                System.out.println("Apple");
                break;
            case "Water":
                System.out.println("melon");
                break;
            default:
                System.out.println("vegetable");
        }
        System.out.println("Exiting Switch statements method");
    }

    private static void ifSwitchStatements(int age){

        switch (age){
            case 18:
                System.out.println(" Minor");
                break;
            case 21:
                System.out.println("adult");
                break;
            default :
                System.out.println(" wrong input");
        }


    }


}
