package zxf.java.pattern.templatemethod.functional.impl2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FunctionalFileProcessorTests {

    public static void use_case1() {
        Path folder = Paths.get("./files");
        FunctionalFileProcessor functionalFileProcessor = new FunctionalFileProcessor();

        functionalFileProcessor.process(folder, FunctionalFileProcessor.Handler.pdf());
    }

    public static void use_case2() {
        Path folder = Paths.get("./files");
        FunctionalFileProcessor functionalFileProcessor = new FunctionalFileProcessor();

        functionalFileProcessor.process(folder, FunctionalFileProcessor.Handler.word());
    }
}
