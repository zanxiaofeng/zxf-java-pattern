package zxf.java.pattern.decorator.functional;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public interface ILog {
    void log(Integer level, String message) throws Exception;

    static ILog create(ILog finalLog, ILogDecorator... logDecorators) {
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

    static void consoleLog(Integer level, String message) throws Exception {
        System.out.println(message);
    }

    static ILog fileLog(Path logFile) throws Exception {
        return (level, message) -> {
            Files.write(logFile, (message + "\n").getBytes(StandardCharsets.UTF_8), CREATE, APPEND);
        };
    }
}
