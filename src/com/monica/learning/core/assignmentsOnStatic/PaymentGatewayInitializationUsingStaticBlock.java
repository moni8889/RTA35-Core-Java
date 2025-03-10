package com.monica.learning.core.assignmentsOnStatic;

class PaymentGateway {
    static {
        System.out.println("Initializing the Payment Gateway....Loading API keys.....");
    }

    public static void processPayment(String payer, double amount) {
        System.out.println(" Processing payment of $ " + amount + " by " + payer);
    }
}

public class PaymentGatewayInitializationUsingStaticBlock {
    public static void main(String[] args) {
        PaymentGateway.processPayment("Monica", 1000);
        PaymentGateway.processPayment("Rahul", 1500);
    }
}
