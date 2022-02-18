package zxf.java.pattern.decorator.oop;

public class LogDecorator implements ILog {
    private ILog innerLog;

    public LogDecorator() {
    }

    public ILog decorate(ILog innerLog) {
        this.innerLog = innerLog;
        return this;
    }

    @Override
    public void log(Integer level, String message) throws Exception {
        this.innerLog.log(level, message);
    }
}
