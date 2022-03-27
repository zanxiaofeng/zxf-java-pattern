package zxf.java.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List dir = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Entry add(Entry entry) {
        dir.add(entry);
        return this;
    }
    public Iterator iterator() {
        return dir.iterator();
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}