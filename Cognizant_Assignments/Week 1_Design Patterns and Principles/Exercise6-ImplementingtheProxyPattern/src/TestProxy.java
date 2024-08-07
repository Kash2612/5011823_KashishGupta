public class TestProxy {
    public static void main(String[] args) {
        Image img1=new ProxyImage("img1.jpg");
        Image img2=new ProxyImage("img2.jpf");

        img1.display();
        System.out.println("");
        
        img2.display();
        System.out.println("");
    }
}
