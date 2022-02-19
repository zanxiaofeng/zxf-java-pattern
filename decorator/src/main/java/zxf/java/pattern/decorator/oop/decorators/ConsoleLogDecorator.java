package zxf.java.pattern.decorator.oop.decorators;

import zxf.java.pattern.decorator.oop.LogDecorator;
import zxf.java.pattern.decorator.oop.LogLevel;

public class ConsoleLogDecorator extends LogDecorator {
    @Override
    public void log(LogLevel level, String message) throws Exception {
        System.out.println(message);
        super.log(level, message);
    }
}
