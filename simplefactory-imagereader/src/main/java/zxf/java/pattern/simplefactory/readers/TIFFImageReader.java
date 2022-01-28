package zxf.java.pattern.simplefactory.readers;

import zxf.java.pattern.simplefactory.ImageReader;

import java.io.InputStream;

public class TIFFImageReader implements ImageReader {
    public TIFFImageReader(InputStream inputStream) {
        System.out.println("ctor in TIFFImageReader");
    }

    @Override
    public void read() {
        System.out.println("read in TIFFImageReader");
    }
}
