package zxf.java.pattern.simplefactory.readers;

import zxf.java.pattern.simplefactory.ImageReader;

import java.io.InputStream;

public class JPEGImageReader implements ImageReader {
    public JPEGImageReader(InputStream inputStream) {
        System.out.println("ctor in JPEGImageReader");
    }

    @Override
    public void read() {
        System.out.println("read in JPEGImageReader");
    }
}
