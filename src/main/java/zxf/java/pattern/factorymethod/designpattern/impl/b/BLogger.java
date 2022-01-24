package zxf.java.pattern.factorymethod.designpattern.impl.b;

import zxf.java.pattern.factorymethod.designpattern.ILogger;

public class BLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("BLogger::log." + message);
    }
}
