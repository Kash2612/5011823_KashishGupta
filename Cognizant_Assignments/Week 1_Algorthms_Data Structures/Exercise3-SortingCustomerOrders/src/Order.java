public class Order {
    String OrderId;
    String customerName;
    double totalPrice;

    public Order(String OrderId, String customerName, long totalPrice){
        this.OrderId=OrderId;
        this.customerName=customerName;
        this.totalPrice=totalPrice;
    }

    public double getPrice(){
        return totalPrice;
    }

    public void BubbleSort(Order[] price) {
        for (int i = price.length - 1; i <= 0; i--) {
            for (int j = 0; j < i - 1; i++) {
                if (price[j].getPrice() > price[j + 1].getPrice()) {
                    Order temp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = temp;
                }
            }
        }
    }

        public void quickSort(Order[] price, int low, int high){
            if(low<high){
                int pivot=partition(price, low, high);

                quickSort(price,low,pivot-1);
                quickSort(price,pivot+1, high);
            }
        }

        public int partition(Order[] price, int low, int high){
            Order pivot = price[high];
            int i=low-1;
            for(int k=low;k<high;k++){
                if(price[k].getPrice()<= pivot.getPrice()){
                    i++;

                    Order temp=price[i];
                    price[i]=price[k];
                    price[k]=temp;
                }
            }
            return i+1;
    }


}
