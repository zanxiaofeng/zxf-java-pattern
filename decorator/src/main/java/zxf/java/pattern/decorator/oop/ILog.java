package zxf.java.pattern.decorator.oop;

import java.util.Objects;

public interface ILog {
    void log(LogLevel level, String message) throws Exception;

    static ILog create(ILog finalLog, LogDecorator... logDecorators) {
        Objects.requireNonNull(finalLog);
        if (logDecorators == null || logDecorators.length == 0) {
            return finalLog;
        }

        ILog returnLog = finalLog;
        for (int i = logDecorators.length - 1; i >= 0; i--) {
            returnLog = logDecorators[i].decorate(returnLog);
        }
        return returnLog;
    }
}
