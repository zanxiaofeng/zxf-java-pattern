package zxf.java.pattern.decorator.oop.decorators;

import zxf.java.pattern.decorator.oop.LogDecorator;
import zxf.java.pattern.decorator.oop.LogLevel;

import java.time.LocalDateTime;

public class TimestampLogDecorator extends LogDecorator {
    @Override
    public void log(LogLevel level, String message) throws Exception {
        super.log(level, String.format("%s %s", LocalDateTime.now(), message));
    }
}
