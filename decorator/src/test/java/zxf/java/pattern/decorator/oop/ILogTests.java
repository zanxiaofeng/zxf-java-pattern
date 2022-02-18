package zxf.java.pattern.decorator.oop;

import zxf.java.pattern.decorator.oop.decorators.ConsoleLogDecorator;
import zxf.java.pattern.decorator.oop.decorators.LevelFilterLogDecorator;
import zxf.java.pattern.decorator.oop.decorators.ThreadLogDecorator;
import zxf.java.pattern.decorator.oop.decorators.TimestampLogDecorator;

import java.nio.file.Paths;

public class ILogTests {
    public static void main(String[] args) throws Exception {
        use_case1();
        use_case2();
    }

    public static void use_case1() throws Exception {
        ILog iLog = ILog.create(new ConsoleLog(), new LevelFilterLogDecorator(3),
                new ThreadLogDecorator(), new TimestampLogDecorator());
        iLog.log(1, "log message with level 1");
        iLog.log(2, "log message with level 2");
        iLog.log(3, "log message with level 3");
        iLog.log(4, "log message with level 4");
        iLog.log(5, "log message with level 5");
    }

    public static void use_case2() throws Exception {
        ILog iLog = ILog.create(new FileLog(Paths.get("./test.log")), new LevelFilterLogDecorator(3),
                new ThreadLogDecorator(), new TimestampLogDecorator(), new ConsoleLogDecorator());
        iLog.log(1, "log message with level 1");
        iLog.log(2, "log message with level 2");
        iLog.log(3, "log message with level 3");
        iLog.log(4, "log message with level 4");
        iLog.log(5, "log message with level 5");
    }
}
