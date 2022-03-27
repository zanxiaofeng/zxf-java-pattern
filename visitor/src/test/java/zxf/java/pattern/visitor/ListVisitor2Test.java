package zxf.java.pattern.visitor;

import org.junit.Test;
import zxf.java.pattern.visitor.factory.DirectoryFactory;

public class ListVisitor2Test {
    @Test
    public void use_case1() {
        Directory testDir = DirectoryFactory.factory();
        new ListVisitor2().visit(testDir);
    }
}
