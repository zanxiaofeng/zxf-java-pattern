package zxf.java.pattern.decorator.oop;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class FileLog implements ILog {
    private Path logFile;

    public FileLog(Path logFile) {
        this.logFile = logFile;
    }

    @Override
    public void log(LogLevel level, String message) throws Exception {
        Files.write(logFile, (message + "\n").getBytes(StandardCharsets.UTF_8), CREATE, APPEND);
    }
}
