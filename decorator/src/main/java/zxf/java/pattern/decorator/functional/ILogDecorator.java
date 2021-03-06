package zxf.java.pattern.decorator.functional;

import zxf.java.functional.Currying;

import java.time.LocalDateTime;

public interface ILogDecorator {
    void log(ILog iLog, LogLevel level, String message) throws Exception;

    default ILog decorate(ILog iLog) {
        //return ((level, message) -> log(iLog, level, message));
        // 函数值的Throws与函数类型的Throws不兼容，不能赋值
        return (ILog) Currying.curryingConsumer(iLog, this::log);
    }

    static void console(ILog iLog, LogLevel level, String message) throws Exception {
        System.out.println(message);
        iLog.log(level, message);
    }

    static void timestamp(ILog iLog, LogLevel level, String message) throws Exception {
        iLog.log(level, String.format("%s %s", LocalDateTime.now(), message));
    }

    static void thread(ILog iLog, LogLevel level, String message) throws Exception {
        iLog.log(level, String.format("[Thread: %s] %s", Thread.currentThread().getName(), message));
    }

    static ILogDecorator filterLevel(LogLevel minLevel) {
        return (iLog, level, message) -> {
            if (level.ordinal() >= minLevel.ordinal()) {
                iLog.log(level, String.format("[%s] %s", level, message));
            }
        };
    }
}
