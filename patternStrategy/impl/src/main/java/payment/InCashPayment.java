package payment;

public class InCashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid in cash");
    }
}
