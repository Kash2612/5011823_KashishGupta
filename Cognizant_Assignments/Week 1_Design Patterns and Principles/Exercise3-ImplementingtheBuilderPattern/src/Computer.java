public class Computer {
    private String CPU;
    private String RAM;
    private String storage;

    private boolean hasGraphicsCard;
    private boolean hasBluetooth;
    private boolean hasWifi;

    private Computer(Builder builder){
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.storage=builder.storage;
        this.hasGraphicsCard=builder.hasGraphicsCard;
        this.hasBluetooth=builder.hasBluetooth;
        this.hasWifi=builder.hasWifi;
    }

    @Override
    public String toString(){
        return "Computer Configurations [CPU=" + CPU + ", RAM=" +RAM+",Storage" + storage+"" +
                ", Graphics Card=" + hasGraphicsCard+", Bluetooth"+hasBluetooth+
                ", Wifi=" +hasWifi+"]";
    }
    public static class Builder{
        private String CPU;
        private String RAM;
        private String storage;

        private boolean hasGraphicsCard=false;
        private boolean hasBluetooth=false;
        private boolean hasWifi;

        public Builder(String CPU, String RAM, String storage){
            this.CPU=CPU;
            this.RAM=RAM;
            this.storage=storage;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard){
            this.hasGraphicsCard=hasGraphicsCard;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth){
            this.hasBluetooth=hasBluetooth;
            return this;
        }

        public Builder setWifi(boolean hasWifi){
            this.hasWifi=hasWifi;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }



    }
}


