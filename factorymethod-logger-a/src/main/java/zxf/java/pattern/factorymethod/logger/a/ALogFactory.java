package zxf.java.pattern.factorymethod.logger.a;

import zxf.java.pattern.factorymethod.logger.ILogFactory;
import zxf.java.pattern.factorymethod.logger.ILogger;

import java.util.Map;

public class ALogFactory implements ILogFactory {
    @Override
    public ILogger logger(Map<String, String> config) {
        System.out.println("ALogFactory::logger");
        return new ALogger();
    }
}
