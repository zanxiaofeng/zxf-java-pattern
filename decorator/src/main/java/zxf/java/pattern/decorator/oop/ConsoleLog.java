package zxf.java.pattern.decorator.oop;

public class ConsoleLog implements ILog {
    @Override
    public void log(Integer level, String message) throws Exception {
        System.out.println(message);
    }
}
