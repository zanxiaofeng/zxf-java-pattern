package zxf.java.pattern.decorator.functional;

import org.junit.Test;

import java.nio.file.Paths;

public class ILogTests {
    @Test
    public void use_case1() throws Exception {
        ILog iLog = ILog.create(ILog::consoleLog, ILogDecorator.filterLevel(LogLevel.WARN),
                ILogDecorator::thread, ILogDecorator::timestamp);
        iLog.log(LogLevel.DEBUG, "functional log message with level DEBUG");
        iLog.log(LogLevel.INFO, "functional log message with level INFO");
        iLog.log(LogLevel.WARN, "functional log message with level WARN");
        iLog.log(LogLevel.ERROR, "functional log message with level ERROR");
    }

    @Test
    public void use_case2() throws Exception {
        ILog iLog = ILog.create(ILog.fileLog(Paths.get("./test.log")), ILogDecorator.filterLevel(LogLevel.WARN),
                ILogDecorator::thread, ILogDecorator::timestamp, ILogDecorator::console);
        iLog.log(LogLevel.DEBUG, "functional log message with level DEBUG");
        iLog.log(LogLevel.INFO, "functional log message with level INFO");
        iLog.log(LogLevel.WARN, "functional log message with level WARN");
        iLog.log(LogLevel.ERROR, "functional log message with level ERROR");
    }
}
