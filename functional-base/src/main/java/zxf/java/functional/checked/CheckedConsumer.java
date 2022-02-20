package zxf.java.functional.checked;

public interface CheckedConsumer<T> {
    void accept(T t) throws Exception;
}