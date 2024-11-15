package org.jtj.bank;

public class Main {
    public static void main(String[] args) {
        Customer john = new Customer("John", 1000.0);

        john.addTransaction(500.0);
        john.addTransaction(-200.0);

        System.out.println("Customer Name: " + john.getName());
        System.out.println("Transactions: " + john.getTransactions());
    }
}
