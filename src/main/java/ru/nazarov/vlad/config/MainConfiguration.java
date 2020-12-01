package ru.nazarov.vlad.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

/**
 * @author Rakhmankulov Ed
 */
@Configuration
@ComponentScan("ru.nazarov.vlad")
public class MainConfiguration {
    @Autowired
    public List<BeanPostProcessor> bpps;


    @Bean
    public String systemName() {
        System.out.println("A : requesting bean systemName");
        return "SimpleWebProject";
    }

    @Bean
    public String areaCode() {
        System.out.println("X : requesting bean areaCode");
        return "ABC_FOO";
    }

    @Bean
    public String systemIdentifier() {
        System.out.println("Z : requesting bean systemIdentifier");
        return areaCode() + "\\" + systemName();
    }

}
