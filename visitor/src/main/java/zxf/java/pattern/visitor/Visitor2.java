package zxf.java.pattern.visitor;

import java.util.Iterator;

public class Visitor2 {
    private String currentDir = "";

    public void visit(Entry entry) {
        if (entry instanceof File) {
            visit((File) entry);
            return;
        }
        visit((Directory) entry);
    }

    private void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    private void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            visit(entry);
        }
        currentDir = saveDir;
    }
}
