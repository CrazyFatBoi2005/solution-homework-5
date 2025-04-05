package hw5.proxypat;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new Image("imageName");
        ProxyImage proxy = new ProxyImage(image);
        proxy.displayImage();
        proxy.loadImage();
        proxy.displayImage();
    }
}
