package zxf.java.pattern.decorator.functional;

import java.nio.file.Paths;

public class ILogTests {
    public static void main(String[] args) throws Exception {
        use_case1();
        use_case2();
    }

    public static void use_case1() throws Exception {
        ILog iLog = ILog.create(ILog::consoleLog, ILogDecorator.filterLevel(3),
                ILogDecorator::thread, ILogDecorator::timestamp);
        iLog.log(1, "log message with level 1");
        iLog.log(2, "log message with level 2");
        iLog.log(3, "log message with level 3");
        iLog.log(4, "log message with level 4");
        iLog.log(5, "log message with level 5");
    }

    public static void use_case2() throws Exception {
        ILog iLog = ILog.create(ILog.fileLog(Paths.get("./test.log")), ILogDecorator.filterLevel(3),
                ILogDecorator::thread, ILogDecorator::timestamp, ILogDecorator::console);
        iLog.log(1, "log message with level 1");
        iLog.log(2, "log message with level 2");
        iLog.log(3, "log message with level 3");
        iLog.log(4, "log message with level 4");
        iLog.log(5, "log message with level 5");
    }
}
