public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String cardExpiry;
    private String cardCVV;

    public CreditCardPayment(String cardNumber, String cardHolderName, String cardExpiry, String cardCVV){
        this.cardNumber=cardNumber;
        this.cardHolderName=cardHolderName;
        this.cardExpiry=cardExpiry;
        this.cardCVV=cardCVV;
    }

    @Override
    public void pay(double amount){
        System.out.println("Paying Rs " +amount+ " using Credit Card.");

    }
}
