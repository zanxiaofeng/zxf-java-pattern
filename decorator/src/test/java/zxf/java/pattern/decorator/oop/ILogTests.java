package zxf.java.pattern.decorator.oop;

import org.junit.Test;
import zxf.java.pattern.decorator.oop.decorators.ConsoleLogDecorator;
import zxf.java.pattern.decorator.oop.decorators.LevelFilterLogDecorator;
import zxf.java.pattern.decorator.oop.decorators.ThreadLogDecorator;
import zxf.java.pattern.decorator.oop.decorators.TimestampLogDecorator;

import java.nio.file.Paths;

public class ILogTests {
    @Test
    public void use_case1() throws Exception {
        ILog iLog = ILog.create(new ConsoleLog(), new LevelFilterLogDecorator(LogLevel.WARN),
                new ThreadLogDecorator(), new TimestampLogDecorator());
        iLog.log(LogLevel.DEBUG, "oop log message with level DEBUG");
        iLog.log(LogLevel.INFO, "oop log message with level INFO");
        iLog.log(LogLevel.WARN, "oop log message with level WARN");
        iLog.log(LogLevel.ERROR, "oop log message with level ERROR");
    }

    @Test
    public void use_case2() throws Exception {
        ILog iLog = ILog.create(new FileLog(Paths.get("./test.log")), new LevelFilterLogDecorator(LogLevel.WARN),
                new ThreadLogDecorator(), new TimestampLogDecorator(), new ConsoleLogDecorator());
        iLog.log(LogLevel.DEBUG, "oop log message with level DEBUG");
        iLog.log(LogLevel.INFO, "oop log message with level INFO");
        iLog.log(LogLevel.WARN, "oop log message with level WARN");
        iLog.log(LogLevel.ERROR, "oop log message with level ERROR");
    }
}
