package zxf.java.pattern.decorator.oop.decorators;

import zxf.java.pattern.decorator.oop.LogDecorator;

public class ThreadLogDecorator extends LogDecorator {
    @Override
    public void log(Integer level, String message) throws Exception {
        super.log(level, String.format("[Thread: %s] %s", Thread.currentThread().getName(), message));
    }
}
