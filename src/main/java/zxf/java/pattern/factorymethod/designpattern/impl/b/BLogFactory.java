package zxf.java.pattern.factorymethod.designpattern.impl.b;

import zxf.java.pattern.factorymethod.designpattern.ILogFactory;
import zxf.java.pattern.factorymethod.designpattern.ILogger;
import zxf.java.pattern.factorymethod.designpattern.impl.a.ALogger;

import java.util.Map;

public class BLogFactory implements ILogFactory {
    @Override
    public ILogger logger(Map<String, String> config) {
        System.out.println("BLogFactory::logger");
        return new BLogger();
    }
}
