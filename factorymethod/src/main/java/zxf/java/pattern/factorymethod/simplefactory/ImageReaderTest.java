package zxf.java.pattern.factorymethod.simplefactory;

import zxf.java.pattern.simplefactory.ImageReader;
import zxf.java.pattern.simplefactory.ImageReaderFactory;

public class ImageReaderTest {
    public static void main(String[] args) {
        ImageReader imageReader = ImageReaderFactory.getImageReader(null);
        imageReader.read();
    }
}
