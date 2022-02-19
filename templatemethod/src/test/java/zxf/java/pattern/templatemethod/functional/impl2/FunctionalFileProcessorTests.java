package zxf.java.pattern.templatemethod.functional.impl2;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FunctionalFileProcessorTests {
    @Test
    public void use_case1() {
        Path folder = Paths.get("./files");
        FunctionalFileProcessor functionalFileProcessor = new FunctionalFileProcessor();

        functionalFileProcessor.process(folder, FunctionalFileProcessor.Handler.pdf());
    }

    @Test
    public void use_case2() {
        Path folder = Paths.get("./files");
        FunctionalFileProcessor functionalFileProcessor = new FunctionalFileProcessor();

        functionalFileProcessor.process(folder, FunctionalFileProcessor.Handler.word());
    }
}
