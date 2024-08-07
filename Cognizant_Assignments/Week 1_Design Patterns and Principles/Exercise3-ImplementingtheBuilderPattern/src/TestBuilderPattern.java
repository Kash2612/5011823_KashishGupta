public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer laptop = new Computer.Builder("intel i3", "8GB", "256GB" ).build();
        System.out.println(laptop);

        Computer gamingComp= new Computer.Builder("intel i9", "32GB" , "512GB")
                .setGraphicsCard(true)
                .setBluetooth(true)
                .setWifi(true)
                .build();
        System.out.println(gamingComp);
    }
}
