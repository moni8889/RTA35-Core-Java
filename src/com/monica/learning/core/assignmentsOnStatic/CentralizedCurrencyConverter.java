package com.monica.learning.core.assignmentsOnStatic;

class CurrencyConverter {
    //static final variables
    static final double USD_TO_INR = 82.5;
    static final double EUR_TO_INR = 90.0;

    //static methods to convert USD to INR
    public static double convertUSDtoINR(double amountUSD){
        return amountUSD * USD_TO_INR;
    }
    //static method to convert EUR to INR
    public static double convertEURtoINR(double amountEUR){
        return amountEUR * EUR_TO_INR;
    }
}

public class CentralizedCurrencyConverter {

    public static void main(String[] args) {
        double amountInUSD = 100;
        //static method call to convert USD to INR using class name
        System.out.println("Amount in USD: " + amountInUSD + " is equal to INR: " + CurrencyConverter.convertUSDtoINR(amountInUSD));

        double amountInEUR = 50;
        //static method call to convert EUR to INR using class name
        System.out.println("Amount in EUR: " + amountInEUR + " is equal to INR: " + CurrencyConverter.convertEURtoINR(amountInEUR));
    }
}
