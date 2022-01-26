package zxf.java.pattern.factorymethod.simplefactory.readers;

import zxf.java.pattern.factorymethod.simplefactory.ImageReader;

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
