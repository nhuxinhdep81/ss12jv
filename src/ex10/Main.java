package ex10;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard(1020);
        PaymentMethod debitCard = new DebitCard(1010);
        PaymentMethod cash = new Cash(1000);

        System.out.println("------------Credit Card--------------");
        System.out.println("Total payment: " + creditCard.processPayment());
        System.out.println("Total payment (USD): " + creditCard.processPayment("USD"));
        System.out.println();

        System.out.println("------------Debit Card--------------");
        System.out.println("Total payment: " + debitCard.processPayment());
        System.out.println("Total payment (EUR): " + debitCard.processPayment("EUR"));
        System.out.println();

        System.out.println("------------Cash--------------");
        System.out.println("Total payment: " + cash.processPayment());
        System.out.println("Total payment (JPY): " + cash.processPayment("JPY"));
    }
}

