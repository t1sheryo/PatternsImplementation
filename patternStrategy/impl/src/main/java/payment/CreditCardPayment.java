package payment;

public class CreditCardPayment implements Payment {
    private final int cardNumber;

    public CreditCardPayment(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with credit card number " + cardNumber);
    }
}
