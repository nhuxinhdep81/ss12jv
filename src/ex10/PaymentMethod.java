package ex10;

public abstract class PaymentMethod {
    protected double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public abstract double processPayment();
    public abstract double calculateFee();
    public abstract String processPayment(String currency);
}
