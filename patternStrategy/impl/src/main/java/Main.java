import order.Order;
import payment.CreditCardPayment;
import payment.InCashPayment;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1000);
        Order order2 = new Order(2000);

        order1.setPaymentStrategy(new CreditCardPayment(1938194));
        order2.setPaymentStrategy(new InCashPayment());

        order1.processPayment();
        order2.processPayment();
    }
}
