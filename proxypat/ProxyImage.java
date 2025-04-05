package hw5.proxypat;

public class ProxyImage {
    private Image sourceImage;
    private boolean isImageLoaded;

    public ProxyImage(Image img){
        sourceImage = img;
        isImageLoaded = false;
    }

    public void loadImage(){
        if (!isImageLoaded){
            isImageLoaded = true;
        }
    }

    public void displayImage(){
        if(!isImageLoaded) {
            sourceImage.loadThumbnail();
        } else {
            sourceImage.loadFullImage();
        }
    }
}
