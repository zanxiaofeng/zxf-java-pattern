package zxf.java.pattern.factorymethod.simplefactory;

import zxf.java.pattern.factorymethod.simplefactory.readers.GIFImageReader;
import zxf.java.pattern.factorymethod.simplefactory.readers.JPEGImageReader;
import zxf.java.pattern.factorymethod.simplefactory.readers.TIFFImageReader;

import java.io.InputStream;

public class ImageReaderFactory {
    public static ImageReader getImageReader(InputStream inputStream) {
        ImageType imageType = determineImageType(inputStream);
        switch (imageType) {
            case GIF:
                return new GIFImageReader(inputStream);
            case JPEG:
                return new JPEGImageReader(inputStream);
            case TIFF:
                return new TIFFImageReader(inputStream);
            default:
                throw new IllegalStateException();
        }
    }

    private static ImageType determineImageType(InputStream inputStream) {
        //TODO
        return ImageType.JPEG;
    }
}
