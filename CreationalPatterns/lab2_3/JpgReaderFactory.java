package lab2_3;

public class JpgReaderFactory implements ImageReaderFactory {
    public ImageReader createImageReader(){
        return new JpgReader();
    }
}
