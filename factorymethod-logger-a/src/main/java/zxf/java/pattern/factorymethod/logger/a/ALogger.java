package zxf.java.pattern.factorymethod.logger.a;

import zxf.java.pattern.factorymethod.logger.ILogger;

class ALogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("ALogger::log." + message);
    }
}
