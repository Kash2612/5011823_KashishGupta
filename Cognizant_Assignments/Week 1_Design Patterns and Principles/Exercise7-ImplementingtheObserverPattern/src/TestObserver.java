public class TestObserver {
    public static void main(String[] args) {
        StockMarket sM=new StockMarket();
        MobileApp mobileApp1 = new MobileApp("App1");
        MobileApp mobileApp2 = new MobileApp("App2");
        WebApp webApp1 = new WebApp("App1");

        sM.register(mobileApp1);
        sM.register(mobileApp2);
        sM.register(webApp1);

        sM.setStockPrice(1002.0); // All observers are notified
        sM.setStockPrice(1005.5); // All observers are notified

        sM.deregister(mobileApp1); // mobileApp1 will no longer receive updates
        sM.setStockPrice(1110.0);
    }
}
