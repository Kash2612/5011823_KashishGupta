public class MobileApp implements PriceListener {
    private String name;
    public MobileApp(String name){
        this.name=name;

    }

    @Override
    public void update(double stockPrice){
        System.out.println("App " + name + ": Stock Price updated to " + stockPrice);
    }
}
