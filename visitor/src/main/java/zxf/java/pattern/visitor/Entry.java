package zxf.java.pattern.visitor;

import java.util.Iterator;

public abstract class Entry {
    public abstract String getName();

    public Entry add(Entry entry) throws Exception {
        throw new IllegalAccessException();
    }

    public Iterator iterator() throws Exception {
        throw new IllegalAccessException();
    }

    public String toString() {
        return getName();
    }

    public abstract void accept(Visitor v);
}
