public class ProxyImage implements Image{
    private String fileName;
    private RealImage real;
    public ProxyImage(String fileName){
        this.fileName=fileName;

    }

    @Override
    public void display(){
        if(real==null){
            real=new RealImage(fileName);
        }
        real.display();
    }
}
