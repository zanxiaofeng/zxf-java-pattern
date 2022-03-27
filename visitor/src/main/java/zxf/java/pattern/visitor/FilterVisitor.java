package zxf.java.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterVisitor extends Visitor {
    private String currentDir = "";
    private List<String> filteredFiles = new ArrayList<>();
    private String fileExt = "";

    public FilterVisitor(String fileExt) {
        this.fileExt = fileExt;
    }

    public void visit(File file) {
        if (file.getName().endsWith(fileExt)) {
            filteredFiles.add(currentDir + "/" + file);
        }
    }

    public void visit(Directory directory) {
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }

    public List<String> getFilteredFiles() {
        return filteredFiles;
    }
}
