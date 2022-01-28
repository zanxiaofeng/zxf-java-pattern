package zxf.java.pattern.simplefactory.readers;

import zxf.java.pattern.simplefactory.ImageReader;

import java.io.InputStream;

public class GIFImageReader implements ImageReader {
    public GIFImageReader(InputStream inputStream) {
        System.out.println("ctor in GIFImageReader");
    }

    @Override
    public void read() {
        System.out.println("read in GIFImageReader");
    }
}
