package zxf.java.pattern.visitor.factory;

import zxf.java.pattern.visitor.Directory;
import zxf.java.pattern.visitor.File;

public class DirectoryFactory {
    public static Directory factory() {
        Directory testDir = new Directory("test");
        Directory test1Dir = new Directory("test-1");
        Directory test2Dir = new Directory("test-2");
        Directory test21Dir = new Directory("test-2-1");
        testDir.add(test1Dir);
        testDir.add(test2Dir);
        test2Dir.add(test21Dir);
        test1Dir.add(new File("test-1_1.pdf"));
        test1Dir.add(new File("test-1_2.docx"));
        test2Dir.add(new File("test-2_1.pdf"));
        test2Dir.add(new File("test-2_2.docx"));
        test2Dir.add(new File("test-2_3.elsx"));
        test21Dir.add(new File("test-2-1_1.pdf"));
        return testDir;
    }
}
