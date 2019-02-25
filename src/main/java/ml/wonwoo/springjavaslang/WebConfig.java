package ml.wonwoo.springjavaslang;

import com.fasterxml.jackson.databind.Module;
import javaslang.jackson.datatype.JavaslangModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    @Bean
    public Module javaslangModule() {
        return new JavaslangModule();
    }
}
