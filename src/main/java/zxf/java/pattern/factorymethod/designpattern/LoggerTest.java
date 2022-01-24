package zxf.java.pattern.factorymethod.designpattern;

public class LoggerTest {
    public static void main(String[] args) {
        ILogger logger = ILogFactory.getLogger();
        logger.log("hello world!");
    }
}
