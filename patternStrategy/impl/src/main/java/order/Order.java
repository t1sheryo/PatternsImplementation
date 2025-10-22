package order;

import payment.Payment;

public class Order {
    private double total;
    private Payment paymentStrategy;

    public Order(double total) {
        this.total = total;
    }

    public void setPaymentStrategy(Payment strategy) {
        this.paymentStrategy = strategy;
    }

    public void processPayment() {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Способ оплаты не выбран");
        }
        paymentStrategy.pay(total);
    }
}