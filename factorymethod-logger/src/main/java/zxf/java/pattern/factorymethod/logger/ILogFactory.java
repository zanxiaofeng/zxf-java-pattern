package zxf.java.pattern.factorymethod.logger;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;

import java.util.Map;

public interface ILogFactory {
    ILogger logger(Map<String, String> config);

    static ILogger getLogger() {
        try {
            URL factoryConfigFile = ILogFactory.class.getClassLoader().getResource("logger.factory");
            FactoryConfig factoryConfig = new ObjectMapper().readValue(factoryConfigFile, FactoryConfig.class);
            Class klass = Class.forName(factoryConfig.getFactoryClass());
            ILogFactory logFactory = (ILogFactory) klass.getDeclaredConstructor().newInstance();
            return logFactory.logger(factoryConfig.getConfig());
        } catch (Exception ex) {
            throw new IllegalStateException("Exception when create logger", ex);
        }
    }
}
