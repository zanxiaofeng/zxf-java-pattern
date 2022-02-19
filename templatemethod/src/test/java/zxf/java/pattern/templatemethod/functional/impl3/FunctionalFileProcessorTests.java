package zxf.java.pattern.templatemethod.functional.impl3;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FunctionalFileProcessorTests {
    @Test
    public void use_case1() {
        Path folder = Paths.get("./files");
        FunctionalFileProcessor functionalFileProcessor = FunctionalFileProcessor.pdf();

        functionalFileProcessor.process(folder);
    }

    @Test
    public void use_case2() {
        Path folder = Paths.get("./files");
        FunctionalFileProcessor functionalFileProcessor = FunctionalFileProcessor.word();

        functionalFileProcessor.process(folder);
    }
}
