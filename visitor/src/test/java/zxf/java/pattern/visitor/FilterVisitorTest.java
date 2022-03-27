package zxf.java.pattern.visitor;

import org.junit.Test;
import zxf.java.pattern.visitor.factory.DirectoryFactory;

public class FilterVisitorTest {
    @Test
    public void use_case1() {
        Directory testDir = DirectoryFactory.factory();
        FilterVisitor filterVisitor = new FilterVisitor(".pdf");
        testDir.accept(filterVisitor);
        filterVisitor.getFilteredFiles().stream().forEach(System.out::println);
    }
}
