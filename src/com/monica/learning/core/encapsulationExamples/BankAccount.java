package com.monica.learning.core.encapsulationExamples;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    //getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    //constructor to initialize the account
    public BankAccount(String accountNumber,String accountHolderName ,double initialDeposit ) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        if (balance > 0) {
           this.balance = initialDeposit ;
            System.out.println("Initial Balance is :" + balance);
        } else {
            System.out.println("Initial Balance should not be negative.");
        }
    }

    public void deposit(double amount) {
        if( amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " .New balance " + balance );
        } else {
            System.out.println( "Deposited amount must be positive ");
        }
    }

    public void withdraw(double amount) {
        System.out.println("Withdraw amount is :" + amount);
        if (amount > 0 && amount < balance) {
                balance -= amount;
                System.out.println("Withdraw " + amount + ".New balance " + balance);
            } else if(amount == balance) {
                System.out.println("Insufficient funds \n");
            }else if (amount > balance){
            System.out.println(" Balance should not be negative");
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    public void displayBalance() {
        System.out.println("Current balance :" + balance);
    }

    public static void main(String[] args) {
        System.out.println("\n \tBank account using Encapsulation");

        BankAccount account1 = new BankAccount("12345", "Monica", 500);
        System.out.println("\nAccount Number :" + account1.getAccountNumber() + ", Account Holder :" + account1.getAccountHolderName());
        account1.deposit(300);
        account1.withdraw(1000);
        account1.displayBalance();

        BankAccount account2 = new BankAccount("67890" ,"yash" , 1000);
        System.out.println("\nAccount Number :" + account2.getAccountNumber() + ",Account Holder : " + account2.getAccountHolderName());
        account2.deposit(2000);
        account2.withdraw(500);
        account2.withdraw(100);
        account2.displayBalance();

        BankAccount account3 = new BankAccount("45679" ,"Deetya" , 700);
        System.out.println("\nAccount Number : " + account3.getAccountNumber() + ",Account Holder :" + account3.getAccountHolderName());
        account3.deposit(100);
        account3.withdraw(500);
        account3.withdraw(100);
        account3.displayBalance();

    }
}
