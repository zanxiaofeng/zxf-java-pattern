package zxf.java.functional.checked;

public interface CheckedBiConsumer<T, U> {
    void accept(T t, U u) throws Exception;
}