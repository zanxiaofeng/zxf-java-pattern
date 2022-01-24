package zxf.java.pattern.factorymethod.designpattern.impl.a;

import zxf.java.pattern.factorymethod.designpattern.ILogger;

public class ALogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("ALogger::log." + message);
    }
}
