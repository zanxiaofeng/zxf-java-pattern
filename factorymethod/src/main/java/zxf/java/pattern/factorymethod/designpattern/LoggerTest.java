package zxf.java.pattern.factorymethod.designpattern;

import zxf.java.pattern.factorymethod.logger.ILogFactory;
import zxf.java.pattern.factorymethod.logger.ILogger;

public class LoggerTest {
    public static void main(String[] args) {
        ILogger logger = ILogFactory.getLogger();
        logger.log("hello world!");
    }
}
