package ex10;

// File: Cash.java
class Cash extends PaymentMethod {
    public Cash(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return 0;
    }

    @Override
    public double processPayment() {
        return amount + calculateFee();
    }

    @Override
    public String processPayment(String currency){
        return processPayment() + " " + currency;
    }
}
