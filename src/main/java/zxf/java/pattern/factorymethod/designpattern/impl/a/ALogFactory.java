package zxf.java.pattern.factorymethod.designpattern.impl.a;

import zxf.java.pattern.factorymethod.designpattern.ILogFactory;
import zxf.java.pattern.factorymethod.designpattern.ILogger;

import java.util.Map;

public class ALogFactory implements ILogFactory {
    @Override
    public ILogger logger(Map<String, String> config) {
        System.out.println("ALogFactory::logger");
        return new ALogger();
    }
}
