public class TestAdapter {
    public static void main(String[] args) {
        PaymentProcessor payment=new PaytmAdapter(new Paytm());
        payment.processPayment(100);

        PaymentProcessor stripe=new StripeAdapter(new Stripe());
        stripe.processPayment(400);

        PaymentProcessor square=new SquareAdapter(new Square());
        square.processPayment(500);
    }
}
