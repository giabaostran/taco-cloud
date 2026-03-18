package tacos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tacos.services.RedPrinter;
import tacos.services.impl.EnglishRedPrinter;

@Configuration
public class PrinterConfig {
    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }
}
