package com.monica.learning.core.assignmentsOnStatic;

class StaticCounter{
    private static int transactionCounter = 10000;
    private int transactionID;//unique for each transaction
    private String payerName;
    private double amount;
    private String paymentMode;

    //Constructor
    public StaticCounter(String payerName, double amount, String paymentMode){
        transactionCounter++;
        this.transactionID = transactionCounter;
        this.payerName = payerName;
        this.amount = amount;
        this.paymentMode = paymentMode;
    }

    //this method is for displaying the transaction details
    public void displayTransaction(){
        System.out.println("Transaction ID:  "  + transactionID  +  " Payer Name: " + payerName +  " Amount: " + amount  +  " Payment Mode: " + paymentMode);

    }

}

public class UniqueTransactionIDPaymentSystem {
    public static void main(String[] args) {
        StaticCounter transaction1 = new StaticCounter("Yash", 1000, "Credit Card");
        transaction1.displayTransaction();
        StaticCounter transaction2 = new StaticCounter("Monica", 2000, "PayPal");
        transaction2.displayTransaction();
        StaticCounter transaction3 = new StaticCounter("Gardas",3000,"Net banking");
        transaction3.displayTransaction();

    }
}
