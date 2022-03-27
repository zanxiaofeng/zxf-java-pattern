package zxf.java.pattern.visitor;

import org.junit.Test;
import zxf.java.pattern.visitor.factory.DirectoryFactory;

public class ListVisitorTest {
    @Test
    public void use_case1() {
        Directory testDir = DirectoryFactory.factory();
        testDir.accept(new ListVisitor());
    }
}
