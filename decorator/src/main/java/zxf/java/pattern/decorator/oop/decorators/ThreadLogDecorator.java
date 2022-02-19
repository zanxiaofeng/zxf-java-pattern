package zxf.java.pattern.decorator.oop.decorators;

import zxf.java.pattern.decorator.oop.LogDecorator;
import zxf.java.pattern.decorator.oop.LogLevel;

public class ThreadLogDecorator extends LogDecorator {
    @Override
    public void log(LogLevel level, String message) throws Exception {
        super.log(level, String.format("[Thread: %s] %s", Thread.currentThread().getName(), message));
    }
}
