package zxf.java.pattern.templatemethod.oop;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class OOPFileProcessorTests {
    @Test
    public void use_case1() {
        Path folder = Paths.get("./files");
        OOPFileProcessor fileProcessor = new PDFOOPFileProcessor();

        fileProcessor.process(folder);
    }

    @Test
    public void use_case2() {
        Path folder = Paths.get("./files");
        OOPFileProcessor fileProcessor = new WordOOPFileProcessor();

        fileProcessor.process(folder);
    }
}
