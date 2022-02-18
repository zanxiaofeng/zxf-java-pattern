package zxf.java.pattern.decorator.oop.decorators;

import zxf.java.pattern.decorator.oop.LogDecorator;

public class LevelFilterLogDecorator extends LogDecorator {
    private Integer maxLevel;

    public LevelFilterLogDecorator(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    @Override
    public void log(Integer level, String message) throws Exception {
        if (level <= maxLevel) {
            super.log(level, String.format("[Level: %d] %s", level, message));
        }
    }
}
