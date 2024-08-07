public class PaymentContext {
    private PaymentStrategy ps;

    public void setPayStrategy(PaymentStrategy ps){
        this.ps=ps;

    }

    public void executePay(double amount){
        ps.pay(amount);
    }
}
