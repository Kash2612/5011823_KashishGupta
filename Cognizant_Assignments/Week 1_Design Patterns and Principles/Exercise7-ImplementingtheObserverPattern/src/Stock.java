public interface Stock {
    void register(PriceListener listener);
    void deregister(PriceListener listener);
    void notifyListener();
}
