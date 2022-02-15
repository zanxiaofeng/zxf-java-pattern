package zxf.java.pattern.factorymethod.logger.b;

import zxf.java.pattern.factorymethod.logger.ILogger;

class BLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("BLogger::log." + message);
    }
}
