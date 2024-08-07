public class TestStrategy {
    public static void main(String[] args) {
        PaymentContext pc = new PaymentContext();
        PaymentStrategy cPay=new CreditCardPayment("1234 5278 8795 4122" , "Rosy" , "03/28" , "569");
        pc.setPayStrategy(cPay);
        pc.executePay(500);

        PaymentStrategy PPpay=new PayPalPayment("abc@test.com" , "passcode");
        pc.setPayStrategy(PPpay);
        pc.executePay(600);
    }
}
