package hw5.proxypat;

public class Image implements ImageLoader{
    private String imageName;

    public Image(String name){
        imageName = name;
    }

    public String getName(){
        return imageName;
    }
    @Override
    public void loadThumbnail() {
        System.out.println("Loading thumbnail");
    }

    @Override
    public void loadFullImage() {
        System.out.println("Loading full image");
    }
}
