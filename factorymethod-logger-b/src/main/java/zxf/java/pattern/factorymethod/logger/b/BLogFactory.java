package zxf.java.pattern.factorymethod.logger.b;


import zxf.java.pattern.factorymethod.logger.ILogFactory;
import zxf.java.pattern.factorymethod.logger.ILogger;

import java.util.Map;

public class BLogFactory implements ILogFactory {
    @Override
    public ILogger logger(Map<String, String> config) {
        System.out.println("BLogFactory::logger");
        return new BLogger();
    }
}
