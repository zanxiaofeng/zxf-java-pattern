package zxf.java.pattern.factorymethod.designpattern.client;

import zxf.java.pattern.factorymethod.designpattern.ILogFactory;
import zxf.java.pattern.factorymethod.designpattern.ILogger;

public class LoggerTest {
    public static void main(String[] args) {
        ILogger logger = ILogFactory.getLogger();
        logger.log("hello world!");
    }
}
