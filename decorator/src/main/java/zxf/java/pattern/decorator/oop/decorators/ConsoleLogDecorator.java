package zxf.java.pattern.decorator.oop.decorators;

import zxf.java.pattern.decorator.oop.LogDecorator;

public class ConsoleLogDecorator extends LogDecorator {
    @Override
    public void log(Integer level, String message) throws Exception {
        System.out.println(message);
        super.log(level, message);
    }
}
