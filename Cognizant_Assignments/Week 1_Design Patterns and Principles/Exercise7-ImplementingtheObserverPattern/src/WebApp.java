public class WebApp implements PriceListener {
        private String name;
        public WebApp(String name){
            this.name=name;

        }

        @Override
        public void update(double stockPrice){
            System.out.println("App " + name + ": Stock Price updated to " + stockPrice);
        }
    }

