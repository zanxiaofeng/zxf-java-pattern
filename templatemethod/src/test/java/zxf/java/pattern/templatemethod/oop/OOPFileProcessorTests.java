package zxf.java.pattern.templatemethod.oop;

import java.nio.file.Path;
import java.nio.file.Paths;

public class OOPFileProcessorTests {

    public static void use_case1() {
        Path folder = Paths.get("./files");
        OOPFileProcessor fileProcessor = new PDFOOPFileProcessor();

        fileProcessor.process(folder);
    }

    public static void use_case2() {
        Path folder = Paths.get("./files");
        OOPFileProcessor fileProcessor = new WordOOPFileProcessor();

        fileProcessor.process(folder);
    }
}
