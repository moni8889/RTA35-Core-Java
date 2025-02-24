package com.monica.learning.core.polymorphismExamples;

class Payment {
    double amount;
    void processPayment(double amount){
        System.out.println("Payment done");
    }
}
class CreditCardPayment extends Payment{
    @Override
    void processPayment(double amount){
        System.out.println("Payment done with Credit Card : Rs " + amount);
    }
}
class PayPalPayment extends Payment{
    @Override
    void processPayment(double amount){
        System.out.println("Payment done with PayPal: Rs " + amount);
    }
}
class UPIPayment extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Payment done with UPI : Rs " + amount);
    }
}
 public class EcommercePaymentSystem{

    public static void main(String[] args) {
        Payment credit = new CreditCardPayment();
        credit.processPayment(3000);

        Payment payPal = new PayPalPayment();
        payPal.processPayment(4000);

        Payment upi = new UPIPayment();
        upi.processPayment(1000);
    }

}