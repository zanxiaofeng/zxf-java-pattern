package zxf.java.pattern.factorymethod.designpattern;

import java.util.Map;

public class FactoryConfig {
    private String factoryClass;
    private Map<String, String> config;

    public String getFactoryClass() {
        return factoryClass;
    }

    public void setFactoryClass(String factoryClass) {
        this.factoryClass = factoryClass;
    }

    public Map<String, String> getConfig() {
        return config;
    }

    public void setConfig(Map<String, String> config) {
        this.config = config;
    }
}
