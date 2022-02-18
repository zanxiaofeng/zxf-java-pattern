package zxf.java.pattern.decorator.oop.decorators;

import zxf.java.pattern.decorator.oop.LogDecorator;

import java.time.LocalDateTime;

public class TimestampLogDecorator extends LogDecorator {
    @Override
    public void log(Integer level, String message) throws Exception {
        super.log(level, String.format("%s %s", LocalDateTime.now(), message));
    }
}
