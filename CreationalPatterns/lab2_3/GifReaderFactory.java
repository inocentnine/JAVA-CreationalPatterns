package lab2_3;

public class GifReaderFactory implements ImageReaderFactory {
    public ImageReader createImageReader(){
        return new GifReader();
    }
}
