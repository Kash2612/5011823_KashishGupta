import java.util.ArrayList;
import java.util.List;


public class StockMarket implements Stock{
    private List<PriceListener> listeners;
    private double stockPrice;

    public StockMarket(){
        listeners=new ArrayList<>();

    }

    @Override
    public void register(PriceListener listener){
        listeners.add(listener);

    }

    @Override
    public void deregister(PriceListener listener){
        listeners.remove(listener);
    }

    @Override
    public void notifyListener(){
        for(PriceListener listener:listeners){
            listener.update(stockPrice);
        }
    }

    public void setStockPrice(double stockPrice){
        this.stockPrice=stockPrice;
        notifyListener();
    }
}
