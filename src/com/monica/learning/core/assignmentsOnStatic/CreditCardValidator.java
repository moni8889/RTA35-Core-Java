package com.monica.learning.core.assignmentsOnStatic;

class CardProcessor {
    //static nested class
    public static class CreditCardValidator{

        //static method
        public static boolean isValidCard(String CardNumber){
            System.out.println(" Validating Credit Card....");
            if (CardNumber.startsWith("4")) {
                System.out.println("This card with no. " + CardNumber + " is a valid Visa card");
                return true;
            } else if (CardNumber.startsWith("5")) {
                System.out.println("This card with no. " + CardNumber + " is a valid Master card");
                return true;
            } else {
                System.out.println("This card with no. " + CardNumber + " is not a valid card");
                return false;
            }
        }
    }
}

public class CreditCardValidator {
    public static void main(String[] args) {
        CardProcessor.CreditCardValidator.isValidCard("4532 1234 5678 9876");
        CardProcessor.CreditCardValidator.isValidCard("5532 1234 5678 9876");
        CardProcessor.CreditCardValidator.isValidCard("6532 1234 5678 9876");
    }
}
