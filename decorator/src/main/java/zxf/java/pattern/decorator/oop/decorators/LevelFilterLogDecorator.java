package zxf.java.pattern.decorator.oop.decorators;

import zxf.java.pattern.decorator.oop.LogDecorator;
import zxf.java.pattern.decorator.oop.LogLevel;

public class LevelFilterLogDecorator extends LogDecorator {
    private LogLevel minLevel;

    public LevelFilterLogDecorator(LogLevel minLevel) {
        this.minLevel = minLevel;
    }

    @Override
    public void log(LogLevel level, String message) throws Exception {
        if (level.ordinal() >= minLevel.ordinal()) {
            super.log(level, String.format("[%s] %s", level, message));
        }
    }
}


